package logico;

public class MemoriaRAM extends Componente {

	private int cantidadMemoria; 
	private String tipoMemoria;

	public MemoriaRAM(String marca, double precio, int cantidadDisponible, String NumeroSerie, int cantidadMemoria, String tipoMemoria) {
		super(marca, precio, cantidadDisponible, NumeroSerie);
		this.cantidadMemoria = cantidadMemoria;
		this.tipoMemoria = tipoMemoria;
	}

	public int getCantidadMemoria() {
		return cantidadMemoria;
	}

	public void setCantidadMemoria(int cantidadMemoria) {
		this.cantidadMemoria = cantidadMemoria;
	}

	public String getTipoMemoria() {
		return tipoMemoria;
	}

	public void setTipoMemoria(String tipoMemoria) {
		this.tipoMemoria = tipoMemoria;
	}
}
