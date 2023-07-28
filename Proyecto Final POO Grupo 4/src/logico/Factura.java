package logico;

import java.util.ArrayList;

public class Factura {
    private int numeroFactura;
    private Cliente cliente;
    private ArrayList<Componente1> componentes;
    private double total;

    public Factura(int numeroFactura, Cliente cliente) {
        this.setNumeroFactura(numeroFactura);
        this.setCliente(cliente);
        this.componentes = new ArrayList<>();
        this.setTotal(0.0);
    }

    public void agregarComponente(Componente1 componente) {
        componentes.add(componente);
        calcularTotal();
    }

    public void eliminarComponente(Componente1 componente) {
        componentes.remove(componente);
        calcularTotal();
    }

    private void calcularTotal() {
        setTotal(0.0);
        for (Componente1 componente : componentes) {
            setTotal(getTotal() + componente.getPrecio());
        }
    }

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}

