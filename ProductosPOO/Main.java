public class Main {
    public static void main(String[] args) {
        // Crear un producto
        Producto producto = new Producto("Laptop", 1500.99, 10);

        // Mostrar la información del producto
        producto.mostrarInformacion();

        // Modificar los valores usando setters
        producto.setNombre("Laptop Gaming");
        producto.setPrecio(1800.50);
        producto.setCantidadEnStock(8);

        // Mostrar la información actualizada
        System.out.println("\nInformación actualizada del producto:");
        producto.mostrarInformacion();
    }
}

