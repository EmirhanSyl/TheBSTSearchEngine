/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.thebst.thebstsearchengine.screens;

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
        ExecuteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTextArea = new javax.swing.JTextArea();

        OrderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "InOrder", "PostOrder", "PreOrder" }));
        OrderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderComboBoxActionPerformed(evt);
            }
        });

        ExecuteButton.setText("Execute");
        ExecuteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteButtonActionPerformed(evt);
            }
        });

        OrderTextArea.setColumns(20);
        OrderTextArea.setRows(5);
        jScrollPane1.setViewportView(OrderTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(OrderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(ExecuteButton)))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(OrderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(ExecuteButton)
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OrderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderComboBoxActionPerformed
        
    }//GEN-LAST:event_OrderComboBoxActionPerformed

    private void ExecuteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteButtonActionPerformed
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
    }//GEN-LAST:event_ExecuteButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExecuteButton;
    private javax.swing.JComboBox<String> OrderComboBox;
    private javax.swing.JTextArea OrderTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
