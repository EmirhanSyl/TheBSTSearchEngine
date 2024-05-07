package com.thebst.thebstsearchengine.screens;

import com.thebst.thebstsearchengine.MainFrame;
import java.awt.Color;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
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
        setLabelColors();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseFileBtn = new javax.swing.JButton();
        TheLabel = new javax.swing.JLabel();
        BSTLabel = new javax.swing.JLabel();
        WelcomeLabel = new javax.swing.JLabel();
        EngineLabel = new javax.swing.JLabel();
        SearchLabel = new javax.swing.JLabel();
        ToLabel = new javax.swing.JLabel();

        chooseFileBtn.setFont(new java.awt.Font("Eras Demi ITC", 1, 24)); // NOI18N
        chooseFileBtn.setText("Choose files");
        chooseFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileBtnActionPerformed(evt);
            }
        });

        TheLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 18)); // NOI18N
        TheLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TheLabel.setText("THE");

        BSTLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 18)); // NOI18N
        BSTLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BSTLabel.setText("BST");

        WelcomeLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 18)); // NOI18N
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel.setText("WELCOME");

        EngineLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 18)); // NOI18N
        EngineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EngineLabel.setText("ENGINE");

        SearchLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 18)); // NOI18N
        SearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchLabel.setText("SEARCH");

        ToLabel.setFont(new java.awt.Font("Bodoni MT Black", 3, 18)); // NOI18N
        ToLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ToLabel.setText("TO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(525, 525, 525)
                        .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(ToLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EngineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TheLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BSTLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                .addComponent(chooseFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ToLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(TheLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BSTLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EngineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(chooseFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chooseFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileBtnActionPerformed

        File[] selectedFiles = selectHTMLFiles();
        if (selectedFiles.length > 0) {
            context.setPage(new Results(context, selectedFiles));
        }
    }//GEN-LAST:event_chooseFileBtnActionPerformed

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
     private void setLabelColors() {
        Color initialColor = new Color(255, 140, 0); // Initial blue color (RGB: 0, 0, 255)
        Color initialForegroundColor = new Color(245, 245, 220);
        JLabel[] labels = {WelcomeLabel, ToLabel, TheLabel, BSTLabel, SearchLabel, EngineLabel};
        for (int i = 0; i < labels.length; i++) {
            int darkeningFactor = i * 15; // Adjust the darkening factor to suit your preference
            int red = Math.max(initialColor.getRed() - darkeningFactor, 0);
            int green = Math.max(initialColor.getGreen() - darkeningFactor, 0);
            int blue = Math.max(initialColor.getBlue() - darkeningFactor, 0);
            Color darkerColor = new Color(red, green, blue);
            labels[i].setBackground(darkerColor);
            labels[i].setOpaque(true);
            
               int lighteningFactor = i * 10; // Adjust the lightening factor to suit your preference
            int redForeground = Math.min(initialForegroundColor.getRed() + lighteningFactor, 255);
            int greenForeground = Math.min(initialForegroundColor.getGreen() + lighteningFactor, 255);
            int blueForeground = Math.min(initialForegroundColor.getBlue() + lighteningFactor, 255);
            Color lighterForegroundColor = new Color(redForeground, greenForeground, blueForeground);
            labels[i].setForeground(lighterForegroundColor);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BSTLabel;
    private javax.swing.JLabel EngineLabel;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JLabel TheLabel;
    private javax.swing.JLabel ToLabel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JButton chooseFileBtn;
    // End of variables declaration//GEN-END:variables
}
