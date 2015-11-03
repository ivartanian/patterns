package com.vartanian.patterns.proxy.virtual.components;

import javax.swing.*;
import java.awt.*;

/**
 * Created by super on 11/3/15.
 */
public class ImageComponent extends JComponent {

    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int iconWidth = icon.getIconWidth();
        int iconHeight = icon.getIconHeight();
        int x = (800 - iconWidth)/2;
        int y = (600 - iconHeight)/2;
        icon.paintIcon(this, g, x, y);
    }
}
