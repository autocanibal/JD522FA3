/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.mondemkhize.JD522FA3;

/**
 *
 * @author monde
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form MultiThread
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        syncBtn = new javax.swing.JButton();
        atomicBtn = new javax.swing.JButton();
        ctuTimerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        syncBtn.setText("Synchronized Method");
        syncBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syncBtnActionPerformed(evt);
            }
        });

        atomicBtn.setText("AtomicInteger Method");
        atomicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atomicBtnActionPerformed(evt);
            }
        });

        ctuTimerBtn.setText("Question 2");
        ctuTimerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctuTimerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atomicBtn)
                    .addComponent(syncBtn))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ctuTimerBtn)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(syncBtn)
                .addGap(33, 33, 33)
                .addComponent(atomicBtn)
                .addGap(29, 29, 29)
                .addComponent(ctuTimerBtn)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void syncBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syncBtnActionPerformed
        // TODO add your handling code here:
        String sender = "sync";
        CounterForm sync = new CounterForm();
        sync.sender = sender;
        sync.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_syncBtnActionPerformed

    private void atomicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atomicBtnActionPerformed
        // TODO add your handling code here:
        String sender = "atomic";
        CounterForm sync = new CounterForm();
        sync.sender = sender;
        sync.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atomicBtnActionPerformed

    private void ctuTimerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctuTimerBtnActionPerformed
        // TODO add your handling code here:
        CTUTimer time = new CTUTimer();
        time.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ctuTimerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atomicBtn;
    private javax.swing.JButton ctuTimerBtn;
    private javax.swing.JButton syncBtn;
    // End of variables declaration//GEN-END:variables
}
