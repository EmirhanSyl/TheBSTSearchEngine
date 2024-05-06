package com.thebst.thebstsearchengine.screens;

import com.thebst.thebstsearchengine.MainFrame;
import com.thebst.thebstsearchengine.customComponents.DraggablePanel;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author emirs & asimtarik
 */
public class WelcomePanel extends javax.swing.JPanel {

    MainFrame context;

    public WelcomePanel(MainFrame context) {
        initComponents();
        this.context = context;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeTextLabel = new javax.swing.JLabel();
        chooseFileBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        welcomeTextLabel.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        welcomeTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeTextLabel.setText("Welcome");

        chooseFileBtn.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        chooseFileBtn.setText("Choose files");
        chooseFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Go To Draggable");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(481, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(welcomeTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addComponent(chooseFileBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(420, 420, 420))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(513, 513, 513))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(welcomeTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(chooseFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap(171, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chooseFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileBtnActionPerformed

        File[] selectedFiles = selectHTMLFiles();
        if (selectedFiles.length > 0) {
            context.setPage(new Results(context, selectedFiles));
        }
    }//GEN-LAST:event_chooseFileBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        context.setPage(new DraggablePanel());
    }//GEN-LAST:event_jButton1ActionPerformed

    public File[] selectHTMLFiles() {
        File[] result;

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose HTML Files");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setMultiSelectionEnabled(true);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("HTML Files", "html", "htm");
        fileChooser.setFileFilter(filter);

        int option = fileChooser.showOpenDialog(null);

        if (option == JFileChooser.APPROVE_OPTION) {
            result = fileChooser.getSelectedFiles();
        } else {
            System.out.println("File selection cancelled.");
            result = new File[0];
        }
        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseFileBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel welcomeTextLabel;
    // End of variables declaration//GEN-END:variables
}
