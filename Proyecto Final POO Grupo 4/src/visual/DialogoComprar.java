package visual;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logico.Cliente;
import logico.Factura;
import logico.Tienda;

public class DialogoComprar extends JDialog {

    private JComboBox comboBoxCliente;
    private Tienda tienda;

    public DialogoComprar(Tienda tienda) {
        this.tienda = tienda;

        setBounds(100, 100, 617, 407);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JLabel lblCliente = new JLabel("Cliente:");
        getContentPane().add(lblCliente);

        comboBoxCliente = new JComboBox();
        for (Cliente cliente : tienda.getListaClientes()) {
            comboBoxCliente.addItem(cliente.getNombre());
        }
        getContentPane().add(comboBoxCliente);

        JPanel buttonPane = new JPanel();
        getContentPane().add(buttonPane);

        JButton okButton = new JButton("Comprar");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombreCliente = (String) comboBoxCliente.getSelectedItem();
                Cliente cliente = null;
                for (Cliente c : tienda.getListaClientes()) {
                    if (c.getNombre().equals(nombreCliente)) {
                        cliente = c;
                        break;
                    }
                }
                if (cliente != null) {
                    Factura factura = new Factura(tienda.getListaFacturas().size() + 1, "fecha", nombreCliente);
                    tienda.agregarFactura(factura);
                    cliente.agregarFactura(factura);
                }
                dispose();
            }
        });
        buttonPane.add(okButton);
    }
}

