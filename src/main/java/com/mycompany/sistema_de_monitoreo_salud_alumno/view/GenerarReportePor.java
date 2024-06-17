/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.sistema_de_monitoreo_salud_alumno.view;

import com.mycompany.sistema_de_monitoreo_salud_alumno.controler.Controler.AlumnoDAOImpl;
import com.mycompany.sistema_de_monitoreo_salud_alumno.controler.Controler.ConexionSQL;
import com.mycompany.sistema_de_monitoreo_salud_alumno.model.ProductoFarmaceuticoService;
import com.mycompany.sistema_de_monitoreo_salud_alumno.model.Alumno;
import com.mycompany.sistema_de_monitoreo_salud_alumno.model.EstadoSalud;
import com.mycompany.sistema_de_monitoreo_salud_alumno.model.EstadoSaludService;
import com.mycompany.sistema_de_monitoreo_salud_alumno.model.ReporteGenerar;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ELVIS
 */
public class GenerarReportePor extends javax.swing.JPanel {

    /**
     * Creates new form GenerarReportePor
     */
    public GenerarReportePor() {
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

        Panel_Opcion = new javax.swing.JPanel();
        btn_GenerarReporte = new javax.swing.JButton();
        btn_GenerarReporteProductos = new javax.swing.JButton();
        btn_GenerarReporteESalud = new javax.swing.JButton();

        Panel_Opcion.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Opcion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 3, 18))); // NOI18N

        btn_GenerarReporte.setBackground(new java.awt.Color(102, 0, 0));
        btn_GenerarReporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_GenerarReporte.setForeground(new java.awt.Color(255, 255, 255));
        btn_GenerarReporte.setText("Generar  reporte Alumos");
        btn_GenerarReporte.setBorder(null);
        btn_GenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerarReporteActionPerformed(evt);
            }
        });

        btn_GenerarReporteProductos.setBackground(new java.awt.Color(102, 0, 0));
        btn_GenerarReporteProductos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_GenerarReporteProductos.setForeground(new java.awt.Color(255, 255, 255));
        btn_GenerarReporteProductos.setText("Generar reporte Productos");
        btn_GenerarReporteProductos.setBorder(null);
        btn_GenerarReporteProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerarReporteProductosActionPerformed(evt);
            }
        });

        btn_GenerarReporteESalud.setBackground(new java.awt.Color(102, 0, 0));
        btn_GenerarReporteESalud.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_GenerarReporteESalud.setForeground(new java.awt.Color(255, 255, 255));
        btn_GenerarReporteESalud.setText("Generar reporte estado salud");
        btn_GenerarReporteESalud.setBorder(null);
        btn_GenerarReporteESalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerarReporteESaludActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_OpcionLayout = new javax.swing.GroupLayout(Panel_Opcion);
        Panel_Opcion.setLayout(Panel_OpcionLayout);
        Panel_OpcionLayout.setHorizontalGroup(
            Panel_OpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_OpcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_GenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_GenerarReporteProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_GenerarReporteESalud)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_OpcionLayout.setVerticalGroup(
            Panel_OpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_OpcionLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Panel_OpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_GenerarReporteESalud, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btn_GenerarReporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_GenerarReporteProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Opcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Opcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerarReporteActionPerformed
      ConexionSQL conexionSQL = new ConexionSQL(); // Asegúrate de tener la implementación de esta clase
        ReporteGenerar alumnoDAO = new ReporteGenerar(conexionSQL);
        // Generar el reporte de sesiones en formato PDF
        alumnoDAO.generarReporteSesionesPDF("reporte_sesiones.pdf");
    }//GEN-LAST:event_btn_GenerarReporteActionPerformed

    private void btn_GenerarReporteESaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerarReporteESaludActionPerformed
ConexionSQL conexionSQL = new ConexionSQL();
        EstadoSaludService estadoSaludService = new EstadoSaludService(conexionSQL);

        // Obtener la lista de estados de salud de los alumnos
        List<EstadoSalud> estados = estadoSaludService.obtenerEstadoSaludAlumnos();

        // Generar el reporte de estado de salud en formato PDF
        EstadoSaludService.generarReporteEstadoSalud("reporte_estado_salud.pdf", estados);        
    }//GEN-LAST:event_btn_GenerarReporteESaludActionPerformed

    private void btn_GenerarReporteProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerarReporteProductosActionPerformed
      ConexionSQL conexionSQL = new ConexionSQL(); // Asegúrate de tener la implementación de esta clase
        ProductoFarmaceuticoService alumnoDAO = new ProductoFarmaceuticoService(conexionSQL);
        // Generar el reporte de sesiones en formato PDF
        alumnoDAO.generarReporteInventario("reporte_Productos.pdf");       
    }//GEN-LAST:event_btn_GenerarReporteProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Opcion;
    private javax.swing.JButton btn_GenerarReporte;
    private javax.swing.JButton btn_GenerarReporteESalud;
    private javax.swing.JButton btn_GenerarReporteProductos;
    // End of variables declaration//GEN-END:variables
}
