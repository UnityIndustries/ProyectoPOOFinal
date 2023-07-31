package logico;

import java.util.ArrayList;

public class Cliente {
	private String nombre; 
	private String telefono; 
	private String cedula; 
	private ArrayList<Factura> listaFacturas;

	public Cliente(String nombre, String telefono, String cedula) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.cedula = cedula;
		this.listaFacturas = new ArrayList<Factura>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Factura> getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(ArrayList<Factura> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}

	
	public void agregarFactura(Factura factura) {
		this.listaFacturas.add(factura);
	}


	public void eliminarFactura(Factura factura) {
		this.listaFacturas.remove(factura);
	}


	public void comprarCombo(Combo combo) {
		int numeroFactura = 1; 
		String fechaEmision = "01/01/2022"; 
		String nombreCliente = this.nombre; 

		Factura factura = new Factura(numeroFactura, fechaEmision, nombreCliente); 
		factura.agregarCombo(combo); 
		agregarFactura(factura); 
	}

	
	public void comprarComponente(Componente componente) {
		int numeroFactura = 2;
		String fechaEmision = "01/01/2022"; 
		String nombreCliente = this.nombre;

		Factura factura = new Factura(numeroFactura, fechaEmision, nombreCliente); 
		factura.agregarComponente(componente);
		agregarFactura(factura);
	}
}
