/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.renamer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class File_Rename extends javax.swing.JFrame {

    /**
     * Creates new form File_Rename
     */
    public File_Rename() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Folder_Label = new javax.swing.JLabel();
        Extention_Label = new javax.swing.JLabel();
        File_Label = new javax.swing.JLabel();
        Folder_Button = new javax.swing.JButton();
        File_Button = new javax.swing.JButton();
        OK_Button = new javax.swing.JButton();
        Cancel_Button = new javax.swing.JButton();
        Folder_Path = new javax.swing.JLabel();
        File_Path = new javax.swing.JLabel();
        Type_Label = new javax.swing.JLabel();
        TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mass File Rename");

        Folder_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Folder_Label.setText("Folder :");

        Extention_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Extention_Label.setText("Extention :");

        File_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        File_Label.setText("File :");

        Folder_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Folder_Button.setText("Select");
        Folder_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Folder_ButtonActionPerformed(evt);
            }
        });

        File_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        File_Button.setText("Select");
        File_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                File_ButtonActionPerformed(evt);
            }
        });

        OK_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OK_Button.setText("OK");
        OK_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK_ButtonActionPerformed(evt);
            }
        });

        Cancel_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cancel_Button.setText("Cancel");
        Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ButtonActionPerformed(evt);
            }
        });

        Folder_Path.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        File_Path.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Type_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Folder_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(File_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Folder_Button)
                                    .addComponent(File_Button)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Extention_Label)
                                .addGap(18, 18, 18)
                                .addComponent(TextField)))
                        .addGap(30, 30, 30)
                        .addComponent(Type_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(File_Path)
                            .addComponent(Folder_Path)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(OK_Button)
                        .addGap(30, 30, 30)
                        .addComponent(Cancel_Button)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Folder_Label)
                    .addComponent(Folder_Button)
                    .addComponent(Folder_Path))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Extention_Label)
                    .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Type_Label))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(File_Label)
                    .addComponent(File_Button)
                    .addComponent(File_Path))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OK_Button)
                    .addComponent(Cancel_Button))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OK_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_ButtonActionPerformed
        try 
        {
            String line;
            File folder[]=new File(Folder_path).listFiles();
            FileReader text=new FileReader(new File(File_path));
            try (BufferedReader br = new BufferedReader(text)) 
            {
                for(int i=0;(line=br.readLine())!=null ; i++)
                {
                    for (File folder1 : folder) 
                    {
                        if ((line+File_type).equals(folder1.getName())) 
                        {
                            File file=new File(Folder_path+"\\#"+(i+1)+" "+line+File_type);
                            folder1.renameTo(file);
                        }
                    }
                }
                JOptionPane.showMessageDialog(null,"All Files are Renamed . " );
            }
        }
        catch (IOException e) 
        {
                JOptionPane.showMessageDialog(null,"Failed to Rename Files ! " );
        }
    }//GEN-LAST:event_OK_ButtonActionPerformed

    private void TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldActionPerformed
        File_type=TextField.getText();
        Type_Label.setText(File_type);
    }//GEN-LAST:event_TextFieldActionPerformed

    private void Folder_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Folder_ButtonActionPerformed
        Thread t=new Thread(   () -> file.renamer.Folder_Chooser.Folder_Chooser());
        t.start();
    }//GEN-LAST:event_Folder_ButtonActionPerformed

    private void File_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_File_ButtonActionPerformed
        Thread t=new Thread(   () -> file.renamer.File_Chooser.File_Chooser());
        t.start();
    }//GEN-LAST:event_File_ButtonActionPerformed

    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Cancel_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(File_Rename.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new File_Rename().setVisible(true);
        });
    }
    
    static String File_type;
    static String File_path;
    static String Folder_path;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JLabel Extention_Label;
    private javax.swing.JButton File_Button;
    private javax.swing.JLabel File_Label;
    static javax.swing.JLabel File_Path;
    private javax.swing.JButton Folder_Button;
    private javax.swing.JLabel Folder_Label;
    static javax.swing.JLabel Folder_Path;
    private javax.swing.JButton OK_Button;
    private javax.swing.JTextField TextField;
    private javax.swing.JLabel Type_Label;
    // End of variables declaration//GEN-END:variables
}
