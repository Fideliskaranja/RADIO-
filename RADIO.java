import javax.swing.ImageIcon; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RADIO extends javax.swing.JFrame {
    ImageIcon imagepig= new ImageIcon("imagepig.jpg");
    ImageIcon imagedog= new ImageIcon("imagedog.jpg");
    ImageIcon imagecat = new ImageIcon("imagecat.jpg");
    ImageIcon imagebird = new ImageIcon("imagebird.jpg");
    ImageIcon imagerabbit = new ImageIcon("imagerabbit.jpg");
    
    public RADIO() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        rpig = new javax.swing.JRadioButton();
        rdog = new javax.swing.JRadioButton();
        rcat = new javax.swing.JRadioButton();
        rbird = new javax.swing.JRadioButton();
        rrabbit = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup3.add(rpig);
        rpig.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rpig.setText("PIG");
        rpig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpigActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdog);
        rdog.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdog.setText("DOG");
        rdog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdogActionPerformed(evt);
            }
        });

        buttonGroup3.add(rcat);
        rcat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rcat.setText("CAT");

        buttonGroup3.add(rbird);
        rbird.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbird.setText("BIRD");
        rbird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbirdActionPerformed(evt);
            }
        });

        buttonGroup3.add(rrabbit);
        rrabbit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rrabbit.setText("RABBIT");
        rrabbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rrabbitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PETS");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("SELECT ANIMAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rpig)
                    .addComponent(rbird)
                    .addComponent(rrabbit)
                    .addComponent(jButton1)
                    .addComponent(rdog)
                    .addComponent(rcat)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)))
                .addContainerGap(808, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(rpig)
                        .addGap(18, 18, 18)
                        .addComponent(rdog)
                        .addGap(21, 21, 21)
                        .addComponent(rcat)
                        .addGap(18, 18, 18)
                        .addComponent(rbird)
                        .addGap(18, 18, 18)
                        .addComponent(rrabbit)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)))
                .addGap(0, 596, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rpigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpigActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_rpigActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbirdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbirdActionPerformed

    private void rrabbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrabbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rrabbitActionPerformed

    private void rdogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdogActionPerformed

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
            java.util.logging.Logger.getLogger(RADIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RADIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RADIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RADIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RADIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rbird;
    private javax.swing.JRadioButton rcat;
    private javax.swing.JRadioButton rdog;
    private javax.swing.JRadioButton rpig;
    private javax.swing.JRadioButton rrabbit;
    // End of variables declaration//GEN-END:variables
}