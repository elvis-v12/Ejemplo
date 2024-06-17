/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistema_de_monitoreo_salud_alumno.view;


import com.mycompany.sistema_de_monitoreo_salud_alumno.controler.Controler.ConexionSQL;
import com.mycompany.sistema_de_monitoreo_salud_alumno.controler.Controler.SesionDAOImpl;
import com.mycompany.sistema_de_monitoreo_salud_alumno.controler.Controler.interf.SesionDAO;
import com.mycompany.sistema_de_monitoreo_salud_alumno.model.Alumno;
import com.mycompany.sistema_de_monitoreo_salud_alumno.model.Sesion;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ELVIS
 */
public class HorarioAtencion extends javax.swing.JFrame {
            private DefaultTableModel modelo;

    /**
     * Creates new form HorarioAtencion
     */
    public HorarioAtencion() {
        
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("IdSesion");
        modelo.addColumn("IdAlumno");
        modelo.addColumn("Fecha inicio");
        modelo.addColumn("Fecha Fin");
          modelo.addColumn("Disponible");
        tb_Sesion.setModel(modelo);    
       this.setTitle("Genarar Cita medica");
    }
private void limpiarCampos() {
    // Limpiar los campos de entrada
    txt_Filtro.setText("");
    txt_Paciente.setText("");
    jDateInicio.setDate(null);
    jDateFin.setDate(null);
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
        Panel_Sesion = new javax.swing.JPanel();
        txt_Paciente = new javax.swing.JTextField();
        btn_GenerarCita = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        jDateInicio = new com.toedter.calendar.JDateChooser();
        jDateFin = new com.toedter.calendar.JDateChooser();
        btn_Ver = new javax.swing.JButton();
        checkBoxDisponible = new javax.swing.JCheckBox();
        btnReport = new javax.swing.JButton();
        Panel_Buscar = new javax.swing.JPanel();
        txt_Filtro = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Sesion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Panel_Sesion.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Sesion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GENERAR UNA ATENCION MEDICA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 3, 18))); // NOI18N
        Panel_Sesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Paciente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IDAlumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 2, 18))); // NOI18N
        Panel_Sesion.add(txt_Paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 26, 320, -1));

        btn_GenerarCita.setBackground(new java.awt.Color(0, 0, 51));
        btn_GenerarCita.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_GenerarCita.setForeground(new java.awt.Color(255, 255, 255));
        btn_GenerarCita.setText("Generar Cita");
        btn_GenerarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerarCitaActionPerformed(evt);
            }
        });
        Panel_Sesion.add(btn_GenerarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        btn_Modificar.setBackground(new java.awt.Color(0, 0, 51));
        btn_Modificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });
        Panel_Sesion.add(btn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 100, -1));

        btn_Eliminar.setBackground(new java.awt.Color(102, 0, 0));
        btn_Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        Panel_Sesion.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, -1));

        jDateInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Inicio"));
        jDateInicio.setToolTipText("");
        Panel_Sesion.add(jDateInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 79, 310, 55));

        jDateFin.setBorder(javax.swing.BorderFactory.createTitledBorder(" Fecha Fin"));
        Panel_Sesion.add(jDateFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 140, 310, 58));

        btn_Ver.setBackground(new java.awt.Color(102, 0, 0));
        btn_Ver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Ver.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ver.setText("Ver");
        btn_Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerActionPerformed(evt);
            }
        });
        Panel_Sesion.add(btn_Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 100, -1));

        checkBoxDisponible.setText("Estado");
        checkBoxDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDisponibleActionPerformed(evt);
            }
        });
        Panel_Sesion.add(checkBoxDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 204, 109, 30));

        btnReport.setBackground(new java.awt.Color(102, 0, 0));
        btnReport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReport.setForeground(new java.awt.Color(255, 255, 255));
        btnReport.setText("Recibo atención");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        Panel_Sesion.add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 120, 70));

        Panel_Buscar.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Buscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCADOR", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 3, 18))); // NOI18N

        txt_Filtro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tw Cen MT Condensed", 2, 18))); // NOI18N

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
                .addComponent(txt_Filtro, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Buscar)
                .addContainerGap())
        );
        Panel_BuscarLayout.setVerticalGroup(
            Panel_BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Buscar)
            .addComponent(txt_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tb_Sesion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_Sesion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Sesion, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Panel_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerActionPerformed

    ConexionSQL conexionSQL = new ConexionSQL(); 
    SesionDAOImpl sesionDAO = new SesionDAOImpl(conexionSQL);

    // Obtener todas las sesiones
    List<Sesion> sesiones = sesionDAO.obtenerTodasLasSesiones();

    // Obtener el modelo de la tabla
    DefaultTableModel model = (DefaultTableModel) tb_Sesion.getModel();

    // Limpiar la tabla antes de agregar las nuevas sesiones
    model.setRowCount(0);

    // Agregar las sesiones al modelo de la tabla
    for (Sesion sesion : sesiones) {
        // Transformar el valor booleano a "sí"/"no"
        String disponible = sesion.isDisponible() ? "sí" : "no";

        // Formatear las fechas para incluir la hora
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaInicio = sdf.format(sesion.getFechaInicio());
        String fechaFin = sdf.format(sesion.getFechaFin());

        model.addRow(new Object[]{
            sesion.getIdSesion(),
            sesion.getAlumno().getIdAlumno(),
            fechaInicio,
            fechaFin,
            disponible
        });
    }
    }//GEN-LAST:event_btn_VerActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
     // Obtener el ID de la sesión desde el campo de texto
    String idSesionText = txt_Filtro.getText();
    
    if (idSesionText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, llene el campo de ID.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    int idSesion;
    try {
        idSesion = Integer.parseInt(idSesionText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID de la sesión debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Crear una instancia de SesionDAOImpl
    ConexionSQL conexionSQL = new ConexionSQL(); // Asegúrate de tener tu conexión configurada
    SesionDAOImpl sesionDAO = new SesionDAOImpl(conexionSQL);
    
    // Eliminar la sesión
    sesionDAO.eliminarSesion(idSesion);
    
    // Verificar si la sesión fue eliminada (podrías implementar una lógica adicional para confirmar la eliminación)
    List<Sesion> sesiones = sesionDAO.obtenerTodasLasSesiones();
    boolean sesionEliminada = true; // Asume que la sesión fue eliminada si no se encuentra en la lista obtenida
    for (Sesion sesion : sesiones) {
        if (sesion.getIdSesion() == idSesion) {
            sesionEliminada = false;
            break;
        }
    }
    
    if (sesionEliminada) {
        JOptionPane.showMessageDialog(this, "Sesión eliminada con éxito.", "Información", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo eliminar la sesión. Verifique el ID e intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    // Actualizar la tabla con todas las sesiones
    DefaultTableModel model = (DefaultTableModel) tb_Sesion.getModel();
    model.setRowCount(0); // Limpiar la tabla antes de agregar las nuevas sesiones
    for (Sesion sesion : sesiones) {
        model.addRow(new Object[]{
            sesion.getIdSesion(),
            sesion.getAlumno().getIdAlumno(),
            sesion.getFechaInicio().toString(),
            sesion.getFechaFin().toString(),
            sesion.isDisponible()
        });
    }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_GenerarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerarCitaActionPerformed
     // Obtener el ID del alumno desde el JTextField
    int idAlumno = obtenerIdAlumnoSeleccionado();
    if (idAlumno == -1) {
        return; // Salir si el ID no es válido
    }

    // Supongamos que tienes un JDateChooser o algún componente para seleccionar la fecha
    Date fechaInicio = jDateInicio.getDate(); // Obtenemos la fecha de inicio de un JDateChooser
    Date fechaFin = jDateFin.getDate(); // Obtenemos la fecha de fin de un JDateChooser

    if (fechaInicio == null || fechaFin == null) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione fechas válidas.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Combinar la fecha seleccionada con la hora actual
    fechaInicio = combinarFechaConHoraActual(fechaInicio);
    fechaFin = combinarFechaConHoraActual(fechaFin);

    // Verificar si la fecha está disponible
    SesionDAO sesionDAO = new SesionDAOImpl(new ConexionSQL());
    List<Sesion> sesionesEnFecha = sesionDAO.obtenerSesionesEnFecha(fechaInicio);
    
    boolean fechaDisponible = true;
    for (Sesion sesion : sesionesEnFecha) {
        if (sesion.getFechaInicio().equals(fechaInicio) && !sesion.isDisponible()) {
            fechaDisponible = false;
            break;
        }
    }

    if (fechaDisponible) {
        // Crear y agregar la nueva sesión
        Alumno alumno = new Alumno(idAlumno, idAlumno); // Crea una instancia del alumno con el ID seleccionado
        alumno.setIdAlumno(idAlumno);

        // Agregar la sesión con el estado disponible en 1 (true)
        Sesion nuevaSesion = new Sesion(0, alumno, fechaInicio, fechaFin, true);
        sesionDAO.agregarSesion(nuevaSesion);

        // Obtener la sesión recién agregada para actualizar su estado
        Sesion sesionRecienAgregada = sesionDAO.obtenerUltimaSesionAgregada();
        if (sesionRecienAgregada != null && sesionRecienAgregada.getAlumno().getIdAlumno() == idAlumno) {
            sesionRecienAgregada.setDisponible(false); // Marcar como no disponible
            sesionDAO.actualizarSesion(sesionRecienAgregada);
        }

        JOptionPane.showMessageDialog(this, "Sesión agregada y marcada como no disponible.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "La fecha seleccionada ya está ocupada. Por favor, elija otra fecha.", "Fecha Ocupada", JOptionPane.WARNING_MESSAGE);
    }
    
    }//GEN-LAST:event_btn_GenerarCitaActionPerformed
private int obtenerIdAlumnoSeleccionado() {
    try {
        // Suponiendo que el JTextField se llama txtIdAlumno
        return Integer.parseInt(txt_Paciente.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de alumno válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return -1; // Devuelve un valor inválido si la conversión falla
    }
}
// Método para combinar la fecha seleccionada con la hora actual
private Date combinarFechaConHoraActual(Date fechaSeleccionada) {
    Calendar calendar = Calendar.getInstance();
    Calendar fechaConHora = Calendar.getInstance();
    fechaConHora.setTime(fechaSeleccionada);
    fechaConHora.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY));
    fechaConHora.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE));
    fechaConHora.set(Calendar.SECOND, calendar.get(Calendar.SECOND));
    fechaConHora.set(Calendar.MILLISECOND, calendar.get(Calendar.MILLISECOND));
    return fechaConHora.getTime();
}
    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
   // Obtener los datos de la sesión a modificar desde los campos de texto y JDateChooser
    String idSesionText = txt_Filtro.getText();
    String idAlumnoText = txt_Paciente.getText();
    Date fechaInicio = jDateInicio.getDate();
    Date fechaFin = jDateFin.getDate();
    boolean disponible = checkBoxDisponible.isSelected(); // Suponiendo que tienes un checkbox para la disponibilidad
    
    // Validar los datos
    if (idSesionText.isEmpty() || idAlumnoText.isEmpty() || fechaInicio == null || fechaFin == null) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    int idSesion;
    int idAlumno;
    try {
        idSesion = Integer.parseInt(idSesionText);
        idAlumno = Integer.parseInt(idAlumnoText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID de la sesión y el ID del alumno deben ser números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Crear una instancia de SesionDAOImpl
    ConexionSQL conexionSQL = new ConexionSQL(); // Asegúrate de tener tu conexión configurada
    SesionDAOImpl sesionDAO = new SesionDAOImpl(conexionSQL);
    
    // Obtener el alumno por ID
    Alumno alumno = sesionDAO.obtenerAlumnoPorId(idAlumno); // Usamos el método que ya tienes implementado
    if (alumno == null) {
        JOptionPane.showMessageDialog(this, "Alumno no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Crear la sesión a actualizar
    Sesion sesion = new Sesion(idSesion, alumno, fechaInicio, fechaFin, disponible);
    
    // Actualizar la sesión
    sesionDAO.actualizarSesion(sesion);
    
    // Actualizar la tabla con todas las sesiones
    List<Sesion> sesiones = sesionDAO.obtenerTodasLasSesiones();
    DefaultTableModel model = (DefaultTableModel) tb_Sesion.getModel();
    model.setRowCount(0); // Limpiar la tabla antes de agregar las nuevas sesiones
    for (Sesion s : sesiones) {
        model.addRow(new Object[]{
            s.getIdSesion(),
            s.getAlumno().getIdAlumno(),
            s.getFechaInicio().toString(),
            s.getFechaFin().toString(),
            s.isDisponible() ? "true" : "false"
        });
    }
    
    // Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Sesión actualizada con éxito.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
      try {
            int idAlumno = Integer.parseInt(txt_Filtro.getText());
             ConexionSQL conexionSQL = new ConexionSQL(); // Asegúrate de tener tu conexión configurada
          SesionDAOImpl sesionDAO = new SesionDAOImpl(conexionSQL);
            List<Sesion> sesiones = sesionDAO.obtenerSesionesDeAlumno(idAlumno);
            mostrarSesionesEnTabla(sesiones);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de alumno válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
      limpiarCampos();
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void checkBoxDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxDisponibleActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
    Boleta_Atencion Boleta_Atencion = new Boleta_Atencion();
    Boleta_Atencion.setVisible(true);
    }//GEN-LAST:event_btnReportActionPerformed
private void mostrarSesionesEnTabla(List<Sesion> sesiones) {
    String[] columnNames = {"ID Sesion", "ID Alumno", "Fecha Inicio", "Fecha Fin"};
    Object[][] data = new Object[sesiones.size()][4];

    for (int i = 0; i < sesiones.size(); i++) {
        Sesion sesion = sesiones.get(i);
        data[i][0] = sesion.getIdSesion();
        data[i][1] = sesion.getAlumno().getIdAlumno();
        data[i][2] = sesion.getFechaInicio();
        data[i][3] = sesion.getFechaFin();
    }

    DefaultTableModel model = new DefaultTableModel(data, columnNames);
    tb_Sesion.setModel(model);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Buscar;
    private javax.swing.JPanel Panel_Sesion;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_GenerarCita;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Ver;
    private javax.swing.JCheckBox checkBoxDisponible;
    private com.toedter.calendar.JDateChooser jDateFin;
    private com.toedter.calendar.JDateChooser jDateInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Sesion;
    private javax.swing.JTextField txt_Filtro;
    private javax.swing.JTextField txt_Paciente;
    // End of variables declaration//GEN-END:variables
}
