// Clase abstracta base para todos los vehículos
abstract class Vehicle {
    protected String brand; // Marca del vehículo
    protected int year;     // Año de fabricación

    // Constructor de la clase abstracta
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Método abstracto que las subclases deben implementar
    public abstract void start();

    // Método concreto compartido entre todas las subclases
    public void displayInfo() {
        System.out.println("Marca: " + brand + ", Año: " + year);
    }
}

// Clase concreta para automóviles
class Car extends Vehicle {
    private int doors; // Número de puertas

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("El automóvil arranca girando la llave o presionando un botón.");
    }

    public void openDoors() {
        System.out.println("Abriendo " + doors + " puertas.");
    }
}

// Clase concreta para motocicletas
class Motorcycle extends Vehicle {
    private boolean hasSidecar; // Indica si tiene sidecar

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void start() {
        System.out.println("La motocicleta arranca con el botón de encendido o patada.");
    }

    public void checkSidecar() {
        if (hasSidecar) {
            System.out.println("Esta motocicleta tiene sidecar.");
        } else {
            System.out.println("Esta motocicleta no tiene sidecar.");
        }
    }
}

// Clase concreta para camiones
class Truck extends Vehicle {
    private double loadCapacity; // Capacidad de carga en toneladas

    public Truck(String brand, int year, double loadCapacity) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("El camión arranca girando la llave y revisando los sistemas.");
    }

    public void displayLoadCapacity() {
        System.out.println("Capacidad de carga: " + loadCapacity + " toneladas.");
    }
}

// Clase principal para demostrar el uso
public class Main {
    public static void main(String[] args) {
        // Crear instancias de diferentes vehículos
        Vehicle car = new Car("Toyota", 2022, 4);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", 2020, false);
        Vehicle truck = new Truck("Volvo", 2018, 15.0);

        // Demostrar comportamiento polimórfico
        car.displayInfo();
        car.start();
        if (car instanceof Car) {
            ((Car) car).openDoors();
        }

        motorcycle.displayInfo();
        motorcycle.start();
        if (motorcycle instanceof Motorcycle) {
            ((Motorcycle) motorcycle).checkSidecar();
        }

        truck.displayInfo();
        truck.start();
        if (truck instanceof Truck) {
            ((Truck) truck).displayLoadCapacity();
        }
    }
}
