/**
 *
 * @author iagocolodetti
 */

public class FramePrincipal extends javax.swing.JFrame {
    public FramePrincipal() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadeadoicon.png")).getImage());
    }
    
    public FramePrincipal(int rb) {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadeadoicon.png")).getImage());
        switch (rb) {
            case 0:
                rbCXOR.setSelected(true);
                rbCC.setSelected(false);
                rbCRF.setSelected(false);
                rbCM.setSelected(false);
                break;
            case 1:
                rbCXOR.setSelected(false);
                rbCC.setSelected(true);
                rbCRF.setSelected(false);
                rbCM.setSelected(false);
                break;
            case 2:
                rbCXOR.setSelected(false);
                rbCC.setSelected(false);
                rbCRF.setSelected(true);
                rbCM.setSelected(false);
                break;
            case 3:
                rbCXOR.setSelected(false);
                rbCC.setSelected(false);
                rbCRF.setSelected(false);
                rbCM.setSelected(true);
                break;
            default:
                rbCXOR.setSelected(true);
                rbCC.setSelected(false);
                rbCRF.setSelected(false);
                rbCM.setSelected(false);
                break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        rbCXOR = new javax.swing.JRadioButton();
        rbCC = new javax.swing.JRadioButton();
        rbCRF = new javax.swing.JRadioButton();
        rbCM = new javax.swing.JRadioButton();
        btAbrir = new javax.swing.JButton();

        buttonGroup.add(rbCXOR);
        buttonGroup.add(rbCC);
        buttonGroup.add(rbCRF);
        buttonGroup.add(rbCM);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Técnicas Comuns de Criptografia (Java)");
        setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(354, 309));
        setName("FramePrincipal"); // NOI18N
        setResizable(false);

        rbCXOR.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        rbCXOR.setSelected(true);
        rbCXOR.setText("Cifra XOR [Substituição]");
        rbCXOR.setMaximumSize(new java.awt.Dimension(225, 29));
        rbCXOR.setMinimumSize(new java.awt.Dimension(225, 29));
        rbCXOR.setPreferredSize(new java.awt.Dimension(225, 29));

        rbCC.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        rbCC.setText("Cifra de César [Substituição]");
        rbCC.setMaximumSize(new java.awt.Dimension(225, 29));
        rbCC.setMinimumSize(new java.awt.Dimension(225, 29));
        rbCC.setPreferredSize(new java.awt.Dimension(225, 29));

        rbCRF.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        rbCRF.setText("Cifra Rail Fence (Zig Zag) [Transposição]");
        rbCRF.setMaximumSize(new java.awt.Dimension(225, 29));
        rbCRF.setMinimumSize(new java.awt.Dimension(225, 29));
        rbCRF.setPreferredSize(new java.awt.Dimension(225, 29));

        rbCM.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        rbCM.setText("Cifra Matemática");
        rbCM.setMaximumSize(new java.awt.Dimension(225, 29));
        rbCM.setMinimumSize(new java.awt.Dimension(225, 29));
        rbCM.setPreferredSize(new java.awt.Dimension(225, 29));

        btAbrir.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btAbrir.setText("Abrir");
        btAbrir.setPreferredSize(new java.awt.Dimension(118, 30));
        btAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbCRF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbCM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbCXOR, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(rbCXOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbCRF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirActionPerformed
        // TODO add your handling code here:
        if (rbCXOR.isSelected()) {
            FrameCXOR fcxor = new FrameCXOR();
            fcxor.setVisible(true);
            this.setVisible(false);
        }
        else if (rbCC.isSelected()) {
            FrameCC fcc = new FrameCC();
            fcc.setVisible(true);
            this.setVisible(false);
        }
        else if (rbCRF.isSelected()) {
            FrameCRF fcrf = new FrameCRF();
            fcrf.setVisible(true);
            this.setVisible(false);
        }
        else if (rbCM.isSelected()) {
            FrameCM fcm = new FrameCM();
            fcm.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btAbrirActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrir;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton rbCC;
    private javax.swing.JRadioButton rbCM;
    private javax.swing.JRadioButton rbCRF;
    private javax.swing.JRadioButton rbCXOR;
    // End of variables declaration//GEN-END:variables
}
