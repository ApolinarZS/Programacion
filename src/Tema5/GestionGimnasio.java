package Tema5;

import java.util.*;

public class GestionGimnasio {
    private static Map<String, Usuario> usuarios = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Selecciona una opción: ");
            switch (opcion) {
                case 1 -> darDeAltaUsuario();
                case 2 -> darDeBajaUsuario();
                case 3 -> mostrarDatosUsuario();
                case 4 -> modificarUsuario();
                case 5 -> System.out.println("Saliendo del programa. ¡Hasta luego!");
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Gestión de Usuarios del Gimnasio ---");
        System.out.println("1. Dar de alta usuario");
        System.out.println("2. Dar de baja usuario");
        System.out.println("3. Mostrar datos de un usuario");
        System.out.println("4. Modificar usuario");
        System.out.println("5. Salir");
    }

    private static void darDeAltaUsuario() {
        System.out.print("Introduce el DNI del usuario: ");
        String dni = scanner.nextLine();
        if (usuarios.containsKey(dni)) {
            System.out.println("Error: Ya existe un usuario con ese DNI.");
            return;
        }
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();
        int edad = leerEntero("Introduce la edad: ");
        usuarios.put(dni, new Usuario(nombre, edad));
        System.out.println("Usuario dado de alta correctamente.");
    }

    private static void darDeBajaUsuario() {
        System.out.print("Introduce el DNI del usuario a eliminar: ");
        String dni = scanner.nextLine();
        if (usuarios.remove(dni) != null) {
            System.out.println("Usuario eliminado correctamente.");
        } else {
            System.out.println("Error: No se encontró un usuario con ese DNI.");
        }
    }

    private static void mostrarDatosUsuario() {
        System.out.print("Introduce el DNI del usuario: ");
        String dni = scanner.nextLine();
        Usuario usuario = usuarios.get(dni);
        if (usuario != null) {
            System.out.println("Datos del usuario: " + usuario);
        } else {
            System.out.println("Error: No se encontró un usuario con ese DNI.");
        }
    }

    private static void modificarUsuario() {
        System.out.print("Introduce el DNI del usuario a modificar: ");
        String dni = scanner.nextLine();
        Usuario usuario = usuarios.get(dni);
        if (usuario == null) {
            System.out.println("Error: No se encontró un usuario con ese DNI.");
            return;
        }
        System.out.print("Introduce el nuevo nombre (actual: " + usuario.getNombre() + "): ");
        String nuevoNombre = scanner.nextLine();
        int nuevaEdad = leerEntero("Introduce la nueva edad (actual: " + usuario.getEdad() + "): ");

        usuario.setNombre(nuevoNombre);
        usuario.setEdad(nuevaEdad);
        System.out.println("Usuario modificado correctamente.");
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un número válido.");
            }
        }
    }
}

