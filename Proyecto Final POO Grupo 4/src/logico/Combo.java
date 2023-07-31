package logico;

import java.util.ArrayList;

public class Combo {
	private String nombre; 
	private double precioCombo; 
	private ArrayList<Componente> listaComponentes; 

	public Combo(String nombre, double precioCombo) {
		this.nombre = nombre;
		this.precioCombo = precioCombo;
		this.listaComponentes = new ArrayList<Componente>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Componente> getListaComponentes() {
		return listaComponentes;
	}

	public void setListaComponentes(ArrayList<Componente> listaComponentes) {
		this.listaComponentes = listaComponentes;
	}

	public void setPrecioCombo(double precioCombo) {
		this.precioCombo = precioCombo;
	}

	public double getPrecioCombo() { return precioCombo; }

	public void agregarComponente(Componente componente) { 
		listaComponentes.add(componente); 
	}

	public void eliminarComponente(Componente componente) { 
		listaComponentes.remove(componente); 
	}

}
