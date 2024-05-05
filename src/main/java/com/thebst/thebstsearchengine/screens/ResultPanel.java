package com.thebst.thebstsearchengine.screens;

import com.thebst.thebstsearchengine.BinarySearchTree.BSTWordData;
import com.thebst.thebstsearchengine.BinarySearchTree.BinarySearchTree;
import com.thebst.thebstsearchengine.MainFrame;
import com.thebst.thebstsearchengine.core.FileFilter;
import com.thebst.thebstsearchengine.customComponents.BinaryTreeDrawer;
import java.awt.CardLayout;
import java.io.File;

/**
 *
 * @author emirs & asimtarik
 */
public class ResultPanel extends javax.swing.JPanel {

    public static String currentFile;
    
    private MainFrame context;
    private final File[] files;
    private final BinarySearchTree<BSTWordData> theBeSTSearchTree = new BinarySearchTree<>();
    private final FileFilter fileFilter = new FileFilter();
    private BinaryTreeDrawer treeDrawer;
    
    public ResultPanel(MainFrame context, File[] filePaths) {
        initComponents();
        this.context = context;
        this.files = filePaths;
        FileContentsToBST();
        generateTree();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        resultDraggablePanel = new javax.swing.JPanel();

        jButton1.setText("Add new File");

        resultDraggablePanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultDraggablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1044, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultDraggablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void FileContentsToBST(){
        for (File file : files) {
            currentFile = file.getName();
            fileFilter.updateBSTWithFile(theBeSTSearchTree, file);
        }
        theBeSTSearchTree.inOrder(theBeSTSearchTree.getRoot());
    }
    
    private void generateTree(){
        treeDrawer = new BinaryTreeDrawer(theBeSTSearchTree);
        resultDraggablePanel.add("tree", treeDrawer);
        CardLayout cl = (CardLayout)resultDraggablePanel.getLayout();
        cl.show(resultDraggablePanel, "tree");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel resultDraggablePanel;
    // End of variables declaration//GEN-END:variables
}
