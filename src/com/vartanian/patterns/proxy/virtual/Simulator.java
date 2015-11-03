package com.vartanian.patterns.proxy.virtual;

import com.vartanian.patterns.proxy.virtual.components.ImageComponent;
import com.vartanian.patterns.proxy.virtual.proxys.ImageProxy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class Simulator {

    private ImageComponent imageComponent;
    private JMenuBar menuBar;
    private JMenu menu;
    private JFrame frame = new JFrame("CD Cover Viewer");

    private Hashtable cds = new Hashtable();

    public static void main(String[] args) throws Exception {
        Simulator simulator = new Simulator();
    }

    public Simulator() throws Exception {

        cds.put("Ambient: Music for Airports", "http://images.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
        cds.put("Budha Bar", "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        cds.put("Ima", "http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");

        URL initialUrl = new URL((String) cds.get("Ambient: Music for Airports"));

        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        Enumeration elements = cds.elements();
        while (elements.hasMoreElements()){
            String element = (String) elements.nextElement();
            JMenuItem menuItem = new JMenuItem(element);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageComponent.setIcon(new ImageProxy(getCdUrl(e.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        Icon imageProxy = new ImageProxy(initialUrl);
        imageComponent = new ImageComponent(imageProxy);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

    }

    private URL getCdUrl(String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
