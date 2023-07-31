package logico;

import java.util.ArrayList;

public class Factura {
	private int numeroFactura; 
	private String fechaEmision; 
	private String nombreCliente; 
	private ArrayList<Componente> listaComponentes; 
	private ArrayList<Combo> listaCombos; 

	public Factura(int numeroFactura, String fechaEmision, String nombreCliente) {
		this.numeroFactura = numeroFactura;
		this.fechaEmision = fechaEmision;
		this.nombreCliente = nombreCliente;
		this.listaComponentes = new ArrayList<Componente>();
		this.listaCombos = new ArrayList<Combo>();
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public ArrayList<Componente> getListaComponentes() {
		return listaComponentes;
	}

	public void setListaComponentes(ArrayList<Componente> listaComponentes) {
		this.listaComponentes = listaComponentes;
	}

	public ArrayList<Combo> getListaCombos() {
		return listaCombos;
	}

	public void setListaCombos(ArrayList<Combo> listaCombos) {
		this.listaCombos = listaCombos;
	}

	
	public void agregarComponente(Componente componente) {
		this.listaComponentes.add(componente);
	}

	
	public void eliminarComponente(Componente componente) {
		this.listaComponentes.remove(componente);
	}


	public void agregarCombo(Combo combo) {
		this.listaCombos.add(combo);
	}


	public void eliminarCombo(Combo combo) {
		this.listaCombos.remove(combo);
	}


	public double calcularPrecioTotal() {
		double precioTotal = 0.0;

		for (Componente componente : listaComponentes) {
			precioTotal += componente.getPrecio();
		}
		for (Combo combo : listaCombos) {
			precioTotal += combo.getPrecioCombo();
		}
		return precioTotal;
	}
}
