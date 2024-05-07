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
        ExecuteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTextArea = new javax.swing.JTextArea();
        FindText = new javax.swing.JTextField();
        FindButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResultArea = new javax.swing.JTextArea();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(ExecuteButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(OrderComboBox, 0, 140, Short.MAX_VALUE)
                                        .addComponent(FindText)))))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(FindButton)
                        .addGap(79, 79, 79)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(OrderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExecuteButton)
                .addGap(88, 88, 88)
                .addComponent(FindText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(FindButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
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

    private void FindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindButtonActionPerformed
       T searchData = FindText.getText();
    BSTNode<T> result = searchRecursiveNode(theBeSTSearchTree.getRoot(), searchData);
    if (result != null) {
        ResultArea.setText("Found: " + result.getData());
    } else {
        ResultArea.setText("Not found.");
    }
    }//GEN-LAST:event_FindButtonActionPerformed

    private void FindTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FindTextActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExecuteButton;
    private javax.swing.JButton FindButton;
    private javax.swing.JTextField FindText;
    private javax.swing.JComboBox<String> OrderComboBox;
    private javax.swing.JTextArea OrderTextArea;
    private javax.swing.JTextArea ResultArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
