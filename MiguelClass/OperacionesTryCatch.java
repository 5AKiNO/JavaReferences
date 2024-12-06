import java.util.Scanner;

public class OperacionesTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Bloque principal para capturar cualquier error
            System.out.print("Ingrese el primer número (entero): ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número (entero): ");
            int numero2 = scanner.nextInt();

            // Operaciones aritméticas con try-catch por separado
            try {
                int suma = numero1 + numero2;
                System.out.println("Suma: " + suma);
            } catch (Exception e) {
                System.out.println("Error al realizar la suma: " + e.getMessage());
            }

            try {
                int resta = numero1 - numero2;
                System.out.println("Resta: " + resta);
            } catch (Exception e) {
                System.out.println("Error al realizar la resta: " + e.getMessage());
            }

            try {
                int multiplicacion = numero1 * numero2;
                System.out.println("Multiplicación: " + multiplicacion);
            } catch (Exception e) {
                System.out.println("Error al realizar la multiplicación: " + e.getMessage());
            }

            try {
                int division = dividir(numero1, numero2);
                System.out.println("División: " + division);
            } catch (ArithmeticException e) {
                System.out.println("Error en la división: " + e.getMessage());
            }

            try {
                int modulo = modulo(numero1, numero2);
                System.out.println("Módulo: " + modulo);
            } catch (ArithmeticException e) {
                System.out.println("Error en el cálculo del módulo: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error general: Entrada no válida. Por favor, ingrese números enteros.");
        } finally {
            // Mensaje final y cierre del recurso
            System.out.println("Operaciones finalizadas.");
            scanner.close();
        }
    }

    // Método para dividir con control de errores
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre 0.");
        }
        return a / b;
    }

    // Método para calcular el módulo con control de errores
    public static int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede calcular el módulo con divisor 0.");
        }
        return a % b;
    }
}
