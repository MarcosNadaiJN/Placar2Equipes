/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa.pds1.placar2equipes;

/**
 *
 * @author User
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form testeinterface
     */
    public Tela() {
        initComponents();
    }
    int pontuacaoEquipe1 = 0;
    int pontuacaoEquipe2 = 0;
    
    int QuantidadeRodadasVencidasEquipe1 = 0;
    int QuantidadeRodadasVencidasEquipe2 = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoMais1Equipe1 = new javax.swing.JButton();
        PlacarEquipe1 = new javax.swing.JLabel();
        BotaoResetPontuacao = new javax.swing.JButton();
        BotaoMais1Equipe2 = new javax.swing.JButton();
        PlacarEquipe2 = new javax.swing.JLabel();
        BotaoMais3Equipe1 = new javax.swing.JButton();
        BotaoMenos1Equipe1 = new javax.swing.JButton();
        BotaoMais3Equipe2 = new javax.swing.JButton();
        BotaoMenos1Equipe2 = new javax.swing.JButton();
        NomeEquipe1 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        RodadasVencidasEquipe1 = new javax.swing.JLabel();
        RodadasVencidasEquipe2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoMais1Equipe1.setText("+1 PONTO");
        botaoMais1Equipe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMais1Equipe1ActionPerformed(evt);
            }
        });

        PlacarEquipe1.setText("0");

        BotaoResetPontuacao.setText("RESET");
        BotaoResetPontuacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoResetPontuacaoActionPerformed(evt);
            }
        });

        BotaoMais1Equipe2.setText("+1 PONTO");
        BotaoMais1Equipe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMais1Equipe2ActionPerformed(evt);
            }
        });

        PlacarEquipe2.setText("0");

        BotaoMais3Equipe1.setText("+3 PONTOS");
        BotaoMais3Equipe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMais3Equipe1ActionPerformed(evt);
            }
        });

        BotaoMenos1Equipe1.setText("-1 PONTO");
        BotaoMenos1Equipe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMenos1Equipe1ActionPerformed(evt);
            }
        });

        BotaoMais3Equipe2.setText("+3 PONTOS");
        BotaoMais3Equipe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMais3Equipe2ActionPerformed(evt);
            }
        });

        BotaoMenos1Equipe2.setText("-1 PONTO");
        BotaoMenos1Equipe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMenos1Equipe2ActionPerformed(evt);
            }
        });

        NomeEquipe1.setText("Equipe1");

        jTextField1.setText("Equipe2");

        RodadasVencidasEquipe1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RodadasVencidasEquipe1.setText("RodadasVencidas");

        RodadasVencidasEquipe2.setText("RodadasVencidas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomeEquipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BotaoMenos1Equipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMais1Equipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoMais3Equipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BotaoResetPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotaoMais3Equipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoMenos1Equipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BotaoMais1Equipe2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlacarEquipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(RodadasVencidasEquipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlacarEquipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(RodadasVencidasEquipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NomeEquipe1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RodadasVencidasEquipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RodadasVencidasEquipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlacarEquipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlacarEquipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoMais1Equipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMais1Equipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoMais3Equipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoMais3Equipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BotaoResetPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoMenos1Equipe2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoMenos1Equipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMais1Equipe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMais1Equipe1ActionPerformed
        pontuacaoEquipe1 = pontuacaoEquipe1 + 1;
        PlacarEquipe1.setText(String.valueOf(pontuacaoEquipe1));
    }//GEN-LAST:event_botaoMais1Equipe1ActionPerformed

    private void BotaoResetPontuacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoResetPontuacaoActionPerformed
        pontuacaoEquipe1 = 0;
        pontuacaoEquipe2 = 0;
        PlacarEquipe1.setText(String.valueOf(pontuacaoEquipe1));
        PlacarEquipe2.setText(String.valueOf(pontuacaoEquipe2));
    }//GEN-LAST:event_BotaoResetPontuacaoActionPerformed

    private void BotaoMais1Equipe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMais1Equipe2ActionPerformed
        pontuacaoEquipe2 = pontuacaoEquipe2 + 1;
        PlacarEquipe2.setText(String.valueOf(pontuacaoEquipe2));
    }//GEN-LAST:event_BotaoMais1Equipe2ActionPerformed

    private void BotaoMais3Equipe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMais3Equipe1ActionPerformed
        pontuacaoEquipe1 = pontuacaoEquipe1 + 3;
        PlacarEquipe1.setText(String.valueOf(pontuacaoEquipe1));
    }//GEN-LAST:event_BotaoMais3Equipe1ActionPerformed

    private void BotaoMenos1Equipe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMenos1Equipe1ActionPerformed
        if (pontuacaoEquipe1 > 0) {
            pontuacaoEquipe1 = pontuacaoEquipe1 - 1;
            PlacarEquipe1.setText(String.valueOf(pontuacaoEquipe1));
            }
    }//GEN-LAST:event_BotaoMenos1Equipe1ActionPerformed

    private void BotaoMais3Equipe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMais3Equipe2ActionPerformed
        pontuacaoEquipe2 = pontuacaoEquipe2 + 3;
        PlacarEquipe2.setText(String.valueOf(pontuacaoEquipe2));
    }//GEN-LAST:event_BotaoMais3Equipe2ActionPerformed

    private void BotaoMenos1Equipe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMenos1Equipe2ActionPerformed
        if (pontuacaoEquipe2 > 0) {
            pontuacaoEquipe2 = pontuacaoEquipe2 - 1;
            PlacarEquipe2.setText(String.valueOf(pontuacaoEquipe2));
        }
    }//GEN-LAST:event_BotaoMenos1Equipe2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoMais1Equipe2;
    private javax.swing.JButton BotaoMais3Equipe1;
    private javax.swing.JButton BotaoMais3Equipe2;
    private javax.swing.JButton BotaoMenos1Equipe1;
    private javax.swing.JButton BotaoMenos1Equipe2;
    private javax.swing.JButton BotaoResetPontuacao;
    private javax.swing.JTextField NomeEquipe1;
    private javax.swing.JLabel PlacarEquipe1;
    private javax.swing.JLabel PlacarEquipe2;
    private javax.swing.JLabel RodadasVencidasEquipe1;
    private javax.swing.JLabel RodadasVencidasEquipe2;
    private javax.swing.JButton botaoMais1Equipe1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
