package logico;

public abstract class Componente {

	protected String marca; 
	protected double precio; 
	protected int cantidadDisponible; 
	protected String NumeroSerie; 

	public Componente(String marca, double precio, int cantidadDisponible, String NumeroSerie){
		this.marca=marca;
		this.precio=precio;
		this.cantidadDisponible=cantidadDisponible;
		this.NumeroSerie=NumeroSerie;   
	}

	
	public double getPrecio() { return precio; }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	public String getNumeroSerie() {
		return NumeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		NumeroSerie = numeroSerie;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}

