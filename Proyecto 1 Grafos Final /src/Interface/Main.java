/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Color;

/**
 *
 * @author andrespaz
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        Mostrar_Usuarios = new javax.swing.JButton();
        Mostrar_Grafos = new javax.swing.JButton();
        Agregar_Usuarios = new javax.swing.JButton();
        Crear_Amistades = new javax.swing.JButton();
        Borrar_Usuarios = new javax.swing.JButton();
        Cargar_Datos = new javax.swing.JButton();
        BFS = new javax.swing.JButton();
        Puentes = new javax.swing.JButton();
        DFS = new javax.swing.JButton();
        ExitBt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mostrar_Usuarios.setText("Mostrar Usuarios");
        Mostrar_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mostrar_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar_UsuariosActionPerformed(evt);
            }
        });
        BG.add(Mostrar_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 60));

        Mostrar_Grafos.setText("Mostrar Grafo");
        Mostrar_Grafos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mostrar_Grafos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar_GrafosActionPerformed(evt);
            }
        });
        BG.add(Mostrar_Grafos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 180, 60));

        Agregar_Usuarios.setText("Agregar Usuarios");
        Agregar_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregar_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_UsuariosActionPerformed(evt);
            }
        });
        BG.add(Agregar_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 180, 60));

        Crear_Amistades.setText("Crear Amistades");
        Crear_Amistades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Crear_Amistades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_AmistadesActionPerformed(evt);
            }
        });
        BG.add(Crear_Amistades, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 180, 60));

        Borrar_Usuarios.setText("Borrar Usuarios");
        Borrar_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Borrar_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar_UsuariosActionPerformed(evt);
            }
        });
        BG.add(Borrar_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 180, 60));

        Cargar_Datos.setText("Cargar Datos");
        Cargar_Datos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cargar_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cargar_DatosActionPerformed(evt);
            }
        });
        BG.add(Cargar_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, 60));

        BFS.setText("BFS");
        BFS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFSActionPerformed(evt);
            }
        });
        BG.add(BFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 180, 60));

        Puentes.setText("Puentes");
        Puentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Puentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuentesActionPerformed(evt);
            }
        });
        BG.add(Puentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 180, 60));

        DFS.setText("DFS");
        DFS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DFSActionPerformed(evt);
            }
        });
        BG.add(DFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 180, 60));

        ExitBt.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        ExitBt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitBt.setText("X");
        ExitBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBt.setPreferredSize(new java.awt.Dimension(40, 40));
        ExitBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBtMouseClicked(evt);
            }
        });
        BG.add(ExitBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 50, 40));

        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cargar_DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cargar_DatosActionPerformed
        Functions f = new Functions();
        f.CargarDatos();
        
    }//GEN-LAST:event_Cargar_DatosActionPerformed

    private void Mostrar_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar_UsuariosActionPerformed
        Functions f = new Functions();
        f.mostrar();
        
    }//GEN-LAST:event_Mostrar_UsuariosActionPerformed

    private void Agregar_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_UsuariosActionPerformed
        // TODO add your handling code here:
        Functions f = new Functions();
        f.agregar();
    }//GEN-LAST:event_Agregar_UsuariosActionPerformed

    private void Borrar_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar_UsuariosActionPerformed
        // TODO add your handling code here:
        Functions f = new Functions();
        f.borrarU();
    }//GEN-LAST:event_Borrar_UsuariosActionPerformed

    private void Crear_AmistadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_AmistadesActionPerformed
        // TODO add your handling code here:
        Functions f = new Functions();
        f.AgregarR();
               
    }//GEN-LAST:event_Crear_AmistadesActionPerformed

    private void Mostrar_GrafosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar_GrafosActionPerformed
        // TODO add your handling code here:
        Functions f = new Functions();
        f.MostrarGrafo();
    }//GEN-LAST:event_Mostrar_GrafosActionPerformed

    private void BFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFSActionPerformed
        // TODO add your handling code here:
        Functions f = new Functions();
        f.MostrarBFS();
    }//GEN-LAST:event_BFSActionPerformed

    private void PuentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuentesActionPerformed
        // TODO add your handling code here:
        Functions f = new Functions();
        f.MostrarPuentes();
        
    }//GEN-LAST:event_PuentesActionPerformed

    private void DFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DFSActionPerformed
        // TODO add your handling code here:
        Functions f = new Functions();
        f.MostrarDFS();
    }//GEN-LAST:event_DFSActionPerformed

    private void ExitBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitBtMouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_Usuarios;
    private javax.swing.JButton BFS;
    private javax.swing.JPanel BG;
    private javax.swing.JButton Borrar_Usuarios;
    private javax.swing.JButton Cargar_Datos;
    private javax.swing.JButton Crear_Amistades;
    private javax.swing.JButton DFS;
    private javax.swing.JLabel ExitBt;
    private javax.swing.JButton Mostrar_Grafos;
    private javax.swing.JButton Mostrar_Usuarios;
    private javax.swing.JButton Puentes;
    // End of variables declaration//GEN-END:variables
}
