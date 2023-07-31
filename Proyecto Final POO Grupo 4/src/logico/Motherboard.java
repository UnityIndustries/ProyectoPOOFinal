package logico;

public class Motherboard extends Componente {
	private String modelo; 
	private String tipoConectorSocket; 
	private String tipoMemoriaRAM; 
	private int conexionesParaDiscosDuros; 

	public Motherboard(String marca, double precio, int cantidadDisponible, String NumeroSerie, String modelo, String tipoConectorSocket, String tipoMemoriaRAM, int conexionesParaDiscosDuros) {
		super(marca, precio, cantidadDisponible, NumeroSerie);
		this.modelo = modelo;
		this.tipoConectorSocket = tipoConectorSocket;
		this.tipoMemoriaRAM = tipoMemoriaRAM;
		this.conexionesParaDiscosDuros = conexionesParaDiscosDuros;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoConectorSocket() {
		return tipoConectorSocket;
	}

	public void setTipoConectorSocket(String tipoConectorSocket) {
		this.tipoConectorSocket = tipoConectorSocket;
	}

	public String getTipoMemoriaRAM() {
		return tipoMemoriaRAM;
	}

	public void setTipoMemoriaRAM(String tipoMemoriaRAM) {
		this.tipoMemoriaRAM = tipoMemoriaRAM;
	}

	public int getConexionesParaDiscosDuros() {
		return conexionesParaDiscosDuros;
	}

	public void setConexionesParaDiscosDuros(int conexionesParaDiscosDuros) {
		this.conexionesParaDiscosDuros = conexionesParaDiscosDuros;
	}

}
