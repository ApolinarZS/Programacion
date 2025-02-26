package Tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompras {
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

        scanner.close();

        System.out.println("=== Lista final de la compra ===");
        if (listaCompra.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            listaCompra.forEach(p -> System.out.println("- " + p));
        }
    }
}
