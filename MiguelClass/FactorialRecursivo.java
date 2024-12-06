public class Factorial {
    // Función recursiva para calcular el factorial
    public static long factorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1; // Caso base: factorial de 0 o 1 es 1
        }
        return n * factorialRecursivo(n - 1); // Llamada recursiva
    }

    public static void main(String[] args) {
        int numero = 5; // Cambia este número para calcular otros factoriales
        System.out.println("Factorial (recursivo) de " + numero + " es: " + factorialRecursivo(numero));
    }
}
