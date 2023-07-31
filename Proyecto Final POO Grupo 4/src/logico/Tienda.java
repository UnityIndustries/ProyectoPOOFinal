package logico;

import java.util.ArrayList;

public class Tienda {
	private ArrayList<Componente> listaComponentes; 
	private ArrayList<Cliente> listaClientes; 
	private ArrayList<Factura> listaFacturas; 
	private ArrayList<Combo> listaCombos; 

	public Tienda() {
		this.listaComponentes = new ArrayList<Componente>();
		this.listaClientes = new ArrayList<Cliente>();
		this.listaFacturas = new ArrayList<Factura>();
		this.listaCombos = new ArrayList<Combo>();
	}

	public ArrayList<Componente> getListaComponentes() {
		return listaComponentes;
	}

	public void setListaComponentes(ArrayList<Componente> listaComponentes) {
		this.listaComponentes = listaComponentes;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Factura> getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(ArrayList<Factura> listaFacturas) {
		this.listaFacturas = listaFacturas;
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

	public void agregarCliente(Cliente cliente) {
		this.listaClientes.add(cliente);
	}

	public void eliminarCliente(Cliente cliente) {
		this.listaClientes.remove(cliente);
	}

	public void agregarCombo(Combo combo) {
		this.listaCombos.add(combo);
	}

	public void eliminarCombo(Combo combo) {
		this.listaCombos.remove(combo);
	}

	public void agregarFactura(Factura factura) {
		this.listaFacturas.add(factura);
	}
}

