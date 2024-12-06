// Clase principal donde se ejecuta el programa.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Demostración de Herencia y Polimorfismo ===");

        // Creamos un objeto de la clase Persona. 
        // Esto muestra cómo podemos usar la clase base directamente.
        Persona persona = new Persona("Carlos", 40, "12345678A");

        // Creamos un objeto de la clase Empleado. 
        // La clase Empleado hereda atributos y métodos de Persona.
        Empleado empleado = new Empleado("Laura", 30, "87654321B", "Ingeniera de Software", 5000.00);

        // Creamos un objeto de la clase Estudiante. 
        // La clase Estudiante también hereda de Persona, pero agrega atributos propios.
        Estudiante estudiante = new Estudiante("Miguel", 20, "11223344C", "Ingeniería", 8.5);

        // **Demostración de Polimorfismo**
        // Usamos el mismo método `mostrarInformacion` con objetos de diferentes clases.
        System.out.println("\nInformación de Persona:");
        System.out.println(persona.mostrarInformacion());

        System.out.println("\nInformación de Empleado:");
        System.out.println(empleado.mostrarInformacion());

        System.out.println("\nInformación de Estudiante:");
        System.out.println(estudiante.mostrarInformacion());

        // Accedemos a métodos específicos de las subclases, 
        // algo que no está definido en la clase base Persona.
        System.out.println("\nMétodos específicos:");
        System.out.println("Sueldo mensual del empleado: $" + empleado.getSueldo());
        System.out.println("Promedio del estudiante: " + estudiante.getPromedio());
    }
}

// **Clase base Persona** (Superclase)
class Persona {
    private String nombre;  // Atributo privado para almacenar el nombre.
    private int edad;       // Atributo privado para almacenar la edad.
    private String dni;     // Atributo privado para almacenar el DNI.

    // Constructor para inicializar todos los atributos de Persona.
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre; // Asignamos el nombre recibido al atributo.
        this.edad = edad;     // Asignamos la edad recibida al atributo.
        this.dni = dni;       // Asignamos el DNI recibido al atributo.
    }

    // Métodos getter y setter para cada atributo.
    // Permiten acceder y modificar los atributos privados.

    public String getNombre() {
        return nombre; // Devuelve el nombre actual.
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Cambia el valor del nombre.
    }

    public int getEdad() {
        return edad; // Devuelve la edad actual.
    }

    public void setEdad(int edad) {
        this.edad = edad; // Cambia el valor de la edad.
    }

    public String getDni() {
        return dni; // Devuelve el DNI actual.
    }

    public void setDni(String dni) {
        this.dni = dni; // Cambia el valor del DNI.
    }

    // Método público que puede ser sobrescrito por las subclases.
    public String mostrarInformacion() {
        // Devuelve una descripción básica de la persona.
        return "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + dni;
    }
}

// **Clase derivada Empleado**
// Esta clase hereda de Persona y añade nuevos atributos y comportamientos.
class Empleado extends Persona {
    private String puesto;  // Nuevo atributo: el puesto laboral.
    private double sueldo;  // Nuevo atributo: el sueldo del empleado.

    // Constructor que recibe los atributos de Persona más los propios de Empleado.
    public Empleado(String nombre, int edad, String dni, String puesto, double sueldo) {
        super(nombre, edad, dni); // Llama al constructor de la clase base Persona.
        this.puesto = puesto;    // Asignamos el puesto recibido.
        this.sueldo = sueldo;    // Asignamos el sueldo recibido.
    }

    // Getters y setters para los atributos específicos de Empleado.
    public String getPuesto() {
        return puesto; // Devuelve el puesto actual.
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto; // Cambia el valor del puesto.
    }

    public double getSueldo() {
        return sueldo; // Devuelve el sueldo actual.
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo; // Cambia el valor del sueldo.
    }

    // Sobrescribimos el método mostrarInformacion para incluir los detalles del puesto y sueldo.
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Puesto: " + puesto + ", Sueldo: $" + sueldo;
    }
}

// **Clase derivada Estudiante**
// Esta clase hereda de Persona y añade nuevos atributos y comportamientos.
class Estudiante extends Persona {
    private String carrera;  // Nuevo atributo: la carrera del estudiante.
    private double promedio; // Nuevo atributo: el promedio del estudiante.

    // Constructor que recibe los atributos de Persona más los propios de Estudiante.
    public Estudiante(String nombre, int edad, String dni, String carrera, double promedio) {
        super(nombre, edad, dni); // Llama al constructor de la clase base Persona.
        this.carrera = carrera;  // Asignamos la carrera recibida.
        this.promedio = promedio; // Asignamos el promedio recibido.
    }

    // Getters y setters para los atributos específicos de Estudiante.
    public String getCarrera() {
        return carrera; // Devuelve la carrera actual.
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera; // Cambia el valor de la carrera.
    }

    public double getPromedio() {
        return promedio; // Devuelve el promedio actual.
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio; // Cambia el valor del promedio.
    }

    // Sobrescribimos el método mostrarInformacion para incluir los detalles de la carrera y promedio.
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Carrera: " + carrera + ", Promedio: " + promedio;
    }
}

