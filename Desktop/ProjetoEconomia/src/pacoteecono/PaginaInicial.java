/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteecono;

/**
 *
 * @author camil
 */
public class PaginaInicial extends javax.swing.JFrame {

    /**
     * Creates new form PaginaInicial
     */
    public PaginaInicial() {
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

        jLabel1 = new javax.swing.JLabel();
        btn_cambio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_lucro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_demanda = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_Elast = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_ElastC = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_ElastP = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_ElastR = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btn_pib = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("Software de Economia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 484, 26));

        btn_cambio.setText("Entrar");
        btn_cambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cambioMouseClicked(evt);
            }
        });
        btn_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Câmbio e Investimentos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 21));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Custo, Receita e Lucro");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        btn_lucro.setText("Entrar");
        btn_lucro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_lucroMouseClicked(evt);
            }
        });
        btn_lucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lucroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_lucro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Demanda");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 60, 21));

        btn_demanda.setText("Entrar");
        btn_demanda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_demandaMouseClicked(evt);
            }
        });
        btn_demanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_demandaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_demanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Elasticidade");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, 21));

        btn_Elast.setText("Entrar");
        btn_Elast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ElastMouseClicked(evt);
            }
        });
        btn_Elast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ElastActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Elast, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Elasticidade Cruzada");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, 21));

        btn_ElastC.setText("Entrar");
        btn_ElastC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ElastCMouseClicked(evt);
            }
        });
        btn_ElastC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ElastCActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ElastC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Elasticidade Preço");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, 21));

        btn_ElastP.setText("Entrar");
        btn_ElastP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ElastPMouseClicked(evt);
            }
        });
        btn_ElastP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ElastPActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ElastP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Elasticidade Renda");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, 21));

        btn_ElastR.setText("Entrar");
        btn_ElastR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ElastRMouseClicked(evt);
            }
        });
        btn_ElastR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ElastRActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ElastR, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("PIB");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btn_pib.setText("Entrar");
        btn_pib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pibMouseClicked(evt);
            }
        });
        btn_pib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pibActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pib, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambioMouseClicked
         Frm_cambio frm_cambio = new Frm_cambio();
         frm_cambio.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btn_cambioMouseClicked

    private void btn_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cambioActionPerformed

    private void btn_lucroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lucroMouseClicked
         Frm_Lucro frm_Lucro = new Frm_Lucro();
         frm_Lucro.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btn_lucroMouseClicked

    private void btn_lucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lucroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_lucroActionPerformed

    private void btn_ElastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ElastMouseClicked
        // TODO add your handling code here:
         Frm_elasticidade frm_elasticidade = new Frm_elasticidade();
         frm_elasticidade.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btn_ElastMouseClicked

    private void btn_ElastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ElastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ElastActionPerformed

    private void btn_ElastCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ElastCMouseClicked
        // TODO add your handling code here:
         Frm_elasticidadecruzada frm_elasticidadecruzada = new Frm_elasticidadecruzada();
         frm_elasticidadecruzada.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btn_ElastCMouseClicked

    private void btn_ElastCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ElastCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ElastCActionPerformed

    private void btn_ElastPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ElastPMouseClicked
        // TODO add your handling code here:
         Frm_elasticidadepreco frm_elasticidadepreco = new Frm_elasticidadepreco();
         frm_elasticidadepreco.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btn_ElastPMouseClicked

    private void btn_ElastPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ElastPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ElastPActionPerformed

    private void btn_demandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_demandaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_demandaActionPerformed

    private void btn_demandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_demandaMouseClicked
        // TODO add your handling code here:
        Frm_demanda frm_demanda = new Frm_demanda();
         frm_demanda.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btn_demandaMouseClicked

    private void btn_ElastRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ElastRMouseClicked
        // TODO add your handling code here:
        Frm_elasticidaderenda frm_elasticidaderenda = new Frm_elasticidaderenda();
         frm_elasticidaderenda.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btn_ElastRMouseClicked

    private void btn_ElastRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ElastRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ElastRActionPerformed

    private void btn_pibMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pibMouseClicked
        Frm_PIB frm_PIB = new Frm_PIB();
         frm_PIB.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btn_pibMouseClicked

    private void btn_pibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pibActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_btn_pibActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Elast;
    private javax.swing.JButton btn_ElastC;
    private javax.swing.JButton btn_ElastP;
    private javax.swing.JButton btn_ElastR;
    private javax.swing.JButton btn_cambio;
    private javax.swing.JButton btn_demanda;
    private javax.swing.JButton btn_lucro;
    private javax.swing.JButton btn_pib;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
