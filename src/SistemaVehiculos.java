// Clase principal para probar el sistema
public class SistemaVehiculos {

    // Metodo estático que recibe un arreglo de vehículos y llama a los metodos mover() y obtenerDetalles()
    // Si el vehículo implementa Combustible también llama a obtenerNivelCombustible() y recargarCombustible()
    public static void procesarVehiculos(Vehiculo[] vehiculos){
        for (Vehiculo v : vehiculos) {
            v.mover();
            System.out.println(v.obtenerDetalles());

            if (v instanceof Combustible) {
                Combustible c = (Combustible) v;
                System.out.println("Nivel de combustible: " + c.obtenerNivelCombustible());
                c.recargarCombustible();
                System.out.println("Nivel de combustible tras recarga: " + c.obtenerNivelCombustible());
            }

            if (v instanceof Mantenimiento) {
                ((Mantenimiento) v).realizarMantenimiento();
            }

            System.out.println("\n******************************\n");
        }
    }

    public static void main(String[] args) {
        // Crear instancias de vehiculos
        Vehiculo auto = new Automovil("Toyota", "Corolla", 2022, 40.0);
        Vehiculo bici = new Bicicleta("Trek", "Mountain", 2022, 21);
        Vehiculo moto = new Motocicleta("Ducati", "Panigale", 2025, 250, 20.0);

        System.out.println("\n------------------------------");
        System.out.println("Probando Código Fuente.\n");

        // Probar polimorfismo
        auto.mover();
        System.out.println(auto.obtenerDetalles());
        ((Combustible) auto).recargarCombustible();
        System.out.println("Nivel de combustible: " + ((Combustible) auto).obtenerNivelCombustible());

        bici.mover();
        System.out.println(bici.obtenerDetalles());

        System.out.println("\n------------------------------");
        System.out.println("Probando Extensión del Sistema con clase Motocicleta.\n");

        // Probando metodos de la clase Motocicleta
        moto.mover();
        System.out.println(moto.obtenerDetalles());
        ((Combustible) moto).recargarCombustible();
        System.out.println("Nivel de combustible: " + ((Combustible) moto).obtenerNivelCombustible());

        System.out.println("\n------------------------------");
        System.out.println("Probando implementación de la nueva interfaz Mantenimiento.\n");

        // Probar mantenimiento de los vehículos que implementan la interfaz Mantenimiento
        if (auto instanceof Mantenimiento) {
            ((Mantenimiento) auto).realizarMantenimiento();
        }
        if (moto instanceof Mantenimiento) {
            ((Mantenimiento) moto).realizarMantenimiento();
        }

        System.out.println("\n------------------------------");
        System.out.println("Probando programa completo con Polimorfismo Avanzado.\n");

        // Arreglo que contiene instancias de 'Automovil', 'Bicicleta' y 'Motocicleta'.
        Vehiculo[] vehiculos = {auto, bici, moto};
        // Llama al metodo estático procesarVehiculos
        procesarVehiculos(vehiculos);
    }
}