/**
 *
 * @author iagocolodetti
 */
        
public class FrameCM extends javax.swing.JFrame {
    public FrameCM() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadeadoicon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTexto = new javax.swing.JLabel();
        lResultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taTexto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taResultado = new javax.swing.JTextArea();
        btInverter = new javax.swing.JButton();
        btLimparTexto = new javax.swing.JButton();
        btLimparResultado = new javax.swing.JButton();
        lChave = new javax.swing.JLabel();
        tfChave = new javax.swing.JTextField();
        btCifrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btDecifrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cifra Matemática");
        setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1001, 650));
        setName("FrameCM"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 670));
        setResizable(false);

        lTexto.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTexto.setText("Texto");

        lResultado.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lResultado.setText("Resultado");

        taTexto.setColumns(20);
        taTexto.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        taTexto.setLineWrap(true);
        taTexto.setRows(5);
        taTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(taTexto);

        taResultado.setBackground(new java.awt.Color(204, 204, 204));
        taResultado.setColumns(20);
        taResultado.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        taResultado.setLineWrap(true);
        taResultado.setRows(5);
        taResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(taResultado);

        btInverter.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btInverter.setText("<<>>");
        btInverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInverterActionPerformed(evt);
            }
        });

        btLimparTexto.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btLimparTexto.setText("Limpar");
        btLimparTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparTextoActionPerformed(evt);
            }
        });

        btLimparResultado.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btLimparResultado.setText("Limpar");
        btLimparResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparResultadoActionPerformed(evt);
            }
        });

        lChave.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lChave.setText("Chave:");

        tfChave.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        tfChave.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btCifrar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btCifrar.setText("Cifrar");
        btCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCifrarActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btDecifrar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btDecifrar.setText("Decifrar");
        btDecifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDecifrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(lTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btInverter, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(lResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btLimparTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimparResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lChave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfChave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(399, 399, 399))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btCifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(btDecifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334))))
            .addGroup(layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lResultado)
                    .addComponent(lTexto))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(btInverter, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLimparResultado)
                    .addComponent(btLimparTexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lChave)
                    .addComponent(tfChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCifrar)
                    .addComponent(btDecifrar))
                .addGap(18, 18, 18)
                .addComponent(btVoltar)
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btInverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInverterActionPerformed
        // TODO add your handling code here:
        String aux = taTexto.getText();
        taTexto.setText(taResultado.getText());
        taResultado.setText(aux);
    }//GEN-LAST:event_btInverterActionPerformed

    private void btLimparTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparTextoActionPerformed
        // TODO add your handling code here:
        taTexto.setText(null);
    }//GEN-LAST:event_btLimparTextoActionPerformed

    private void btLimparResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparResultadoActionPerformed
        // TODO add your handling code here:
        taResultado.setText(null);
    }//GEN-LAST:event_btLimparResultadoActionPerformed

    private void btCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCifrarActionPerformed
        // TODO add your handling code here:
        try {
            Criptografia c = new Criptografia();
            taResultado.setText(c.CifrarM(taTexto.getText(), tfChave.getText()));
        }
        catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCifrarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        FramePrincipal fp = new FramePrincipal(3);
        fp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btDecifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDecifrarActionPerformed
        // TODO add your handling code here:
        try {
            Criptografia c = new Criptografia();
            taResultado.setText(c.DecifrarM(taTexto.getText(), tfChave.getText()));
        }
        catch (java.util.IllegalFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Não foi possível decifrar, texto cifrado adulterado ou a chave está incorreta.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Não foi possível decifrar, texto cifrado adulterado ou a chave está incorreta.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        catch (StringIndexOutOfBoundsException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Não foi possível decifrar, texto cifrado adulterado ou a chave está incorreta.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btDecifrarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCXOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCXOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCXOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCXOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCifrar;
    private javax.swing.JButton btDecifrar;
    private javax.swing.JButton btInverter;
    private javax.swing.JButton btLimparResultado;
    private javax.swing.JButton btLimparTexto;
    private javax.swing.JButton btVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lChave;
    private javax.swing.JLabel lResultado;
    private javax.swing.JLabel lTexto;
    private javax.swing.JTextArea taResultado;
    private javax.swing.JTextArea taTexto;
    private javax.swing.JTextField tfChave;
    // End of variables declaration//GEN-END:variables
}
