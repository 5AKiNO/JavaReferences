import java.util.ArrayList; // Importamos ArrayList, que pertenece a la librería estándar de Java.

public class Main { // Declaración de la clase principal.
    public static void main(String[] args) { // Método principal donde empieza la ejecución del programa.
        
        // **Creación y manipulación de un ArrayList**
        // Declaramos un ArrayList llamado 'palabras' que almacenará objetos de tipo String.
        ArrayList<String> palabras = new ArrayList<>();
        
        // **Agregamos elementos al ArrayList**
        palabras.add("Hola");           // Añadimos "Hola" al ArrayList.
        palabras.add("Mundo");          // Añadimos "Mundo".
        palabras.add("Java");           // Añadimos "Java".
        palabras.add("Programación");   // Añadimos "Programación".

        // **Uso del método size()**
        // Este método devuelve el número de elementos almacenados en el ArrayList.
        System.out.println("El tamaño del ArrayList es: " + palabras.size());

        // **Acceso a elementos con get()**
        // El método get(indice) devuelve el elemento en la posición especificada.
        System.out.println("El primer elemento es: " + palabras.get(0)); // Accedemos al primer elemento.

        // **Modificación de elementos**
        // Usamos set(indice, nuevoValor) para cambiar un valor en una posición específica.
        palabras.set(1, "Amigos"); // Cambiamos "Mundo" por "Amigos".
        System.out.println("Después de modificar, el ArrayList es: " + palabras);

        // **Eliminación de elementos**
        // Usamos remove(indice) para eliminar un elemento en la posición indicada.
        palabras.remove(2); // Eliminamos el elemento en el índice 2 ("Java").
        System.out.println("Después de eliminar, el ArrayList es: " + palabras);

        // **Bucle for tradicional**
        System.out.println("\nRecorriendo el ArrayList con un bucle for tradicional:");
        for (int i = 0; i < palabras.size(); i++) { // Recorremos usando índices desde 0 hasta tamaño-1.
            System.out.println("Índice " + i + ": " + palabras.get(i)); // Obtenemos e imprimimos cada elemento.
        }

        // **Bucle for-each**
        System.out.println("\nRecorriendo el ArrayList con un bucle for-each:");
        for (String palabra : palabras) { // El bucle for-each toma directamente cada elemento del ArrayList.
            System.out.println("Elemento: " + palabra); // Imprimimos el elemento actual.
        }

        // **Uso combinado con métodos String**
        System.out.println("\nAplicando métodos de String a los elementos del ArrayList:");
        for (String palabra : palabras) {
            System.out.println("Original: " + palabra); // Imprimimos el texto original.
            System.out.println("En mayúsculas: " + palabra.toUpperCase()); // Convertimos a mayúsculas.
            System.out.println("En minúsculas: " + palabra.toLowerCase()); // Convertimos a minúsculas.
            System.out.println("Longitud: " + palabra.length()); // Imprimimos la longitud de la cadena.
            System.out.println("Reemplazar 'o' por 'x': " + palabra.replace('o', 'x')); // Reemplazamos 'o' con 'x'.
            System.out.println("Subcadena (primeros 3 caracteres): " + palabra.substring(0, Math.min(3, palabra.length()))); // Subcadena segura.
            System.out.println("--------------------");
        }

        // **Bucle while**
        System.out.println("\nRecorriendo el ArrayList con un bucle while:");
        int i = 0; // Declaramos un índice inicial.
        while (i < palabras.size()) { // Condición: mientras i sea menor que el tamaño del ArrayList.
            System.out.println("Elemento en índice " + i + ": " + palabras.get(i)); // Obtenemos el elemento.
            i++; // Incrementamos el índice.
        }
    }
}
