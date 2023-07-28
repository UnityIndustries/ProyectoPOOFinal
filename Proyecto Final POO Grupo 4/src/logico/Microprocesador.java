package logico;

public class Microprocesador {
    private String marca;
    private String modelo;
    private String tipoConexion;
    private double velocidadProcesamiento;

    public Microprocesador(String marca, String modelo, String tipoConexion, double velocidadProcesamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.velocidadProcesamiento = velocidadProcesamiento;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public double getVelocidadProcesamiento() {
        return velocidadProcesamiento;
    }

    public void setVelocidadProcesamiento(double velocidadProcesamiento) {
        this.velocidadProcesamiento = velocidadProcesamiento;
    }
}
