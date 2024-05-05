package com.thebst.thebstsearchengine.customComponents;

import com.thebst.thebstsearchengine.BinarySearchTree.BSTNode;
import com.thebst.thebstsearchengine.BinarySearchTree.BSTWordData;
import com.thebst.thebstsearchengine.BinarySearchTree.BinarySearchTree;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

/**
 *
 * @author emirs & asimtarik
 */
public class DraggablePanel extends javax.swing.JPanel implements MouseListener, MouseMotionListener {

    private int dragStartX, dragStartY;
    BinaryTreeDrawer drawer;
    BinarySearchTree<BSTWordData> binarySearchTree;

    public DraggablePanel() {
        super();
        initComponents();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        generateNodes();
    }

    public DraggablePanel(BinarySearchTree bst) {
        super();
        initComponents();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        binarySearchTree = bst;
        generateNodes();
    }

    private void generateNodes() {

        if (binarySearchTree == null){
            BinarySearchTree<BSTWordData> dümendentri = new BinarySearchTree<>();
            dümendentri.add(new BSTWordData("bKey1", "DocName"));
            dümendentri.add(new BSTWordData("aKey2", "DocName"));
            dümendentri.add(new BSTWordData("cKey3", "DocName"));
            dümendentri.add(new BSTWordData("dKey3", "DocName"));
            dümendentri.add(new BSTWordData("eKey3", "DocName"));
            
            binarySearchTree = dümendentri;
        }

        drawer = new BinaryTreeDrawer(binarySearchTree);
        add(drawer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
        drawer.revalidate();
        drawer.repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {
        dragStartX = e.getX();
        dragStartY = e.getY();
        setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Calculate new position of the panel
        int deltaX = e.getX() - dragStartX;
        int deltaY = e.getY() - dragStartY;
        int newX = this.getLocation().x + deltaX;
        int newY = this.getLocation().y + deltaY;

        // Move the panel to the new position
        this.setLocation(newX, newY);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Not used, but required by interface
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Not used, but required by interface
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Not used, but required by interface
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Not used, but required by interface
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
