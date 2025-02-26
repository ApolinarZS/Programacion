package Tema5;

public class Ejercicio6Excepciones {
    public static void main(String[] args) {
        try {
            // Crear un gato con valores válidos
            Gato gato1 = new Gato("Michi", 2);
            gato1.imprimir();

            // Intentar crear un gato con nombre inválido
            Gato gato2 = new Gato("Lu", 3); // Nombre demasiado corto
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // Crear un gato con valores válidos
            Gato gato3 = new Gato("Luna", 4);
            gato3.imprimir();

            // Intentar cambiar la edad a un valor inválido
            gato3.setEdad(-1); // Edad negativa
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // Crear un gato con valores válidos
            Gato gato4 = new Gato("Simba", 5);
            gato4.imprimir();

            // Intentar cambiar el nombre a un valor inválido
            gato4.setNombre("Ti"); // Nombre demasiado corto
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

