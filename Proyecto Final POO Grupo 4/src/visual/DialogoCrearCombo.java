package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import logico.Combo;
import logico.Tienda;

public class DialogoCrearCombo extends JDialog {

    private JTextField textFieldNombre;
    private JTextField textFieldPrecioCombo;
    private Tienda tienda;

    public DialogoCrearCombo(Tienda tienda) {
        this.tienda = tienda;

        setBounds(100, 100, 618, 407);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JLabel lblNombre = new JLabel("Nombre:");
        getContentPane().add(lblNombre);

        textFieldNombre = new JTextField();
        getContentPane().add(textFieldNombre);
        textFieldNombre.setColumns(10);

        JLabel lblPrecioCombo = new JLabel("Precio del Combo:");
        getContentPane().add(lblPrecioCombo);

        textFieldPrecioCombo = new JTextField();
        getContentPane().add(textFieldPrecioCombo);
        textFieldPrecioCombo.setColumns(10);

        JPanel buttonPane = new JPanel();
        getContentPane().add(buttonPane);

        JButton okButton = new JButton("Guardar");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = textFieldNombre.getText();
                double precioCombo = Double.parseDouble(textFieldPrecioCombo.getText());
                Combo combo = new Combo(nombre, precioCombo);
                tienda.agregarCombo(combo);
                dispose();
            }
        });
        buttonPane.add(okButton);
    }
}