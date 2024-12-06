import java.util.ArrayList;

public class OperacionesArrayList {
    public static void main(String[] args) {
        // Crear un ArrayList
        ArrayList<String> nombres = new ArrayList<>();

        // 1. Agregar elementos (add)
        nombres.add("Nathaly");
        nombres.add("Nahuel");
        nombres.add("Miguel");
        nombres.add("Diego");
        System.out.println("1. Lista inicial: " + nombres);

        // 2. Insertar en una posición específica (add con índice)
        nombres.add(1, "Luis");
        System.out.println("2. Después de insertar 'Luis' en la posición 1: " + nombres);

        // 3. Obtener un elemento por índice (get)
        String segundoNombre = nombres.get(1);
        System.out.println("3. Nombre en la posición 1: " + segundoNombre);

        // 4. Cambiar un elemento (set)
        nombres.set(2, "Nicolas");
        System.out.println("4. Después de cambiar el nombre en la posición 2 a 'Nicolas': " + nombres);

        // 5. Eliminar un elemento por índice (remove)
        nombres.remove(3);
        System.out.println("5. Después de eliminar el nombre en la posición 3: " + nombres);

        // 6. Eliminar un elemento por valor (remove)
        nombres.remove("Nahuel");
        System.out.println("6. Después de eliminar 'Nahuel': " + nombres);

        // 7. Verificar si un elemento existe (contains)
        boolean existeDiego = nombres.contains("Diego");
        System.out.println("7. ¿Existe 'Diego'? " + existeDiego);

        // 8. Obtener el tamaño del ArrayList (size)
        int tamano = nombres.size();
        System.out.println("8. Tamaño del ArrayList: " + tamano);

        // 9. Limpiar el ArrayList (clear)
        nombres.clear();
        System.out.println("9. Después de limpiar el ArrayList: " + nombres);

        // 10. Verificar si está vacío (isEmpty)
        boolean estaVacio = nombres.isEmpty();
        System.out.println("10. ¿Está vacío el ArrayList? " + estaVacio);

        // 11. Agregar varios elementos nuevamente
        nombres.add("Merelez");
        nombres.add("Oscar");
        nombres.add("Jefte");

        // 12. Iterar sobre el ArrayList con un bucle for
        System.out.println("11. Iterar con foreach:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // 13. Convertir el ArrayList a un Array
        String[] nombresArray = nombres.toArray(new String[0]);
        System.out.println("12. Array convertido desde ArrayList: ");
        for (String nombre : nombresArray) {
            System.out.println(nombre);
        }

        // 14. Crear un subList (subList)
        ArrayList<String> subLista = new ArrayList<>(nombres.subList(0, 2));
        System.out.println("13. Sublista de 0 a 2: " + subLista);

        // 15. Clonar el ArrayList (clone)
        @SuppressWarnings("unchecked")
        ArrayList<String> copia = (ArrayList<String>) nombres.clone();
        System.out.println("14. Clon del ArrayList: " + copia);

        // 16. Reemplazar todos los elementos (replaceAll)
        nombres.replaceAll(nombre -> "Nombre: " + nombre);
        System.out.println("15. Después de reemplazar todos los elementos: " + nombres);

        // 17. Eliminar elementos según una condición (removeIf)
        nombres.removeIf(nombre -> nombre.contains("Miguel"));
        System.out.println("16. Después de eliminar elementos que contienen 'Miguel': " + nombres);
    }
}

