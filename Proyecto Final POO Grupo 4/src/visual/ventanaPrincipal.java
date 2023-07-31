package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import logico.Cliente;
import logico.Combo;
import logico.Componente;
import logico.Factura;
import logico.Tienda;

public class ventanaPrincipal extends JFrame {

    private JPanel contentPane;
    private Tienda tienda;
    private JList listClientes;
    private JList listComponentes;
    private JList listCombos;
    private JList listFacturas;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ventanaPrincipal frame = new ventanaPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ventanaPrincipal() {
        tienda = new Tienda();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 617, 406);

        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        
        JMenu mnArchivo = new JMenu("Opciones");
        menuBar.add(mnArchivo);

        JMenuItem mntmSalir = new JMenuItem("Salir");
        mntmSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mnArchivo.add(mntmSalir);

        JMenu mnTienda = new JMenu("Tienda");
        menuBar.add(mnTienda);

        JMenuItem mntmAgregarCliente = new JMenuItem("Agregar Cliente");
        mntmAgregarCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DialogoAgregarCliente dialogo = new DialogoAgregarCliente(tienda);
                dialogo.setModal(true);
                dialogo.setVisible(true);
                actualizarUI();
            }
        });
        mnTienda.add(mntmAgregarCliente);

        JMenuItem mntmAgregarComponente = new JMenuItem("Agregar Componente");
        mntmAgregarComponente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DialogoAgregarComponente dialogo = new DialogoAgregarComponente(tienda);
                dialogo.setModal(true);
                dialogo.setVisible(true);
                actualizarUI();
            }
        });
        mnTienda.add(mntmAgregarComponente);

        JMenuItem mntmCrearCombo = new JMenuItem("Crear Combo");
        mntmCrearCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DialogoCrearCombo dialogo = new DialogoCrearCombo(tienda);
                dialogo.setModal(true);
                dialogo.setVisible(true);
                actualizarUI();
            }
        });
        mnTienda.add(mntmCrearCombo);

        JMenuItem mntmRealizarCompra = new JMenuItem("Realizar Compra");
        mntmRealizarCompra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DialogoComprar dialogo = new DialogoComprar(tienda);
                dialogo.setModal(true);
                dialogo.setVisible(true);
                actualizarUI();
            }
        });
        mnTienda.add(mntmRealizarCompra);

       
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        contentPane.add(tabbedPane, BorderLayout.CENTER);

        JPanel panelClientes = new JPanel();
        tabbedPane.addTab("Clientes", null, panelClientes, null);

        listClientes = new JList();
        panelClientes.add(listClientes);

        JPanel panelComponentes = new JPanel();
        tabbedPane.addTab("Componentes", null, panelComponentes, null);

        listComponentes = new JList();
        panelComponentes.add(listComponentes);

        JPanel panelCombos = new JPanel();
        tabbedPane.addTab("Combos", null, panelCombos, null);

        listCombos = new JList();
        panelCombos.add(listCombos);

        JPanel panelFacturas = new JPanel();
        tabbedPane.addTab("Facturas", null, panelFacturas, null);

        listFacturas = new JList();
        panelFacturas.add(listFacturas);

        actualizarUI();
    }

    private void actualizarUI() {
        DefaultListModel modelClientes = new DefaultListModel();
        for (Cliente cliente : tienda.getListaClientes()) {
            modelClientes.addElement(cliente.getNombre());
        }
        listClientes.setModel(modelClientes);

        DefaultListModel modelComponentes = new DefaultListModel();
        for (Componente componente : tienda.getListaComponentes()) {
            modelComponentes.addElement(componente.getMarca() + " " + componente.getClass().getSimpleName());
        }
        listComponentes.setModel(modelComponentes);

        DefaultListModel modelCombos = new DefaultListModel();
        for (Combo combo : tienda.getListaCombos()) {
            modelCombos.addElement(combo.getNombre());
        }
        listCombos.setModel(modelCombos);

        DefaultListModel modelFacturas = new DefaultListModel();
        for (Factura factura : tienda.getListaFacturas()) {
            modelFacturas.addElement("Factura #" + factura.getNumeroFactura() + " - " + factura.getClass().getName());
        }
        listFacturas.setModel(modelFacturas);
    }
}