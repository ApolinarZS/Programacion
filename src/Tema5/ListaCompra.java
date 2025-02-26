package Tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> listaCompra = new HashSet<>();
        String producto;

        System.out.println("=== Lista de la compra ===");
        System.out.println("Introduce los productos (escribe 'salir' para terminar):");

        while (true) {
            System.out.print("Producto: ");
            producto = scanner.nextLine().trim();

            if (producto.equalsIgnoreCase("salir")) {
                break;
            }

            if (producto.isEmpty()) {
                System.out.println("El nombre del producto no puede estar vacío.");
            } else if (!listaCompra.add(producto.toLowerCase())) {
                System.out.println("El producto '" + producto + "' ya está en la lista.");
            } else {
                System.out.println("Producto '" + producto + "' añadido correctamente.");
            }
        }

        CarroCompra carroCompra = new CarroCompra(listaCompra);
        int opcion;
        do {
            System.out.println("=== Menú del Carro de la Compra ===");
            System.out.println("1. Añadir producto al carro");
            System.out.println("2. Mostrar productos en el carro");
            System.out.println("3. Mostrar productos faltantes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el producto a añadir al carro: ");
                    String productoCarro = scanner.nextLine().trim().toLowerCase();
                    carroCompra.agregarProductoAlCarro(productoCarro);
                    break;
                case 2:
                    carroCompra.mostrarProductosEnCarro();
                    break;
                case 3:
                    carroCompra.mostrarProductosFaltantes();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

