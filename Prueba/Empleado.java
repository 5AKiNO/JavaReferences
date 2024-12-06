import java.util.Scanner; // Importación de la clase Scanner

public class Empleado {
    private String nombre;
    private String puesto;
    private String salario; // Aquí, si quieres manejar salario como double, cambiar a tipo double

    // Constructor
    public Empleado(String nombre, String puesto, String salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Puesto
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    // Salario
    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
    }

    // Método main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Uso correcto de System.in
        System.out.println("Ingrese los datos de la empresa");

        // Solicitar y leer datos
        System.out.println("Nombre:");
        String newName = sc.nextLine();
        System.out.println("Puesto:");
        String newPuesto = sc.nextLine();
        System.out.println("Salario:");
        String newSalario = sc.nextLine(); // Leer salario como String

        // Crear un objeto de tipo Empleado
        Empleado empl = new Empleado(newName, newPuesto, newSalario);

        // Mostrar información
        empl.mostrarInfo();
        
        Empleado emp1 = new Empleado("Alfonso", "Constructor", "cien");
        emp1.setSalario("Cien");
        emp1.mostrarInfo();
    }
}
