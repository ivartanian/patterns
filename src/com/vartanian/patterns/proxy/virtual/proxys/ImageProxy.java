package com.vartanian.patterns.proxy.virtual.proxys;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by super on 11/3/15.
 */
public class ImageProxy implements Icon{

    private ImageIcon imageIcon;
    private URL imageUrl;
    private Thread retrievalThread;
    private boolean retrieving = false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null){
            imageIcon.paintIcon(c, g, x, y);
        }else {
            g.drawString("Loading CD cover, please wait...", x+300, y+190);
            if (!retrieving){
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            imageIcon = new ImageIcon(imageUrl, "CD cover");
                            c.repaint();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null){
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null){
            return imageIcon.getIconHeight();
        }
        return 600;
    }
}
