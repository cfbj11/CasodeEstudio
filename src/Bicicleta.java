// Clase que representa una Bicicleta, hereda de Vehiculo
class Bicicleta extends Vehiculo {
    private int numeroMarchas;

    // Constructor de la clase Bicicleta
    public Bicicleta(String marca, String modelo, int anio, int numeroMarchas) {
        super(marca, modelo, anio);
        this.numeroMarchas = numeroMarchas;
    }

    // Sobreescritura de metodo mover() para Bicicleta.
    @Override
    public void mover() {
        System.out.println("La bicicleta " + marca + " " + modelo + " está pedaleando con " + numeroMarchas + " marchas.");
    }

    // Sobreescritura de metodo obtenerDetalles para incluir las marchas
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Marchas: " + numeroMarchas;
    }
}
