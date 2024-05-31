/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistema_de_monitoreo_salud_alumno.view;

import com.mycompany.sistema_de_monitoreo_salud_alumno.controler.Controler.ConexionSQL;
import com.mycompany.sistema_de_monitoreo_salud_alumno.controler.Controler.ProveedorDAOImpl;
import com.mycompany.sistema_de_monitoreo_salud_alumno.model.Proveedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.checkerframework.checker.units.qual.C;

/**
 *
 * @author Torres Astorga
 */
public class FrmProveedor extends javax.swing.JFrame {

    /**
     * Creates new form FrmProveedor
     */
            private DefaultTableModel modelo;
    public FrmProveedor() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("IdProveedor");
        modelo.addColumn("Nif");
        modelo.addColumn("Telefono");
        modelo.addColumn("Tipo_producto");
        modelo.addColumn("Encargado");
        tb_Proveedor.setModel(modelo);    
    }

private void limpiarCampos() {
    // Limpiar los campos de entrada
    txt_Filtro.setText("");
    txt_Encargado.setText("");
    txt_NIF.setText("");
    txt_Telefono.setText("");
    txt_TipoProd.setText("");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel_Proveedor = new javax.swing.JPanel();
        txt_NIF = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        txt_Encargado = new javax.swing.JTextField();
        txt_TipoProd = new javax.swing.JTextField();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        Panel_Buscar = new javax.swing.JPanel();
        txt_Filtro = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Proveedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Panel_Proveedor.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS PROVEEDOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 3, 18))); // NOI18N

        txt_NIF.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NIF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 2, 18))); // NOI18N

        txt_Telefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 2, 18))); // NOI18N

        txt_Encargado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encargado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 2, 18))); // NOI18N

        txt_TipoProd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 2, 18))); // NOI18N

        btn_Agregar.setBackground(new java.awt.Color(0, 0, 51));
        btn_Agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        btn_Modificar.setBackground(new java.awt.Color(0, 0, 51));
        btn_Modificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        btn_Eliminar.setBackground(new java.awt.Color(102, 0, 0));
        btn_Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btnVer.setBackground(new java.awt.Color(102, 0, 0));
        btnVer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVer.setForeground(new java.awt.Color(255, 255, 255));
        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_ProveedorLayout = new javax.swing.GroupLayout(Panel_Proveedor);
        Panel_Proveedor.setLayout(Panel_ProveedorLayout);
        Panel_ProveedorLayout.setHorizontalGroup(
            Panel_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ProveedorLayout.createSequentialGroup()
                .addGroup(Panel_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_NIF, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Encargado, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_TipoProd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_ProveedorLayout.createSequentialGroup()
                        .addGroup(Panel_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_Eliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Agregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        Panel_ProveedorLayout.setVerticalGroup(
            Panel_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProveedorLayout.createSequentialGroup()
                .addComponent(txt_NIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Encargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_TipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Eliminar)
                    .addComponent(btnVer))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Panel_Buscar.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Buscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCADOR", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 3, 18))); // NOI18N

        txt_Filtro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tw Cen MT Condensed", 2, 18))); // NOI18N
        txt_Filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FiltroActionPerformed(evt);
            }
        });

        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        btn_Buscar.setBorder(null);
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_BuscarLayout = new javax.swing.GroupLayout(Panel_Buscar);
        Panel_Buscar.setLayout(Panel_BuscarLayout);
        Panel_BuscarLayout.setHorizontalGroup(
            Panel_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BuscarLayout.createSequentialGroup()
                .addComponent(txt_Filtro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel_BuscarLayout.setVerticalGroup(
            Panel_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Filtro)
                    .addComponent(btn_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tb_Proveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_Proveedor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_Proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Panel_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void actualizarTabla() {
    try {
        // Crear una instancia del DAO de Proveedor
        ProveedorDAOImpl proveedorDAO = new ProveedorDAOImpl(new ConexionSQL());

        // Obtener la lista actualizada de proveedores de la base de datos
        List<Proveedor> listaProveedores = proveedorDAO.obtenerTodosProveedores();

        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tb_Proveedor.getModel();

        // Limpiar el modelo de la tabla
        modelo.setRowCount(0);

        // Agregar los proveedores al modelo de la tabla
        for (Proveedor proveedor : listaProveedores) {
            Object[] fila = {
                proveedor.getIdProveedor(),
                proveedor.getNif(),
                proveedor.getTelefono(),
                proveedor.getTipo_producto(),
                proveedor.getEncargado()
            };
            modelo.addRow(fila);
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al actualizar la tabla de proveedores", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
// Llamar al método para obtener todos los proveedores
    ProveedorDAOImpl proveedorDAO = new ProveedorDAOImpl(new ConexionSQL());
    ArrayList<Proveedor> listaProveedores = proveedorDAO.obtenerTodosProveedores();
    
    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) tb_Proveedor.getModel();
    // Limpiar el modelo de la tabla
    modelo.setRowCount(0);
    
    // Llenar la tabla con los proveedores obtenidos
    for (Proveedor proveedor : listaProveedores) {
        Object[] fila = {proveedor.getIdProveedor(), proveedor.getNif(), proveedor.getTelefono(), proveedor.getTipo_producto(), proveedor.getEncargado()};
        modelo.addRow(fila);
    }
    }//GEN-LAST:event_btnVerActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
    // Obtener los datos del proveedor desde los campos de texto u otros componentes de tu interfaz
    String nif = txt_NIF.getText();
    String telefono = txt_Telefono.getText();
    String tipoProducto = txt_TipoProd.getText();
    String encargado = txt_Encargado.getText();
    
    // Crear una instancia de Proveedor con los datos obtenidos
    Proveedor nuevoProveedor = new Proveedor(nif, telefono, tipoProducto, encargado);
        ProveedorDAOImpl proveedorDAO = new ProveedorDAOImpl(new ConexionSQL());
    // Llamar al método crearProveedor para agregar el nuevo proveedor a la base de datos
    proveedorDAO.crearProveedor(nuevoProveedor);
    
    // Mostrar un mensaje de éxito
    JOptionPane.showMessageDialog(this, "Proveedor agregado correctamente");
    limpiarCampos();
    actualizarTabla();
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
    // Recoger los datos del proveedor desde los campos de entrada en la interfaz
    int idProveedor = Integer.parseInt(txt_Filtro.getText());
    String nif = txt_NIF.getText();
    String telefono = txt_Telefono.getText();
    String tipoProducto = txt_TipoProd.getText();
    String encargado = txt_Encargado.getText();

    // Crear un objeto Proveedor con los datos recogidos
    Proveedor proveedor = new Proveedor(nif, telefono, tipoProducto, encargado);
    proveedor.setIdProveedor(idProveedor);
    proveedor.setNif(nif);
    proveedor.setTelefono(telefono);
    proveedor.setTipo_producto(tipoProducto);
    proveedor.setEncargado(encargado);

    // Llamar al método actualizarProveedor para actualizar los datos en la base de datos
    ProveedorDAOImpl proveedorDAO = new ProveedorDAOImpl(new ConexionSQL());
    proveedorDAO.actualizarProveedor(proveedor);

    // Mostrar un mensaje de confirmación
    JOptionPane.showMessageDialog(this, "Proveedor actualizado correctamente.");
    limpiarCampos();
    actualizarTabla();
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
       // Obtener la fila seleccionada de la tabla
    int filaSeleccionada = tb_Proveedor.getSelectedRow();
    
    if (filaSeleccionada != -1) { // Verificar si se seleccionó alguna fila
        // Obtener el ID del proveedor seleccionado
        int idProveedor = (int) tb_Proveedor.getValueAt(filaSeleccionada, 0);
        
        // Crear una instancia de ProveedorDAOImpl y llamar al método eliminarProveedor
        ProveedorDAOImpl proveedorDAO = new ProveedorDAOImpl(new ConexionSQL());
        proveedorDAO.eliminarProveedor(idProveedor);
        
        // Actualizar la tabla de proveedores después de eliminar uno
        btnVerActionPerformed(evt);
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione un proveedor a eliminar.", "Mensaje", JOptionPane.WARNING_MESSAGE);
    }
    actualizarTabla();
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
   // Obtener el ID de búsqueda del campo de texto
int idProveedorBusqueda = Integer.parseInt(txt_Filtro.getText());

// Crear una instancia del DAO de Proveedor
ProveedorDAOImpl proveedorDAO = new ProveedorDAOImpl(new ConexionSQL());

// Buscar el proveedor por su ID
Object[] datosProveedor = proveedorDAO.leerProveedor(idProveedorBusqueda);

// Verificar si se encontró el proveedor
if (datosProveedor != null) {
    // Si se encontró, actualizar la tabla con los datos del proveedor encontrado
    DefaultTableModel modelo = (DefaultTableModel) tb_Proveedor.getModel();
    modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos
    modelo.addRow(datosProveedor);
} else {
    // Si no se encontró el proveedor, mostrar un mensaje de error
    JOptionPane.showMessageDialog(this, "Proveedor no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
}
limpiarCampos();

    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void txt_FiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FiltroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Buscar;
    private javax.swing.JPanel Panel_Proveedor;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Proveedor;
    private javax.swing.JTextField txt_Encargado;
    private javax.swing.JTextField txt_Filtro;
    private javax.swing.JTextField txt_NIF;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_TipoProd;
    // End of variables declaration//GEN-END:variables
}
