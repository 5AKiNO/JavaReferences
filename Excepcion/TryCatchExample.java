import java.util.Scanner; // Para leer datos ingresados por el usuario.

public class TryCatchExample { // Clase principal.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicializamos el escáner para entrada del usuario.
        
        System.out.println("Bienvenido al programa de división segura.");

        try {
            // Solicitamos al usuario el numerador.
            System.out.print("Por favor, ingrese el numerador: ");
            int numerador = Integer.parseInt(scanner.nextLine()); // Convertimos la entrada a entero.

            // Solicitamos al usuario el denominador.
            System.out.print("Por favor, ingrese el denominador: ");
            int denominador = Integer.parseInt(scanner.nextLine()); // Convertimos la entrada a entero.

            // Intentamos realizar la división.
            int resultado = numerador / denominador; // Puede lanzar ArithmeticException si denominador es 0.
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Capturamos y manejamos división por cero.
            System.out.println("Error: No se puede dividir entre cero.");
        } catch (NumberFormatException e) {
            // Capturamos y manejamos valores no numéricos.
            System.out.println("Error: Por favor, ingrese solo números enteros.");
        } finally {
            // Bloque que siempre se ejecuta.
            System.out.println("Gracias por usar el programa.");
        }
    }
}

