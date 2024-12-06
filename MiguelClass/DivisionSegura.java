import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar los números al usuario
            System.out.print("Ingrese el dividendo (entero): ");
            int dividendo = scanner.nextInt();

            System.out.print("Ingrese el divisor (entero): ");
            int divisor = scanner.nextInt();

            // Realizar la división
            int resultado = dividir(dividendo, divisor);

            // Mostrar el resultado
            System.out.println("El resultado de la división es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre 0.");
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida. Por favor, ingrese números enteros.");
        } finally {
            // Cerrar el Scanner
            scanner.close();
        }
    }

    // Método para realizar la división
    public static int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("División entre cero");
        }
        return dividendo / divisor;
    }
}
