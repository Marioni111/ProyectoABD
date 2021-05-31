/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.Empleados.res;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author mario
 */
public class Graficas extends javax.swing.JFrame {

    /**
     * Creates new form Graficas
     */
    public Graficas() {
        initComponents();
        
        mostrarSalarios(tablaGraficas, "select * from vista_empleados_salario");
        
        DefaultPieDataset dataSet = new DefaultPieDataset();
        
        //dataSet.setValue("Nintendo Switch", new Double(obtenerInformacion("SELECT SUM(cantidad) FROM Vista_Juegos_Vendidos where plataforma = 'Nintendo switch';")));
        //dataSet.setValue("PlayStation 4", new Double(obtenerInformacion("SELECT SUM(cantidad) FROM Vista_Juegos_Vendidos where plataforma = 'Playstation 4';")));
        //dataSet.setValue("Xbox one", new Double(obtenerInformacion("SELECT SUM(cantidad) FROM Vista_Juegos_Vendidos where plataforma = 'Xbox one';")));
        
        JFreeChart ch = ChartFactory.createPieChart3D("Guerra de consolas", dataSet, true, true, false);
        ChartPanel cp = new ChartPanel(ch);
        panelGraficas.add(cp);
        cp.setBounds(250, 30, 300, 300);
    }
    
     public int obtenerInformacion(String com){
        res = Conexiones.Conexion.Consulta(com);
        int variable = 0;
        try {
            res.next();
            variable = res.getInt(1);  
        } catch (Exception e) {
        }
        return variable;
    }
     
    static ResultSet res; 
    
    public void mostrarSalarios(JTable tabla,String com){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        res=Conexiones.Conexion.Consulta(com);
        try {
            
            while(res.next()){
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getInt(4));
                modelo.addRow(v);
                tabla.setModel(modelo);
            }
                
        } catch (Exception e) {
        }    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGraficas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGraficas = new javax.swing.JTable();
        lblListaVentas = new javax.swing.JLabel();
        btnRegresar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGraficas.setBackground(new java.awt.Color(255, 255, 255));

        tablaGraficas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Emp_no", "Nombre", "Apellido", "Salario"
            }
        ));
        jScrollPane1.setViewportView(tablaGraficas);

        lblListaVentas.setText("Lista de Salarios");

        btnRegresar3.setText("Regresar");
        btnRegresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGraficasLayout = new javax.swing.GroupLayout(panelGraficas);
        panelGraficas.setLayout(panelGraficasLayout);
        panelGraficasLayout.setHorizontalGroup(
            panelGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficasLayout.createSequentialGroup()
                .addGroup(panelGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGraficasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGraficasLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblListaVentas))
                    .addGroup(panelGraficasLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnRegresar3)))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        panelGraficasLayout.setVerticalGroup(
            panelGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGraficasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblListaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnRegresar3)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGraficas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGraficas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar3ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresar3ActionPerformed

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
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListaVentas;
    private javax.swing.JPanel panelGraficas;
    private javax.swing.JTable tablaGraficas;
    // End of variables declaration//GEN-END:variables
}
