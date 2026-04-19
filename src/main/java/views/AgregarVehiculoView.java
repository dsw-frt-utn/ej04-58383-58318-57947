package views;
// Ventana para el alta de vehículos - Axel Facundo Salinas

import domain.*;
import data.Persistencia;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AgregarVehiculoView extends JFrame {

    public AgregarVehiculoView() {
        setTitle("Agregar Vehículo");
        setSize(400, 550);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(0, 2, 5, 5));
        setLocationRelativeTo(null);

        // Campos
        add(new JLabel("Patente:"));
        JTextField txtPatente = new JTextField();
        add(txtPatente);

        add(new JLabel("Nombre Marca:"));
        JTextField txtMarca = new JTextField();
        add(txtMarca);

        add(new JLabel("País de la Marca:"));
        JTextField txtPais = new JTextField();
        add(txtPais);

        add(new JLabel("Modelo:"));
        JTextField txtModelo = new JTextField();
        add(txtModelo);

        add(new JLabel("Año:"));
        JTextField txtAnio = new JTextField();
        add(txtAnio);

        add(new JLabel("Capacidad de Carga (kg):"));
        JTextField txtCapacidad = new JTextField();
        add(txtCapacidad);

        add(new JLabel("Sucursal:"));
        ArrayList<Sucursal> sucursales = Persistencia.getSucursales();
        JComboBox<Sucursal> cmbSucursal = new JComboBox<>();
        for (Sucursal s : sucursales) cmbSucursal.addItem(s);
        add(cmbSucursal);

        add(new JLabel("Tipo de Vehículo:"));
        String[] tipos = {"Eléctrico", "Combustible"};
        JComboBox<String> cmbTipo = new JComboBox<>(tipos);
        add(cmbTipo);

        // Panel para campos específicos
        add(new JLabel("km/litro (solo Combustible):"));
        JTextField txtKmLitro = new JTextField();
        add(txtKmLitro);

        add(new JLabel("Litros extra (solo Combustible):"));
        JTextField txtLitrosExtra = new JTextField();
        add(txtLitrosExtra);

        add(new JLabel("kWh base (solo Eléctrico):"));
        JTextField txtKwh = new JTextField();
        add(txtKwh);

        // Botón guardar
        JButton btnGuardar = new JButton("Guardar");
        add(new JLabel());
        add(btnGuardar);

        btnGuardar.addActionListener(e -> {
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

                Persistencia.agregarVehiculo(v);
                JOptionPane.showMessageDialog(this, "Vehículo agregado correctamente!");
                dispose();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: verificá los datos ingresados.");
            }
        });

        setVisible(true);
    }
}
