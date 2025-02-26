package Tema5;

import java.util.LinkedList;
import java.util.Scanner;

public class GestionColaBanco {
    private static LinkedList<Usuariob> cola = new LinkedList<>();

    public static void agregarUsuario(String nombre, int edad, String dni) {
        cola.addLast(new Usuariob(nombre, edad, dni));
        System.out.println("Usuario añadido a la cola.");
    }

    public static void atenderUsuario() {
        if (!cola.isEmpty()) {
            Usuariob atendido = cola.removeFirst();
            System.out.println("Atendiendo a: " + atendido);
        } else {
            System.out.println("No hay usuarios en la cola.");
        }
    }

    public static void quitarUsuarioPorDni(String dni) {
        boolean encontrado = false;
        for (Usuariob usuario : cola) {
            if (usuario.getDni().equals(dni)) {
                cola.remove(usuario);
                System.out.println("Usuario quitado de la cola: " + usuario);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un usuario con el DNI proporcionado.");
        }
    }

    public static void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Usuarios en la cola:");
            for (Usuariob usuario : cola) {
                System.out.println(usuario);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nGestión de la cola del banco:");
            System.out.println("1. Añadir usuario a la cola");
            System.out.println("2. Atender al primer usuario");
            System.out.println("3. Quitar usuario por DNI");
            System.out.println("4. Mostrar la cola");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("DNI: ");
                    String dni = scanner.nextLine();
                    agregarUsuario(nombre, edad, dni);
                    break;
                case 2:
                    atenderUsuario();
                    break;
                case 3:
                    System.out.print("Ingrese el DNI del usuario a quitar: ");
                    String dniQuitar = scanner.nextLine();
                    quitarUsuarioPorDni(dniQuitar);
                    break;
                case 4:
                    mostrarCola();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}


