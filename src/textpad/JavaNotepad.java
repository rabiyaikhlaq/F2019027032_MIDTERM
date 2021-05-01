/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textpad;
import java.awt.Color;
import static java.awt.Color.PINK;
import java.awt.FileDialog;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.TextEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class JavaNotepad extends javax.swing.JFrame {

     String programName ="Notepad";
     
        String filename ;
          String holdText;
            String fn ;
              String dir;
              boolean textchanged =false;
              String fileName;
              java.awt.datatransfer.Clipboard clip= getToolkit().getSystemClipboard();
    private boolean textChanged;
    private String pragrameName;
              
    public JavaNotepad() {
        initComponents();
        setTitle(programName);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogColor = new javax.swing.JDialog();
        colorChooser = new javax.swing.JColorChooser();
        textArea = new java.awt.TextArea();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newMenu = new javax.swing.JMenuItem();
        openMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        saveasMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        editBar = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenuItem();
        cutText = new javax.swing.JMenuItem();
        copyText = new javax.swing.JMenuItem();
        pasteText = new javax.swing.JMenuItem();

        javax.swing.GroupLayout dialogColorLayout = new javax.swing.GroupLayout(dialogColor.getContentPane());
        dialogColor.getContentPane().setLayout(dialogColorLayout);
        dialogColorLayout.setHorizontalGroup(
            dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        dialogColorLayout.setVerticalGroup(
            dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogColorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBar.setForeground(new java.awt.Color(255, 153, 153));

        fileMenu.setText("File");

        newMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\New-icon.png")); // NOI18N
        newMenu.setText("New");
        newMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });
        fileMenu.add(newMenu);

        openMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\open-file-icon.png")); // NOI18N
        openMenu.setText("Open");
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        fileMenu.add(openMenu);

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\floppy-icon.png")); // NOI18N
        saveMenu.setText("Save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenu);

        saveasMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveasMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\Save-icon.png")); // NOI18N
        saveasMenu.setText("Save As");
        saveasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveasMenuActionPerformed(evt);
            }
        });
        fileMenu.add(saveasMenu);

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\cancel-icon.png")); // NOI18N
        exitMenu.setText("exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenu);

        menuBar.add(fileMenu);

        editBar.setText("Edit");

        editMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\Actions-format-text-color-icon.png")); // NOI18N
        editMenu.setText("Text Color");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });
        editBar.add(editMenu);

        cutText.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\cut-icon.png")); // NOI18N
        cutText.setText("Cut");
        cutText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutTextActionPerformed(evt);
            }
        });
        editBar.add(cutText);

        copyText.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\Editing-Copy-icon.png")); // NOI18N
        copyText.setText("Copy");
        copyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTextActionPerformed(evt);
            }
        });
        editBar.add(copyText);

        pasteText.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\OneDrive\\Desktop\\paste-icon.png")); // NOI18N
        pasteText.setText("Paste");
        pasteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteTextActionPerformed(evt);
            }
        });
        editBar.add(pasteText);

        menuBar.add(editBar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveasMenuActionPerformed
        saveAs();
    }//GEN-LAST:event_saveasMenuActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        if (filename.equals("")) {
      saveAs();
} else {
      save(filename);
}
    }//GEN-LAST:event_saveMenuActionPerformed

    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuActionPerformed
       newFile();
    }//GEN-LAST:event_newMenuActionPerformed

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuActionPerformed
       checkFile();
    }//GEN-LAST:event_openMenuActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
       exit();
    }//GEN-LAST:event_exitMenuActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
         
        Color clr=colorChooser.showDialog(null,"color Dialog",PINK);
        textArea.setForeground(clr);
    }//GEN-LAST:event_editMenuActionPerformed

    private void cutTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutTextActionPerformed
       String cutString= textArea.getSelectedText();
       StringSelection cutSelection = new StringSelection(cutString);
       clip.setContents(cutSelection,cutSelection);
       textArea.replaceRange("",textArea.getSelectionStart(),textArea.getSelectionEnd());
       
       
       
    }//GEN-LAST:event_cutTextActionPerformed

    private void copyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTextActionPerformed
        String copyText= textArea.getSelectedText();
        StringSelection copySelection = new StringSelection(copyText);
        clip.setContents(copySelection, copySelection);
    }//GEN-LAST:event_copyTextActionPerformed

    private void pasteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteTextActionPerformed
          try{
              Transferable pasteText = clip.getContents(JavaNotepad.this);
              String sel= (String) pasteText.getTransferData(DataFlavor.stringFlavor);
              textArea.replaceRange(sel, textArea.getSelectionStart(), textArea.getSelectionEnd());
              
              
          }
          catch(Exception e){
              
          }
    }//GEN-LAST:event_pasteTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaNotepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JMenuItem copyText;
    private javax.swing.JMenuItem cutText;
    private javax.swing.JDialog dialogColor;
    private javax.swing.JMenu editBar;
    private javax.swing.JMenuItem editMenu;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newMenu;
    private javax.swing.JMenuItem openMenu;
    private javax.swing.JMenuItem pasteText;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JMenuItem saveasMenu;
    private java.awt.TextArea textArea;
    // End of variables declaration//GEN-END:variables

    private void save(String filename) {
 
      setTitle(pragrameName + " " + filename);
      try {
          FileWriter out;
          out = new FileWriter(fn);
          out.write(textArea.getText());
          out.close();
      } catch (Exception e) {
          System.out.println("Error :" + e);
      }
          textChanged = false;
          saveMenu.setEnabled(false);
      }
 
