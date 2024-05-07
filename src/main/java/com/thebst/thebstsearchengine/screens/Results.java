/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.thebst.thebstsearchengine.screens;

import com.thebst.thebstsearchengine.BinarySearchTree.BSTNode;
import com.thebst.thebstsearchengine.BinarySearchTree.BSTWordData;
import com.thebst.thebstsearchengine.BinarySearchTree.BinarySearchTree;
import com.thebst.thebstsearchengine.MainFrame;
import com.thebst.thebstsearchengine.core.FileFilter;
import java.io.File;


/**
 *
 * @author Lenovo
 */
public class Results extends javax.swing.JPanel {
    
    
    public static String currentFile;
    
    private MainFrame context;
    private final File[] files;
    private final FileFilter fileFilter = new FileFilter();
    private final BinarySearchTree<BSTWordData> theBeSTSearchTree = new BinarySearchTree<>();

   
    public Results(MainFrame context, File[] filePaths) {
        initComponents();
        this.context = context;
        this.files = filePaths;
        FileContentsToBST();
    }

    private void FileContentsToBST(){
        for (File file : files) {
            currentFile = file.getName();
            fileFilter.updateBSTWithFile(theBeSTSearchTree, file);
        }
        theBeSTSearchTree.inOrder(theBeSTSearchTree.getRoot());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OrderComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTextArea = new javax.swing.JTextArea();
        FindText = new javax.swing.JTextField();
        FindButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResultArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        OrderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "InOrder", "PostOrder", "PreOrder" }));
        OrderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderComboBoxActionPerformed(evt);
            }
        });

        OrderTextArea.setColumns(20);
        OrderTextArea.setRows(5);
        jScrollPane1.setViewportView(OrderTextArea);

        FindText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindTextActionPerformed(evt);
            }
        });

        FindButton.setText("Find");
        FindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindButtonActionPerformed(evt);
            }
        });

        ResultArea.setColumns(20);
        ResultArea.setRows(5);
        jScrollPane2.setViewportView(ResultArea);

        jLabel1.setText("Choose an Order Type");

        jLabel2.setText("Search The Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(FindButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(FindText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OrderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(OrderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(FindText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FindButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OrderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderComboBoxActionPerformed
        String selectedOption = (String) OrderComboBox.getSelectedItem();
    String traversalResult = "";
    
    if (selectedOption.equals("InOrder")) {
        traversalResult = theBeSTSearchTree.inOrder(theBeSTSearchTree.getRoot());
        
    } else if (selectedOption.equals("PostOrder")) {
        traversalResult = theBeSTSearchTree.postOrder(theBeSTSearchTree.getRoot());
        
        
    } else if (selectedOption.equals("PreOrder")) {
        traversalResult = theBeSTSearchTree.preOrder(theBeSTSearchTree.getRoot());
    }
    
    traversalResult = traversalResult.replaceAll("Key: ", "\nKey: ");
    OrderTextArea.setText(traversalResult);
    }//GEN-LAST:event_OrderComboBoxActionPerformed

    private void FindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindButtonActionPerformed
      String searchDataStr = FindText.getText();
  BSTWordData searchData = new BSTWordData(searchDataStr,currentFile);
    BSTNode<BSTWordData> result = theBeSTSearchTree.searchRecursiveNode(theBeSTSearchTree.getRoot(), searchData);
    if (result != null) {
        ResultArea.setText((""+result.getData()).replaceAll("Found in: ","\nFound in: "));
    } else {
        ResultArea.setText("Not found.");
    }
    }//GEN-LAST:event_FindButtonActionPerformed

    private void FindTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FindTextActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FindButton;
    private javax.swing.JTextField FindText;
    private javax.swing.JComboBox<String> OrderComboBox;
    private javax.swing.JTextArea OrderTextArea;
    private javax.swing.JTextArea ResultArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
