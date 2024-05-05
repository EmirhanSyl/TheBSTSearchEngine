package com.thebst.thebstsearchengine.customComponents;

import com.thebst.thebstsearchengine.BinarySearchTree.BSTNode;
import com.thebst.thebstsearchengine.BinarySearchTree.BSTWordData;
import com.thebst.thebstsearchengine.BinarySearchTree.BinarySearchTree;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author emirs & asimtarik
 */
public class BinaryTreeDrawer extends javax.swing.JPanel implements MouseListener, MouseMotionListener {

    private int dragStartX, dragStartY;
    BinarySearchTree<BSTWordData> binarySearchTree;

    private final BSTNode root;
    private final BinaryTreeNodeComponentMap nodeComponentMap;

    private static final int HORIZONTAL_SPACING = 10;
    private static final int VERTICAL_SPACING = 80;

    private boolean isGenerated = false;

    public BinaryTreeDrawer(BinarySearchTree bst) {
        binarySearchTree = bst;
        this.root = binarySearchTree.getRoot();
        this.nodeComponentMap = new BinaryTreeNodeComponentMap();

        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Use a recursive method to draw the tree
        drawNode(g, getWidth() / 2, 30, root, 1);
    }

    private void drawNode(Graphics g, int x, int y, BSTNode node, int depth) {
        if (node == null) {
            return;
        }

        SplitRectangleNode nodeComponent = nodeComponentMap.get(node);
        if (nodeComponent == null) {
            nodeComponent = createNodeComponent(node);
            nodeComponentMap.put(node, nodeComponent);
            add(nodeComponent);
            System.out.println("aaaaaaaaaaaaaaaa");
        } else if (!isGenerated) {
            revalidate();
            repaint();
            setPreferredSize(new Dimension(5000, 5000));
            System.out.println(calculatePreferredSize().toString());
            isGenerated = true;
        }

        Dimension nodeSize = nodeComponent.getPreferredSize();
        nodeComponent.setBounds(x - nodeSize.width / 2, y, nodeSize.width, nodeSize.height);

        // Calculate horizontal spacing based on depth (decrease as depth increases)
        int treeDepth = calculateTreeDepth(root) + 1;
        int horizontalSpacing = HORIZONTAL_SPACING * ((1 << treeDepth) - (1 << depth));

        // Draw left child
        if (node.getLeft() != null) {
            int leftX = x - horizontalSpacing;
            int leftY = y + VERTICAL_SPACING;
            drawNode(g, leftX, leftY, node.getLeft(), depth + 1);

            // Connect current node to left child
            g.drawLine(x, y + nodeSize.height, leftX + nodeSize.width / 2, leftY);
        }

        // Draw right child
        if (node.getRight() != null) {
            int rightX = x + horizontalSpacing;
            int rightY = y + VERTICAL_SPACING;
            drawNode(g, rightX, rightY, node.getRight(), depth + 1);

            // Connect current node to right child
            g.drawLine(x, y + nodeSize.height, rightX - nodeSize.width / 2, rightY);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        int rootDepth = calculateTreeDepth(root);
        return new Dimension(100 * (1 << rootDepth), (rootDepth + 1) * VERTICAL_SPACING);
    }
    
    

    private Dimension calculatePreferredSize() {
        int[] treeDimensions = calculateTreeDimensions(root);
        int treeWidth = treeDimensions[0];
        int treeHeight = treeDimensions[1];
        int panelWidth = treeWidth + 100; // Add some padding for better visualization
        int panelHeight = treeHeight * 150 + 100; // Adjust vertical spacing and add padding

        return new Dimension(panelWidth, panelHeight);
    }

    private int[] calculateTreeDimensions(BSTNode node) {
        if (node == null) {
            return new int[]{0, 0}; // Base case: empty tree dimensions
        }

        // Calculate dimensions of left and right subtrees recursively
        int[] leftDimensions = calculateTreeDimensions(node.getLeft());
        int[] rightDimensions = calculateTreeDimensions(node.getRight());

        // Determine current node dimensions
        int nodeWidth = 1; // Width of current node (count as 1 unit)
        int nodeHeight = Math.max(leftDimensions[1], rightDimensions[1]) + 1; // Height of current node (max height of subtrees + 1)

        // Total width is sum of left subtree width, current node width, and right subtree width
        int totalWidth = leftDimensions[0] + nodeWidth + rightDimensions[0];

        return new int[]{totalWidth, nodeHeight};
    }

    private int calculateTreeDepth(BSTNode node) {
        if (node == null) {return 0;}
        
        int leftDepth = calculateTreeDepth(node.getLeft());
        int rightDepth = calculateTreeDepth(node.getRight());
        return Math.max(leftDepth, rightDepth) + 1;
    }

    private SplitRectangleNode createNodeComponent(BSTNode node) {
        return new SplitRectangleNode(
                ((BSTWordData) node.getData()).getData(),
                "3");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