private void saveAs() {
       FileDialog fd = new FileDialog(JavaNotepad.this, "save", FileDialog.SAVE);
       fd.show();
 
       if (fd.getFile() != null) {
            fn = fd.getFile();
            dir = fd.getDirectory();
            filename = dir + fn + ".txt";
            setTitle(filename);
            try {
                  DataOutputStream d= new DataOutputStream(new FileOutputStream(filename));
                 holdText = textArea.getText();
                 BufferedReader br = new BufferedReader(new StringReader(holdText));
                 while ((holdText = br.readLine()) != null) {
                        d.writeBytes(holdText + "\r\n");
                        d.close();
                 }
            } catch (Exception e) {
 
               System.out.println("File note Found");
            }
            textArea.requestFocus();
            save(filename);
      }
}
private void textAreaTextValueChanged(java.awt.event.TextEvent evt) {                                          
        if(TextEvent.TEXT_VALUE_CHANGED!=0)
        {      textChanged = false;
if(!textChanged)
                setTitle("*" +getTitle());
            textChanged=true;
            saveMenu.setEnabled(true);
        }
    }   

    private void newFile() {
        if(textArea.getText().length() <1){
        setTitle(programName);
        textArea.setText("");
        textChanged=false;}
        else if(!textChanged){
        setTitle(programName);
        textArea.setText("");
        textChanged=false;}
        else{
            int confirm =JOptionPane.showConfirmDialog(null,"Do you wanna save this file before opening new one");
            if (confirm==JOptionPane.YES_OPTION){
                if("".equals(filename)){
                    saveAs();
                }
                else{
                    save(filename);
                }
                setTitle(programName);
                filename="";
                textArea.setText("");
                textChanged=false;
        }
            else if(confirm==JOptionPane.NO_OPTION){
                setTitle(programName);
                textArea.setText("");
                textChanged=false;
            }
        }}

    private void checkFile() {
        FileDialog fileDialog =new FileDialog(JavaNotepad.this,"open File",FileDialog.LOAD);
        fileDialog.setVisible(true);
        if(fileDialog.getFile()!=null){
        filename=fileDialog.getDirectory()+fileDialog.getFile();
        setTitle(filename);
        
    }
       StringBuffer sb = new StringBuffer();
       BufferedReader br;
       try {
            br = new BufferedReader(new FileReader(filename));
            String s = "";
            while ((s = br.readLine()) != null) {
                 sb.append(s + "\n");
            }
            textArea.setText(sb.toString());
            br.close();
     } catch (FileNotFoundException ex) {
            System.out.println(ex);
     } catch (IOException ex) {
            System.out.println(ex);
     }
    }

    private void exit() {
        if ("".equals(textArea.getText())) {
      System.exit(0);
} else if (!textChanged) {
      System.exit(0);
} else {
      int confirm = JOptionPane.showConfirmDialog(this,"Do you want to save before exit.?");
      if (confirm == JOptionPane.YES_OPTION) {
            if (filename.equals("")) {
                   saveAs();
            } else {
                   save(filename);
            }
       }
       if (confirm == JOptionPane.NO_OPTION) {
            System.exit(0);
       }
}
    }

    
}
    

