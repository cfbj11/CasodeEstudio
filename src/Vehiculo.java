// Clase abstracta que representa vehículo genérico
abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Metodo abstracto que debe ser implementado por las subclases
    public abstract void mover();

    // Metodo que puede ser sobreescrito
    public String obtenerDetalles() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio;
    }
}
