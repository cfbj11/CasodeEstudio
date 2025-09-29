// Nueva clase Motocicleta, hereda Vehiculo e implementa la interfaz Combustible y Mantenimiento
class Motocicleta extends Vehiculo implements Combustible, Mantenimiento {
    private int cilindrada; // Atributo adicional
    private double nivelCombustible;

    // Constructor de clase Motocicleta que hereda atributos de clase Vehiculo
    public Motocicleta(String marca, String modelo, int anio, int cilindrada, double nivelCombustible) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
        this.nivelCombustible = nivelCombustible;
    }

    // Sobreescritura de metodo mover() para Motocicleta. Contiene condicional en caso de que la motocicleta tenga o no combustible
    @Override
    public void mover() {
        if (nivelCombustible > 0) {
            System.out.println("La motocicleta " + marca + " " + modelo + " está acelerando con " + cilindrada + " cc.");
            nivelCombustible -= 0.3;
        } else {
            System.out.println("La motocicleta " + marca + " " + modelo + " no tiene combustible.");
        }
    }

    // Sobreescritura de metodo obtenerDetalles() para incluir cilindrada
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Cilindrada " + cilindrada + " cc, Combustible " + nivelCombustible + " litros.";
    }

    // Metodo de interfaz combustible
    @Override
    public void recargarCombustible() {
        nivelCombustible = 20.0;
        System.out.println("La motocicleta " + marca + " " + modelo + " ha sido recargada con combustible.");
    }

    // Metodo de interfaz combustible
    @Override
    public double obtenerNivelCombustible() {
        return nivelCombustible;
    }

    // Implementación de la interfaz Mantenimiento en la clase Motocicleta
    @Override
    public void realizarMantenimiento() {
        System.out.println("Cambiando aceite de la motocicleta: " + marca + " " + modelo + ".");
    }
}
