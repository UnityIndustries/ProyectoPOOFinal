package visual;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logico.Componente;
import logico.DiscoDuro;
import logico.MemoriaRAM;
import logico.Microprocesador;
import logico.Motherboard;
import logico.Tienda;

public class DialogoAgregarComponente extends JDialog {

    private JComboBox comboBoxTipoComponente;
    private JTextField textFieldMarca;
    private JTextField textFieldPrecio;
    private JTextField textFieldCantidadDisponible;
    private JTextField textFieldNumeroSerie;
    private Tienda tienda;

    public DialogoAgregarComponente(Tienda tienda) {
        this.tienda = tienda;

        setBounds(100, 100, 649, 413);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JLabel lblTipoComponente = new JLabel("Tipo de Componente:");
        getContentPane().add(lblTipoComponente);

        comboBoxTipoComponente = new JComboBox();
        comboBoxTipoComponente.addItem("Motherboard");
        comboBoxTipoComponente.addItem("MemoriaRAM");
        comboBoxTipoComponente.addItem("DiscoDuro");
        comboBoxTipoComponente.addItem("Microprocesador");
        getContentPane().add(comboBoxTipoComponente);

        JLabel lblMarca = new JLabel("Marca:");
        getContentPane().add(lblMarca);

        textFieldMarca = new JTextField();
        getContentPane().add(textFieldMarca);
        textFieldMarca.setColumns(10);

        JLabel lblPrecio = new JLabel("Precio:");
        getContentPane().add(lblPrecio);

        textFieldPrecio = new JTextField();
        getContentPane().add(textFieldPrecio);
        textFieldPrecio.setColumns(10);

        JLabel lblCantidadDisponible = new JLabel("Cantidad Disponible:");
        getContentPane().add(lblCantidadDisponible);

        textFieldCantidadDisponible = new JTextField();
        getContentPane().add(textFieldCantidadDisponible);
        textFieldCantidadDisponible.setColumns(10);

        JLabel lblNumeroSerie = new JLabel("Número de Serie:");
        getContentPane().add(lblNumeroSerie);

        textFieldNumeroSerie = new JTextField();
        getContentPane().add(textFieldNumeroSerie);
        textFieldNumeroSerie.setColumns(10);

        JPanel buttonPane = new JPanel();
        getContentPane().add(buttonPane);
        
        JButton okButton = new JButton("Guardar");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tipoComponente = (String) comboBoxTipoComponente.getSelectedItem();
                String marca = textFieldMarca.getText();
                double precio = Double.parseDouble(textFieldPrecio.getText());
                int cantidadDisponible = Integer.parseInt(textFieldCantidadDisponible.getText());
                String numeroSerie = textFieldNumeroSerie.getText();
                Componente componente = null;
                switch (tipoComponente) {
                    case "Motherboard":
                        componente = new Motherboard(marca, precio, cantidadDisponible, numeroSerie, "", "", "", 0);
                        break;
                    case "MemoriaRAM":
                        componente = new MemoriaRAM(marca, precio, cantidadDisponible, numeroSerie, 0, "");
                        break;
                    case "DiscoDuro":
                        componente = new DiscoDuro(marca, precio, cantidadDisponible, numeroSerie, "", 0, "");
                        break;
                    case "Microprocesador":
                        componente = new Microprocesador(marca, precio, cantidadDisponible, numeroSerie, "", "", 0);
                        break;
                }
                if (componente != null) {
                    tienda.agregarComponente(componente);
                }
                dispose();
            }
        });
        buttonPane.add(okButton);
    }
}