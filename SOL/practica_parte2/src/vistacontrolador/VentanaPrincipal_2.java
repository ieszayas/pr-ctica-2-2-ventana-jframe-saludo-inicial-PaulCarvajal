/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistacontrolador;

import javax.swing.JOptionPane;

/**
 *
 * @author Paul
 */
public class VentanaPrincipal_2 extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal_2
     */
    public VentanaPrincipal_2() {
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

        Imagen_Saludo = new javax.swing.JLabel();
        Campo_Nombre = new javax.swing.JTextField();
        Campo_Apellido = new javax.swing.JTextField();
        Texto_Nombre = new javax.swing.JLabel();
        Texto_Apellido = new javax.swing.JLabel();
        Boton_Saludar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setName("aaaaaaaa"); // NOI18N
        setResizable(false);

        Imagen_Saludo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistacontrolador/saluda.png"))); // NOI18N

        Campo_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_ApellidoActionPerformed(evt);
            }
        });

        Texto_Nombre.setText("Escribir Nombre:");

        Texto_Apellido.setText("Escribir Apellido:");

        Boton_Saludar.setText("Saluda");
        Boton_Saludar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SaludarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(Imagen_Saludo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Campo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(Texto_Nombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(Texto_Apellido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(Boton_Saludar)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Imagen_Saludo)
                .addGap(26, 26, 26)
                .addComponent(Texto_Nombre)
                .addGap(18, 18, 18)
                .addComponent(Campo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(Texto_Apellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Boton_Saludar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_ApellidoActionPerformed

    private void Boton_SaludarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SaludarActionPerformed
        //ninguno de los dos campos debe estar vacio
        if (Campo_Nombre.getText().isEmpty() || Campo_Apellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR" + "\n" + "Ningun campo puede estar vacio");
            return;
        }
        //La longitud del nombre debe ser minimo 5
        if (Campo_Nombre.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "ERROR" + "\n" + "El Nombre debe tener mas de 5 caracteres");
            return;
        }
        //ninguno de los campos debe tener un simbolo numerico
        if (!Campo_Nombre.getText().matches("^[a-zA-Z]+$") || !Campo_Apellido.getText().matches("^[a-zA-Z]+$")) {
            JOptionPane.showMessageDialog(null, "ERROR" + "\n" + "No puedes introducir ningun simbolo numerico");
            return;
        }

        JOptionPane.showMessageDialog(null, "¡Hola " + Campo_Nombre.getText() + " " + Campo_Apellido.getText() + "!");
        Campo_Nombre.setText("");
        Campo_Apellido.setText("");



    }//GEN-LAST:event_Boton_SaludarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Saludar;
    private javax.swing.JTextField Campo_Apellido;
    private javax.swing.JTextField Campo_Nombre;
    private javax.swing.JLabel Imagen_Saludo;
    private javax.swing.JLabel Texto_Apellido;
    private javax.swing.JLabel Texto_Nombre;
    // End of variables declaration//GEN-END:variables
}
