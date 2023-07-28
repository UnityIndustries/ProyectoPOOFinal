package logico;

public class Componente1 {
    private String numeroSerie;
    private String marca;
    private double precio;
    private int cantidadDisponible;

    public Componente1(String numeroSerie, String marca, double precio, int cantidadDisponible) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    
    public void Componente(final String numeroSerie2, final String marca2, final double precio2, final int cantidadDisponible2) {
	
	}


	public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}

