package logico;

public class MemoriaRAM extends Componente1 {
    private int cantidadMemoria;
    private String tipoMemoria;

    public MemoriaRAM(String numeroSerie, String marca, double precio, int cantidadDisponible,
                      int cantidadMemoria, String tipoMemoria) {
        super(numeroSerie, marca, precio, cantidadDisponible);
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
