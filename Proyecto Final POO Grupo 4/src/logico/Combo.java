package logico;

import java.util.ArrayList;

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
	}

}
