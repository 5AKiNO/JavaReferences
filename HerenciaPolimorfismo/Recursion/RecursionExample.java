public class RecursionExample { // Declaramos una clase llamada RecursionExample.
    
    // Método principal, punto de entrada del programa.
    public static void main(String[] args) {
        // **Funciones simples**
        System.out.println("Funciones Simples:");
        int suma = sumar(5, 10); // Llamamos a la función `sumar` con los argumentos 5 y 10.
        System.out.println("La suma de 5 y 10 es: " + suma);

        int factorial = calcularFactorial(5); // Llamamos a la función recursiva `calcularFactorial` con 5.
        System.out.println("El factorial de 5 es: " + factorial);

        // **Ejemplo de recursión**
        System.out.println("\nRecursión con conteo descendente:");
        contarDescendente(5); // Llamamos a la función recursiva `contarDescendente` con 5.

        System.out.println("\nRecursión con conteo ascendente:");
        contarAscendente(1, 5); // Llamamos a la función recursiva `contarAscendente` para contar de 1 a 5.
    }

    // **Declaración de una función simple**
    // Esta función suma dos números y devuelve el resultado.
    public static int sumar(int a, int b) {
        return a + b; // Devuelve la suma de los argumentos a y b.
    }

    // **Declaración de una función recursiva**
    // Esta función calcula el factorial de un número.
    public static int calcularFactorial(int n) {
        if (n == 0) { // Caso base: el factorial de 0 es 1.
            return 1;
        }
        // Llamada recursiva: multiplicamos n por el factorial de (n - 1).
        return n * calcularFactorial(n - 1);
    }

    // **Ejemplo de recursión para contar de forma descendente**
    public static void contarDescendente(int n) {
        if (n == 0) { // Caso base: si n es 0, terminamos la recursión.
            System.out.println("¡Despegue!");
            return;
        }
        System.out.println(n); // Imprimimos el valor actual de n.
        contarDescendente(n - 1); // Llamamos a la misma función con (n - 1).
    }

    // **Ejemplo de recursión para contar de forma ascendente**
    public static void contarAscendente(int actual, int limite) {
        if (actual > limite) { // Caso base: si el número actual supera el límite, terminamos.
            return;
        }
        System.out.println(actual); // Imprimimos el número actual.
        contarAscendente(actual + 1, limite); // Llamamos a la función con (actual + 1).
    }
}
