/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca.formulario.Autor;
import biblioteca.dao.*;
import javax.swing.*;
/**
 *
 * @author Bemaz
 */
public class FrmAutor extends javax.swing.JFrame {

    TablaAutor tAutor = new TablaAutor();
    boolean esNuevo = true;
    int idAutor = 0;
    int posAcutal = 0;

    /**
     * Creates new form FrmAutor
     */
    public FrmAutor() {
        initComponents();
        mostrarEnEf(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        BtnNuevo = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnAnterior = new javax.swing.JButton();
        IContador = new javax.swing.JLabel();
        BtnSiguiente = new javax.swing.JButton();
        BtnGuardarEnBD = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        BtnNuevo.setText("Nuevo");
        BtnNuevo.setFocusable(false);
        BtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnNuevo);

        BtnGuardar.setText("Guardar");
        BtnGuardar.setFocusable(false);
        BtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnGuardar);

        BtnEliminar.setText("Eliminar");
        BtnEliminar.setFocusable(false);
        BtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnEliminar);

        BtnAnterior.setText("Anterior");
        BtnAnterior.setFocusable(false);
        BtnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnteriorActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnAnterior);

        IContador.setText("0 de 0");
        jToolBar1.add(IContador);

        BtnSiguiente.setText("Siguiente");
        BtnSiguiente.setFocusable(false);
        BtnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnSiguiente);

        BtnGuardarEnBD.setText("Guardar en BD");
        BtnGuardarEnBD.setToolTipText("");
        BtnGuardarEnBD.setFocusable(false);
        BtnGuardarEnBD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnGuardarEnBD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnGuardarEnBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarEnBDActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnGuardarEnBD);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Autor"));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfApellido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos(  ); 
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
                if (tfNombre.getText().equals(null)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre del autor", "Autor",
                    JOptionPane.INFORMATION_MESSAGE);
            this.tfApellido.requestFocus();
            return;
        }

        if(tfApellido.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Debe ingresar el apellido del autor", "Autor",
                    JOptionPane.INFORMATION_MESSAGE);
            this.tfApellido.requestFocus();
            return;
        }

        int b;
        if(esNuevo) {
            b = tAutor.agregarALista(tfNombre.getText(), tfApellido.getText());

        } else {
            b = tAutor.editarEnLista(idAutor, tfNombre.getText(), tfApellido.getText());
        }

        if(b == 1) {
            JOptionPane.showMessageDialog(this, "Registro guardado...", "Autor",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
                int resp = JOptionPane.showConfirmDialog(this, "??Desea eliminar el registro?", "Autor",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(resp == 0) {
            int b = tAutor.eliminarEnLista(idAutor);
            if(b == 1) {
                JOptionPane.showMessageDialog(this, "Registro eliminado...", "Autor",
                        JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el registro...", "Autor",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnteriorActionPerformed
        // TODO add your handling code here:
        if(posAcutal == 0) posAcutal = tAutor.getLista().size();
        posAcutal--;
        mostrarEnEf(posAcutal);
    }//GEN-LAST:event_BtnAnteriorActionPerformed

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
        // TODO add your handling code here:
        posAcutal++;

        if(posAcutal == tAutor.getLista().size()) posAcutal = 0;
        mostrarEnEf(posAcutal);
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnGuardarEnBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarEnBDActionPerformed
        // TODO add your handling code here:
        String msn = tAutor.actualizarBD();
        JOptionPane.showMessageDialog(this, msn, "Actualizar base de datos", JOptionPane.INFORMATION_MESSAGE);
        posAcutal = 0;
        mostrarEnEf(posAcutal);
    }//GEN-LAST:event_BtnGuardarEnBDActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAutor().setVisible(true);
            }
        });
    }
    // Funcion para limpiar los campos
    public void limpiarCampos() {
        esNuevo = true;
        tfNombre.setText(null);
        tfApellido.setText(null);
        tfNombre.requestFocus();
    }
       
        
            private void mostrarEnEf(int fila) {
        if (!tAutor.getLista().isEmpty()) {
            tfNombre.setText(tAutor.getLista().get(fila).getNombrePila());
            tfApellido.setText(tAutor.getLista().get(fila).getApellidoPaterno());
            idAutor = tAutor.getLista().get(fila).getIdAutor();

            int ultReg = tAutor.getLista().size();
            IContador.setText((fila + 1) + " de " + ultReg);
            tfNombre.requestFocus();
        } else {
            limpiarCampos();
        }
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnterior;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnGuardarEnBD;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JLabel IContador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
