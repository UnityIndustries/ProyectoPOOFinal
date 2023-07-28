package logico;

public class DiscoDuro extends Componente1 {
    private String modelo;
    private int capacidadAlmacenamiento;
    private String tipoConexion;

    public DiscoDuro(String numeroSerie, String marca, double precio, int cantidadDisponible,
                     String modelo, int capacidadAlmacenamiento, String tipoConexion) {
        super(numeroSerie, marca, precio, cantidadDisponible);
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
