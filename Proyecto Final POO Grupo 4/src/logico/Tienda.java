package logico;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Cliente> clientes;
    private ArrayList<Factura> facturas;
    private ArrayList<Componente1> inventario;

    public Tienda() {
        clientes = new ArrayList<>();
        facturas = new ArrayList<>();
        inventario = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Factura crearFactura(int numeroFactura, Cliente cliente) {
        Factura factura = new Factura(numeroFactura, cliente);
        facturas.add(factura);
        return factura;
    }

    public void agregarComponenteAlInventario(Componente1 componente) {
        inventario.add(componente);
    }

    public void eliminarComponenteDelInventario(Componente1 componente) {
        inventario.remove(componente);
    }

    public Componente1 buscarComponentePorNumeroSerie(String numeroSerie) {
        for (Componente1 componente : inventario) {
            if (componente.getNumeroSerie().equals(numeroSerie)) {
                return componente;
            }
        }
        return null;
    }

}

