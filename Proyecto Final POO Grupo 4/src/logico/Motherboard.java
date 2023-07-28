package logico;

public class Motherboard extends Componente1 {
    private String modelo;
    private String tipoConectorMicro;
    private String tipoMemoriaRAM;
    private String listaConexionesDiscosDuros;

    public Motherboard(String numeroSerie, String marca, double precio, int cantidadDisponible,
                       String modelo, String tipoConectorMicro, String tipoMemoriaRAM, String listaConexionesDiscosDuros) {
        super(numeroSerie, marca, precio, cantidadDisponible);
        this.modelo = modelo;
        this.tipoConectorMicro = tipoConectorMicro;
        this.tipoMemoriaRAM = tipoMemoriaRAM;
        this.listaConexionesDiscosDuros = listaConexionesDiscosDuros;
    }

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConectorMicro() {
        return tipoConectorMicro;
    }

    public void setTipoConectorMicro(String tipoConectorMicro) {
        this.tipoConectorMicro = tipoConectorMicro;
    }

    public String getTipoMemoriaRAM() {
        return tipoMemoriaRAM;
    }

    public void setTipoMemoriaRAM(String tipoMemoriaRAM) {
        this.tipoMemoriaRAM = tipoMemoriaRAM;
    }

    public String getListaConexionesDiscosDuros() {
        return listaConexionesDiscosDuros;
    }

    public void setListaConexionesDiscosDuros(String listaConexionesDiscosDuros) {
        this.listaConexionesDiscosDuros = listaConexionesDiscosDuros;
    }
}
