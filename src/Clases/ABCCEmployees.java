/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.Empleados.res;
import Conexiones.Procedimientos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class ABCCEmployees extends javax.swing.JFrame {

    /**
     * Creates new form CambiarEliminar
     */
    public ABCCEmployees() {
        initComponents();
        
        mostrarJuegosDisponibles(TablaEmpleados, "SELECT * FROM Vista_Juegos_Disponibles;");
        
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMaximum(2200);
        modeloSpinner.setMinimum(0);
        modeloSpinner.setStepSize(1);
        modeloSpinner.setValue(0);
        spnA.setModel(modeloSpinner);
        spnA2.setModel(modeloSpinner);
        
        SpinnerNumberModel modeloSpinner2 = new SpinnerNumberModel();
        modeloSpinner2.setMaximum(31);
        modeloSpinner2.setMinimum(0);
        modeloSpinner2.setStepSize(1);
        modeloSpinner2.setValue(0);
        spnDia.setModel(modeloSpinner2);
        spnDia2.setModel(modeloSpinner2);
        
        SpinnerNumberModel modeloSpinner3 = new SpinnerNumberModel();
        modeloSpinner3.setMaximum(2200);
        modeloSpinner3.setMinimum(0);
        modeloSpinner3.setStepSize(1);
        modeloSpinner3.setValue(0);
        spnA2.setModel(modeloSpinner3);
        
        SpinnerNumberModel modeloSpinner4 = new SpinnerNumberModel();
        modeloSpinner4.setMaximum(31);
        modeloSpinner4.setMinimum(0);
        modeloSpinner4.setStepSize(1);
        modeloSpinner4.setValue(0);
        spnDia2.setModel(modeloSpinner4);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelABCCEmployees = new javax.swing.JPanel();
        lblTitulo5 = new javax.swing.JLabel();
        lblGenero5 = new javax.swing.JLabel();
        lblEstudio5 = new javax.swing.JLabel();
        lblPlataforma5 = new javax.swing.JLabel();
        lblCantidad5 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        spnDia = new javax.swing.JSpinner();
        cobMes = new javax.swing.JComboBox<>();
        cobGenero = new javax.swing.JComboBox<>();
        btnCambiar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtIdEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoEmpleado = new javax.swing.JTextField();
        spnA = new javax.swing.JSpinner();
        cobMes2 = new javax.swing.JComboBox<>();
        spnA2 = new javax.swing.JSpinner();
        spnDia2 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmpleados = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lblVender2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelABCCEmployees.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblTitulo5.setText("Nombre:");

        lblGenero5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblGenero5.setText("Genero:");

        lblEstudio5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblEstudio5.setText("Apellido:");

        lblPlataforma5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblPlataforma5.setText("Fecha de nacimiento:");

        lblCantidad5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblCantidad5.setText("Fecha de contratación:");

        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });
        txtNombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreEmpleadoKeyReleased(evt);
            }
        });

        cobMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar mes...", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        cobGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar genero...", "M", "F" }));
        cobGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobGeneroActionPerformed(evt);
            }
        });

        btnCambiar.setText("Modificar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtIdEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdEmpleadoKeyReleased(evt);
            }
        });

        jLabel4.setText("Emp no:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel5.setText("----------------------------------------------------------------------------------------------------------------------------------------------");

        txtApellidoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoEmpleadoActionPerformed(evt);
            }
        });
        txtApellidoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoEmpleadoKeyReleased(evt);
            }
        });

        cobMes2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar mes...", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        javax.swing.GroupLayout panelABCCEmployeesLayout = new javax.swing.GroupLayout(panelABCCEmployees);
        panelABCCEmployees.setLayout(panelABCCEmployeesLayout);
        panelABCCEmployeesLayout.setHorizontalGroup(
            panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelABCCEmployeesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelABCCEmployeesLayout.createSequentialGroup()
                            .addComponent(lblTitulo5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelABCCEmployeesLayout.createSequentialGroup()
                            .addComponent(lblEstudio5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelABCCEmployeesLayout.createSequentialGroup()
                        .addComponent(lblGenero5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cobGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelABCCEmployeesLayout.createSequentialGroup()
                        .addComponent(lblCantidad5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cobMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnDia2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelABCCEmployeesLayout.createSequentialGroup()
                        .addComponent(lblPlataforma5)
                        .addGap(14, 14, 14)
                        .addComponent(spnA, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cobMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnDia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelABCCEmployeesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(473, Short.MAX_VALUE))
            .addGroup(panelABCCEmployeesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelABCCEmployeesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelABCCEmployeesLayout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelABCCEmployeesLayout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(34, 34, 34)
                        .addComponent(btnCambiar)
                        .addGap(36, 36, 36)
                        .addComponent(btnEliminar)
                        .addGap(39, 39, 39)
                        .addComponent(btnLimpiar)
                        .addGap(105, 105, 105))))
        );
        panelABCCEmployeesLayout.setVerticalGroup(
            panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelABCCEmployeesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGroup(panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelABCCEmployeesLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlataforma5)
                            .addComponent(cobMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidad5)
                            .addComponent(cobMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnDia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelABCCEmployeesLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo5))
                        .addGap(21, 21, 21)
                        .addGroup(panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEstudio5)
                            .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenero5)
                            .addComponent(cobGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelABCCEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCambiar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(7, 7, 7)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spnA.getAccessibleContext().setAccessibleName("");

        TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Emp_no", "First_name", "Last_name", "Gender", "Birth_date", "Hire_date"
            }
        ));
        TablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEmpleadosMouseClicked(evt);
            }
        });
        TablaEmpleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TablaEmpleadosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaEmpleados);

        jPanel5.setBackground(new java.awt.Color(79, 242, 222));
        jPanel5.setForeground(new java.awt.Color(79, 242, 222));

        lblVender2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblVender2.setForeground(new java.awt.Color(255, 255, 255));
        lblVender2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVender2.setText("Agrega, modifica, consulta o elimina reguistros de empleados");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblVender2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVender2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(panelABCCEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelABCCEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaEmpleadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaEmpleadosKeyPressed
        metodoRestablecer();
        
        int col = TablaEmpleados.getSelectedRow();
        txtIdEmpleado.setText(TablaEmpleados.getValueAt(col, 0).toString());
        txtNombreEmpleado.setText(TablaEmpleados.getValueAt(col, 2).toString());
        
    }//GEN-LAST:event_TablaEmpleadosKeyPressed

    private void TablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpleadosMouseClicked
        metodoRestablecer();
        
        int col = TablaEmpleados.getSelectedRow();
        txtIdEmpleado.setText(TablaEmpleados.getValueAt(col, 0).toString());
        txtNombreEmpleado.setText(TablaEmpleados.getValueAt(col, 1).toString());
        txtApellidoEmpleado.setText(TablaEmpleados.getValueAt(col, 2).toString());
        spnDia.setValue(Integer.parseInt((TablaEmpleados.getValueAt(col, 4)+"").substring(8, 10)));
        spnDia2.setValue(Integer.parseInt((TablaEmpleados.getValueAt(col, 5)+"").substring(8, 10)));
        spnA.setValue(Integer.parseInt((TablaEmpleados.getValueAt(col, 4)+"").substring(0, 4)));
        spnA2.setValue(Integer.parseInt((TablaEmpleados.getValueAt(col, 5)+"").substring(0, 4)));
        
        int genero = 0;
        
        if(TablaEmpleados.getValueAt(col, 3).equals("Disparos")) {
            genero = 1;
	}else if(TablaEmpleados.getValueAt(col, 3).equals("Terror")) {
            genero = 2;
	}
        
        cobGenero.setSelectedIndex(genero);
        
        int mes = 0;
        
        if((TablaEmpleados.getValueAt(col, 4)+"").substring(5, 7).equals("01")) {
            mes = 1;
	}else if((TablaEmpleados.getValueAt(col, 4)+"").substring(5, 7).equals("02")) {
            mes = 2;
	}else if((TablaEmpleados.getValueAt(col, 4)+"").substring(5, 7).equals("03")) {
            mes = 3;
	}else if((TablaEmpleados.getValueAt(col, 4)+"").substring(5, 7).equals("04")) {
            mes = 4;
	}else if((TablaEmpleados.getValueAt(col, 4)+"").substring(5, 7).equals("05")) {
            mes = 5;
	}else if((TablaEmpleados.getValueAt(col, 4)+"").substring(5, 7).equals("06")) {
            mes = 6;
	}else if((TablaEmpleados.getValueAt(col, 4)+"").substring(5, 7).equals("07")) {
            mes = 7;
	}else if((TablaEmpleados.getValueAt(col, 4)+"").substring(5, 7).equals("08")) {
            mes = 8;
	}else if((TablaEmpleados.getValueAt(col, 4)+"").substring(5, 7).equals("09")) {
            mes = 9;
	}else if((TablaEmpleados.getValueAt(col, 4)+"").substring(5, 7).equals("10")) {
            mes = 10;
	}else if((TablaEmpleados.getValueAt(col, 4)+"").substring(5, 7).equals("11")) {
            mes = 11;
	}else if((TablaEmpleados.getValueAt(col, 4)+"").substring(5, 7).equals("12")) {
            mes = 12;
	}
        
        cobMes.setSelectedIndex(mes);
        
        int mes2 = 0;
        
        if((TablaEmpleados.getValueAt(col, 5)+"").substring(5, 7).equals("01")) {
            mes2 = 1;
	}else if((TablaEmpleados.getValueAt(col, 5)+"").substring(5, 7).equals("02")) {
            mes2 = 2;
	}else if((TablaEmpleados.getValueAt(col, 5)+"").substring(5, 7).equals("03")) {
            mes2 = 3;
	}else if((TablaEmpleados.getValueAt(col, 5)+"").substring(5, 7).equals("04")) {
            mes2 = 4;
	}else if((TablaEmpleados.getValueAt(col, 5)+"").substring(5, 7).equals("05")) {
            mes2 = 5;
	}else if((TablaEmpleados.getValueAt(col, 5)+"").substring(5, 7).equals("06")) {
            mes2 = 6;
	}else if((TablaEmpleados.getValueAt(col, 5)+"").substring(5, 7).equals("07")) {
            mes2 = 7;
	}else if((TablaEmpleados.getValueAt(col, 5)+"").substring(5, 7).equals("08")) {
            mes2 = 8;
	}else if((TablaEmpleados.getValueAt(col, 5)+"").substring(5, 7).equals("09")) {
            mes2 = 9;
	}else if((TablaEmpleados.getValueAt(col, 5)+"").substring(5, 7).equals("10")) {
            mes2 = 10;
	}else if((TablaEmpleados.getValueAt(col, 5)+"").substring(5, 7).equals("11")) {
            mes2 = 11;
	}else if((TablaEmpleados.getValueAt(col, 5)+"").substring(5, 7).equals("12")) {
            mes2 = 12;
	}
        
        cobMes.setSelectedIndex(mes2);
    }//GEN-LAST:event_TablaEmpleadosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            if(txtIdEmpleado.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No olvides ingresar el titulo del juego", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                Procedimientos.eliminarJuego(txtIdEmpleado.getText());
                mostrarJuegosDisponibles(TablaEmpleados, "SELECT * FROM Vista_Juegos_Disponibles;");
                txtIdEmpleado.setText("");

                JOptionPane.showMessageDialog(this, "El empleado se a dado de baja");
            }
        }catch(SQLException e){

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        try {
            if(txtNombreEmpleado.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No olvides ingresar el nombre del empleado", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
            }else if(txtApellidoEmpleado.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No olvides ingresar el nombre del empleado", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
            }else if(cobGenero.getSelectedItem().equals("Seleccionar genero...")){
                JOptionPane.showMessageDialog(this, "No olvides selecionar un genero", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
            }else if(cobMes.getSelectedItem().equals("Seleccionar mes") || spnA.getValue().equals(0) || spnDia.getValue().equals(0)){
                JOptionPane.showMessageDialog(this, "No olvides ingresar la fecha de nacimiento completa", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
            }else if(cobMes2.getSelectedItem().equals("Seleccionar mes")|| spnA2.getValue().equals(0) || spnDia2.getValue().equals(0)){
                JOptionPane.showMessageDialog(this, "No olvides ingresar la fecha de contratacion completa", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
            }else if(txtIdEmpleado.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No olvides ingresar el id del juego", "Atencion!!!!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                
                mostrarJuegosDisponibles(TablaEmpleados, "SELECT * FROM Vista_Juegos_Disponibles;");
                txtNombreEmpleado.setText("");
                txtApellidoEmpleado.setText("");
                cobGenero.setSelectedIndex(0);
                cobMes.setSelectedIndex(0);
                cobMes2.setSelectedIndex(0);
                spnDia.setValue(0);
                spnDia.setValue(0);
                txtIdEmpleado.setText("");

                JOptionPane.showMessageDialog(this, "Modificacion completada!!!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void txtIdEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEmpleadoKeyReleased
        mostrarJuegosDisponibles(TablaEmpleados, "SELECT * FROM Vista_Juegos_Disponibles where idJuego like "+ "'" + txtIdEmpleado.getText()+ "%';");
    }//GEN-LAST:event_txtIdEmpleadoKeyReleased

    private void txtNombreEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoKeyReleased
        mostrarJuegosDisponibles(TablaEmpleados, "SELECT * FROM Vista_Juegos_Disponibles where titulo like "+ "'" + txtNombreEmpleado.getText()+ "%';");
    }//GEN-LAST:event_txtNombreEmpleadoKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        metodoRestablecer();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cobGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cobGeneroActionPerformed

    private void txtApellidoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoEmpleadoActionPerformed

    private void txtApellidoEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEmpleadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoEmpleadoKeyReleased

    static ResultSet res; 
    
    public void mostrarJuegosDisponibles(JTable tabla,String com){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        res=Conexiones.Conexion.Consulta(com);
        try {
            
            while(res.next()){
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getInt(6));
                v.add(res.getDouble(7));
                modelo.addRow(v);
                tabla.setModel(modelo);
            }
                
        } catch (Exception e) {
        }    
    }
    
    public void metodoRestablecer() {
	
        txtNombreEmpleado.setText("");
        txtIdEmpleado.setText("");
        txtApellidoEmpleado.setText("");
        cobGenero.setSelectedIndex(0);
        cobMes.setSelectedIndex(0);
	cobMes2.setSelectedIndex(0);
        spnDia.setValue(0);
        spnDia2.setValue(0);
        spnA.setValue(0);
        spnA2.setValue(0);
    }
    
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
            java.util.logging.Logger.getLogger(ABCCEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABCCEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABCCEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABCCEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABCCEmployees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEmpleados;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cobGenero;
    private javax.swing.JComboBox<String> cobMes;
    private javax.swing.JComboBox<String> cobMes2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad5;
    private javax.swing.JLabel lblEstudio5;
    private javax.swing.JLabel lblGenero5;
    private javax.swing.JLabel lblPlataforma5;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lblVender2;
    private javax.swing.JPanel panelABCCEmployees;
    private javax.swing.JSpinner spnA;
    private javax.swing.JSpinner spnA2;
    private javax.swing.JSpinner spnDia;
    private javax.swing.JSpinner spnDia2;
    private javax.swing.JTextField txtApellidoEmpleado;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtNombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
