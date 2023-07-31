package logico;

public class DiscoDuro extends Componente {

	private String modelo; 
	private int capacidadAlmacenamiento; 
	private String tipoConexion; 

	public DiscoDuro(String marca, double precio, int cantidadDisponible, String NumeroSerie, String modelo, int capacidadAlmacenamiento, String tipoConexion) {
		super(marca, precio, cantidadDisponible, NumeroSerie);
		this.modelo = modelo;
		this.capacidadAlmacenamiento = capacidadAlmacenamiento;
		this.tipoConexion = tipoConexion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadAlmacenamiento() {
		return capacidadAlmacenamiento;
	}

	public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
		this.capacidadAlmacenamiento = capacidadAlmacenamiento;
	}

	public String getTipoConexion() {
		return tipoConexion;
	}

	public void setTipoConexion(String tipoConexion) {
		this.tipoConexion = tipoConexion;
	}
}
