package views;

import domain.*;
import java.util.ArrayList;
import javax.swing.*;

public class AgregarVehiculoView extends javax.swing.JFrame {

    public AgregarVehiculoView() {
        initComponents();
        cargarSucursales();
        setLocationRelativeTo(null);
    }

    private void cargarSucursales() {
        ArrayList<Sucursal> sucursales = Controlador.getSucursales();
        for (Sucursal s : sucursales) {
            cmbSucursal.addItem(s);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPatente = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblAnio = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        lblCapacidad = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        lblSucursal = new javax.swing.JLabel();
        cmbSucursal = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        lblKmLitro = new javax.swing.JLabel();
        txtKmLitro = new javax.swing.JTextField();
        lblLitrosExtra = new javax.swing.JLabel();
        txtLitrosExtra = new javax.swing.JTextField();
        lblKwh = new javax.swing.JLabel();
        txtKwh = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Vehículo");

        lblPatente.setText("Patente:");
        lblMarca.setText("Nombre Marca:");
        lblPais.setText("País de la Marca:");
        lblModelo.setText("Modelo:");
        lblAnio.setText("Año:");
        lblCapacidad.setText("Capacidad de Carga (kg):");
        lblSucursal.setText("Sucursal:");
        lblTipo.setText("Tipo de Vehículo:");
        lblKmLitro.setText("Km/litro (solo Combustible):");
        lblLitrosExtra.setText("Litros extra (solo Combustible):");
        lblKwh.setText("kWh base (solo Eléctrico):");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Eléctrico", "Combustible"}));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatente)
                    .addComponent(lblMarca)
                    .addComponent(lblPais)
                    .addComponent(lblModelo)
                    .addComponent(lblAnio)
                    .addComponent(lblCapacidad)
                    .addComponent(lblSucursal)
                    .addComponent(lblTipo)
                    .addComponent(lblKmLitro)
                    .addComponent(lblLitrosExtra)
                    .addComponent(lblKwh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatente)
                    .addComponent(txtMarca)
                    .addComponent(txtPais)
                    .addComponent(txtModelo)
                    .addComponent(txtAnio)
                    .addComponent(txtCapacidad)
                    .addComponent(cmbSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtKmLitro)
                    .addComponent(txtLitrosExtra)
                    .addComponent(txtKwh)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatente).addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca).addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais).addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo).addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnio).addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapacidad).addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSucursal).addComponent(cmbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo).addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKmLitro).addComponent(txtKmLitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLitrosExtra).addComponent(txtLitrosExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKwh).addComponent(txtKwh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        pack();
    }//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String patente = txtPatente.getText();
            Marca marca = new Marca(txtMarca.getText(), txtPais.getText());
            String modelo = txtModelo.getText();
            int anio = Integer.parseInt(txtAnio.getText());
            double capacidad = Double.parseDouble(txtCapacidad.getText());
            Sucursal sucursal = (Sucursal) cmbSucursal.getSelectedItem();

            Vehiculo v;
            if (cmbTipo.getSelectedItem().equals("Eléctrico")) {
                double kwh = Double.parseDouble(txtKwh.getText());
                v = new VehiculoElectrico(patente, marca, modelo, anio, capacidad, sucursal, kwh);
            } else {
                double kmLitro = Double.parseDouble(txtKmLitro.getText());
                double litrosExtra = Double.parseDouble(txtLitrosExtra.getText());
                v = new VehiculoCombustible(patente, marca, modelo, anio, capacidad, sucursal, kmLitro, litrosExtra);
            }

            Controlador.agregarVehiculo(v);
            JOptionPane.showMessageDialog(this, "Vehículo agregado correctamente!");
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: verificá los datos ingresados.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Sucursal> cmbSucursal;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblKmLitro;
    private javax.swing.JLabel lblKwh;
    private javax.swing.JLabel lblLitrosExtra;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPatente;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtKmLitro;
    private javax.swing.JTextField txtKwh;
    private javax.swing.JTextField txtLitrosExtra;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}