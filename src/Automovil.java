// Clase que representa un Automóvil, hereda de Vehiculo e implementa Combustible y Mantenimiento
class Automovil extends Vehiculo implements Combustible, Mantenimiento {
    private double nivelCombustible;

    // Constructor de la clase Automovil que hereda atributos de clase Vehiculo
    public Automovil(String marca, String modelo, int anio, double nivelCombustible) {
        super(marca, modelo, anio);
        this.nivelCombustible = nivelCombustible;
    }

    // Sobreescritura de metodo mover() para Automovil.
    @Override
    public void mover() {
        if (nivelCombustible > 0) {
            System.out.println("El automóvil " + marca + " " + modelo + " está conduciendo.");
            nivelCombustible -= 0.5;
        } else {
            System.out.println("El automóvil " + marca + " " + modelo + " no tiene combustible.");
        }
    }

    // Sobreescritura de metodo obtenerDetalles() para incluir el nivel del combustible.
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Combustible: " + nivelCombustible + " litros";
    }

    // Metodo de interfaz combustible
    @Override
    public void recargarCombustible() {
        nivelCombustible = 50.0;
        System.out.println("El automóvil " + marca + " " + modelo + " ha sido recargado con combustible.");
    }

    // Metodo de interfaz combustible
    @Override
    public double obtenerNivelCombustible() {
        return nivelCombustible;
    }

    // Implementación de la interfaz Mantenimiento en la clase Automovil
    @Override
    public void realizarMantenimiento() {
        System.out.println("Revisando motor del automóvil " + marca + " " + modelo + ".");
    }
}
