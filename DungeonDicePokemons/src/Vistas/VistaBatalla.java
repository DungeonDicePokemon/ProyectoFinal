package Vistas;

public class VistaBatalla extends javax.swing.JFrame {

    /**
     * Creates new form VistaBatalla
     */
    public VistaBatalla() {
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

        lblJugador = new javax.swing.JLabel();
        barraVida = new javax.swing.JProgressBar();
        lblAtaque = new javax.swing.JLabel();
        lblMover = new javax.swing.JLabel();
        lblMagia = new javax.swing.JLabel();
        lblTrampa = new javax.swing.JLabel();
        btnAtacar = new javax.swing.JButton();
        btnMover = new javax.swing.JButton();
        cmbxMagia = new javax.swing.JComboBox<>();
        cmbxTrampas = new javax.swing.JComboBox<>();
        btnMagia = new javax.swing.JButton();
        btnTrampa = new javax.swing.JButton();
        btnLanzarDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        lblJugador.setText("<Nombre Jugador>");

        lblAtaque.setText("0");

        lblMover.setText("0");

        lblMagia.setText("0");

        lblTrampa.setText("0");

        btnAtacar.setText("Atacar");

        btnMover.setText("Mover");

        cmbxMagia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lluvia torrencial", "Hierbas venenosas", "Meteorito de fuego" }));

        cmbxTrampas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trampa de osos", "Trampa de ladrones", "Renacer de los muertos" }));

        btnMagia.setText("Activar");

        btnTrampa.setText("Colocar");
        btnTrampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrampaActionPerformed(evt);
            }
        });

        btnLanzarDados.setText("Lanzar Dados");
        btnLanzarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(486, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblAtaque)
                                    .addComponent(lblMagia)
                                    .addComponent(lblTrampa)
                                    .addComponent(lblMover))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbxMagia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbxTrampas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAtacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLanzarDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(barraVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMagia)
                            .addComponent(btnTrampa))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblJugador)
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtacar)
                    .addComponent(lblAtaque))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMover)
                    .addComponent(lblMover))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxMagia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMagia)
                    .addComponent(lblMagia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxTrampas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrampa)
                    .addComponent(lblTrampa))
                .addGap(18, 18, 18)
                .addComponent(btnLanzarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrampaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrampaActionPerformed

    private void btnLanzarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLanzarDadosActionPerformed

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
            java.util.logging.Logger.getLogger(VistaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaBatalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraVida;
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnLanzarDados;
    private javax.swing.JButton btnMagia;
    private javax.swing.JButton btnMover;
    private javax.swing.JButton btnTrampa;
    private javax.swing.JComboBox<String> cmbxMagia;
    private javax.swing.JComboBox<String> cmbxTrampas;
    private javax.swing.JLabel lblAtaque;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblMagia;
    private javax.swing.JLabel lblMover;
    private javax.swing.JLabel lblTrampa;
    // End of variables declaration//GEN-END:variables
}
