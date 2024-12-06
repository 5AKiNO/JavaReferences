// **Clase principal para ejecutar el programa**
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Persona utilizando el constructor.
        Persona persona1 = new Persona("Juan", 25, "12345678A");
        
        // Mostramos los datos de la persona utilizando getters.
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("DNI: " + persona1.getDni());

        // Modificamos algunos atributos utilizando setters.
        persona1.setNombre("Juan Pérez");
        persona1.setEdad(26);

        // Mostramos los datos actualizados.
        System.out.println("\nDatos actualizados:");
        System.out.println(persona1.mostrarInformacion()); // Usamos un método personalizado.

        // Intentamos acceder a atributos privados (esto generará un error si descomentamos):
        // persona1.nombre = "Nuevo nombre"; // No permitido: atributo privado.

        // Creamos otra persona usando un constructor sin parámetros.
        Persona persona2 = new Persona();
        persona2.setNombre("María");
        persona2.setEdad(30);
        persona2.setDni("87654321B");

        // Mostramos la información de la segunda persona.
        System.out.println("\nSegunda persona:");
        System.out.println(persona2.mostrarInformacion());
    }
}

// **Clase Persona: representa a una persona**
class Persona {
    // **Atributos privados**
    private String nombre;  // Nombre de la persona, acceso restringido.
    private int edad;       // Edad de la persona, acceso restringido.
    private String dni;     // DNI de la persona, acceso restringido.

    // **Constructor sin parámetros**
    public Persona() {
        // Inicializamos los atributos con valores predeterminados.
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.dni = "Sin DNI";
    }

    // **Constructor con parámetros**
    public Persona(String nombre, int edad, String dni) {
        // Inicializamos los atributos con los valores proporcionados.
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    // **Getters y Setters**
    // Getter para el nombre.
    public String getNombre() {
        return this.nombre; // Devuelve el valor del atributo `nombre`.
    }

    // Setter para el nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna un nuevo valor al atributo `nombre`.
    }

    // Getter para la edad.
    public int getEdad() {
        return this.edad; // Devuelve el valor del atributo `edad`.
    }

    // Setter para la edad.
    public void setEdad(int edad) {
        if (edad >= 0) { // Validación: la edad no puede ser negativa.
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }
    }

    // Getter para el DNI.
    public String getDni() {
        return this.dni; // Devuelve el valor del atributo `dni`.
    }

    // Setter para el DNI.
    public void setDni(String dni) {
        this.dni = dni; // Asigna un nuevo valor al atributo `dni`.
    }

    // **Método público para mostrar información**
    public String mostrarInformacion() {
        // Devuelve una representación de la información de la persona.
        return "Nombre: " + this.nombre + ", Edad: " + this.edad + ", DNI: " + this.dni;
    }

    // **Método protegido**
    protected void metodoProtegido() {
        // Este método solo puede ser accedido desde esta clase o subclases.
        System.out.println("Método protegido ejecutado.");
    }
}
