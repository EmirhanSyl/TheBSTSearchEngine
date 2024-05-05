package com.thebst.thebstsearchengine.customComponents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author emirs & asimtarik
 */
public class SplitRectangleNode extends JComponent{
    private JLabel leftLabel;
    private JLabel rightLabel;
    private Color outlineColor;

    public SplitRectangleNode(String leftLabelText, String rightLabelText) {
        this(leftLabelText, rightLabelText, Color.BLACK);
        setBorder(new LineBorder(Color.BLACK, 1));
        leftLabel.setBorder(new LineBorder(Color.BLACK, 1));
        rightLabel.setBorder(new LineBorder(Color.BLACK, 1));
    }

    public SplitRectangleNode(String leftLabelText, String rightLabelText, Color outlineColor) {
        this.outlineColor = outlineColor;

        leftLabel = new JLabel(leftLabelText);
        leftLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rightLabel = new JLabel(rightLabelText);
        rightLabel.setHorizontalAlignment(SwingConstants.CENTER);

        setLayout(new GridLayout(1, 2));
        setBorder(new EmptyBorder(10, 10, 10, 10)); 
        add(leftLabel);
        add(rightLabel);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(outlineColor);

        int x = 0;
        int y = 0;
        int width = getWidth();
        int height = getHeight();

        g2d.drawRect(x, y, width - 1, height - 1);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 33);
    }

    public void setLeftLabelText(String text) {
        leftLabel.setText(text);
    }

    public void setRightLabelText(String text) {
        rightLabel.setText(text);
    }

    public String getLeftLabelText() {
        return leftLabel.getText();
    }

    public String getRightLabelText() {
        return rightLabel.getText();
    }

}
