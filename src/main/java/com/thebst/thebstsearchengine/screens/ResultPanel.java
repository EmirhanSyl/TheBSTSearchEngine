package com.thebst.thebstsearchengine.screens;

import com.thebst.thebstsearchengine.MainFrame;
import com.thebst.thebstsearchengine.core.FileFilter;
import java.io.File;

/**
 *
 * @author emirs & asimtarik
 */
public class ResultPanel extends javax.swing.JPanel {

    MainFrame context;
    File[] files;
    
    public ResultPanel(MainFrame context, File[] filePaths) {
        initComponents();
        this.context = context;
        this.files = filePaths;
        printFileContents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeTextLabel = new javax.swing.JLabel();

        welcomeTextLabel.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        welcomeTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeTextLabel.setText("Results");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(471, Short.MAX_VALUE)
                .addComponent(welcomeTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(469, 469, 469))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(welcomeTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void printFileContents(){
        for (File file : files) {
            FileFilter fileFilter = new FileFilter(file);
            System.out.println("File Name: " + fileFilter.getFileName());
            System.out.println("--------");
            for (String word : fileFilter.filterFile()) {
                System.out.println(word);
            }
            System.out.println("--------");
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel welcomeTextLabel;
    // End of variables declaration//GEN-END:variables
}
