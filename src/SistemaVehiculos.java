// Clase principal para probar el sistema
public class SistemaVehiculos {
    public static void main(String[] args) {
        // Crear instancias de vehiculos
        Vehiculo auto = new Automovil("Toyota", "Corolla", 2022, 40.0);
        Vehiculo bici = new Bicicleta("Trek", "Mountain", 2022, 21);
        Vehiculo moto = new Motocicleta("Ducati", "Panigale", 2025, 1103);

        // Probar polimorfismo
        auto.mover();
        System.out.println(auto.obtenerDetalles());
        ((Combustible) auto).recargarCombustible();
        System.out.println("Nivel de combustible:" + ((Combustible) auto).obtenerNivelCombustible());

        bici.mover();
        System.out.println(bici.obtenerDetalles());

        // Probando metodos de la clase Motocicleta
        moto.mover();
        System.out.println(moto.obtenerDetalles());
        ((Combustible) moto).recargarCombustible();
        System.out.println("Nivel de combustible: " + ((Combustible) moto).obtenerNivelCombustible());
    }
}