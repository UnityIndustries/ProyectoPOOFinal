package visual;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logico.Cliente;
import logico.Tienda;

public class DialogoAgregarCliente extends JDialog {

    private JTextField textFieldNombre;
    private JTextField textFieldTelefono;
    private JTextField textFieldCedula;
    private Tienda tienda;

    public DialogoAgregarCliente(Tienda tienda) {
        this.tienda = tienda;

        setBounds(100, 100, 617, 404);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JLabel lblNombre = new JLabel("Nombre:");
        getContentPane().add(lblNombre);

        textFieldNombre = new JTextField();
        getContentPane().add(textFieldNombre);
        textFieldNombre.setColumns(10);

        JLabel lblTelefono = new JLabel("Teléfono:");
        getContentPane().add(lblTelefono);

        textFieldTelefono = new JTextField();
        getContentPane().add(textFieldTelefono);
        textFieldTelefono.setColumns(10);

        JLabel lblCedula = new JLabel("Cédula:");
        getContentPane().add(lblCedula);

        textFieldCedula = new JTextField();
        getContentPane().add(textFieldCedula);
        textFieldCedula.setColumns(10);

        JPanel buttonPane = new JPanel();
        getContentPane().add(buttonPane);

        JButton okButton = new JButton("Guardar");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = textFieldNombre.getText();
                String telefono = textFieldTelefono.getText();
                String cedula = textFieldCedula.getText();
                Cliente cliente = new Cliente(nombre, telefono, cedula);
                tienda.agregarCliente(cliente);
                dispose();
            }
        });
        buttonPane.add(okButton);
    }
}
