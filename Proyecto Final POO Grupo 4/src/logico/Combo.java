package logico;

import java.util.ArrayList;

<<<<<<< HEAD
public class Combo extends Componente1 {
    private String nombre;
    private String descripcion;
    private ArrayList<Componente1> componentesIncluidos;

    public Combo(String nombre, double precio, String descripcion) {
        super("N/A", "N/A", precio, 0);
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.componentesIncluidos = new ArrayList<>();
    }

    public void agregarComponenteIncluido(Componente1 componente) {
        componentesIncluidos.add(componente);
    }

    public void eliminarComponenteIncluido(Componente1 componente) {
        componentesIncluidos.remove(componente);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
=======
public class Combo {
	
	private String nombre;
	private String descripcion;
	private double precio;
	private ArrayList<Componente> componentes;

	public Combo(String nombre, String descripcion, double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.componentes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ArrayList<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}
	
	public void agregarComponente(Componente componente) {
		this.componentes.add(componente);
>>>>>>> branch 'main' of https://github.com/UnityIndustries/ProyectoPOOFinal.git
	}

}
