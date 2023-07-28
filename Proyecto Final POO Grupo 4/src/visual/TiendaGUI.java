package visual;

import javax.swing.*;
import java.awt.*;

public class TiendaGUI extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblCliente, lblComponente, lblCantidad;
    private JTextField txtCliente;
    private JComboBox<String> cmbComponente;
    private JSpinner spnCantidad;
    private JButton btnAgregar, btnEliminar;
    private JTextArea txtAreaFactura;

    public TiendaGUI() {
        super("Tienda de Computadoras");
        initComponents();
        setLayout();
    }

    private void initComponents() {
        lblCliente = new JLabel("Cliente:");
        lblComponente = new JLabel("Componente:");
        lblCantidad = new JLabel("Cantidad:");

        txtCliente = new JTextField(20);

        cmbComponente = new JComboBox<>();
        cmbComponente.addItem("Motherboard");
        cmbComponente.addItem("Memoria RAM");
        cmbComponente.addItem("Disco Duro");
        cmbComponente.addItem("Microprocesador");

        spnCantidad = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));

        btnAgregar = new JButton("Agregar");
        btnEliminar = new JButton("Eliminar");

        txtAreaFactura = new JTextArea(10, 30);
        txtAreaFactura.setEditable(false);
    }

    private void setLayout() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);
        panel.add(lblCliente, c);

        c.gridx = 1;
        panel.add(txtCliente, c);

        c.gridy = 1;
        c.gridx = 0;
        panel.add(lblComponente, c);

        c.gridx = 1;
        panel.add(cmbComponente, c);

        c.gridy = 2;
        c.gridx = 0;
        panel.add(lblCantidad, c);

        c.gridx = 1;
        panel.add(spnCantidad, c);

        c.gridy = 3;
        c.gridx = 0;
        panel.add(btnAgregar, c);

        c.gridx = 1;
        panel.add(btnEliminar, c);

        c.gridy = 4;
        c.gridx = 0;
        c.gridwidth = 2;
        panel.add(new JScrollPane(txtAreaFactura), c);

        add(panel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TiendaGUI());
    }
}

