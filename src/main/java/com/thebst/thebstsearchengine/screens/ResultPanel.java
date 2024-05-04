package com.thebst.thebstsearchengine.screens;

import com.thebst.thebstsearchengine.BinarySearchTree.BSTWordData;
import com.thebst.thebstsearchengine.BinarySearchTree.BinarySearchTree;
import com.thebst.thebstsearchengine.MainFrame;
import com.thebst.thebstsearchengine.core.FileFilter;
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
    
    public ResultPanel(MainFrame context, File[] filePaths) {
        initComponents();
        this.context = context;
        this.files = filePaths;
        FileContentsToBST();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeTextLabel = new javax.swing.JLabel();
        resultField = new javax.swing.JTextField();

        welcomeTextLabel.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        welcomeTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeTextLabel.setText("Results");

        resultField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addComponent(welcomeTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public final void FileContentsToBST(){
        for (File file : files) {
            currentFile = file.getName();
            fileFilter.updateBSTWithFile(theBeSTSearchTree, file);
        }
        theBeSTSearchTree.inOrder(theBeSTSearchTree.getRoot());
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField resultField;
    private javax.swing.JLabel welcomeTextLabel;
    // End of variables declaration//GEN-END:variables
}
