package logico;

public class Microprocesador extends Componente {

	private String modelo; 
	private String tipoConexionSocket; 
	private double velocidadProcesamiento;

	public Microprocesador(String marca, double precio, int cantidadDisponible, String NumeroSerie, String modelo, String tipoConexionSocket, double velocidadProcesamiento) {
		super(marca, precio, cantidadDisponible, NumeroSerie);
		this.modelo = modelo;
		this.tipoConexionSocket = tipoConexionSocket;
		this.velocidadProcesamiento = velocidadProcesamiento;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoConexionSocket() {
		return tipoConexionSocket;
	}

	public void setTipoConexionSocket(String tipoConexionSocket) {
		this.tipoConexionSocket = tipoConexionSocket;
	}

	public double getVelocidadProcesamiento() {
		return velocidadProcesamiento;
	}

	public void setVelocidadProcesamiento(double velocidadProcesamiento) {
		this.velocidadProcesamiento = velocidadProcesamiento;
	}
}