package Tema3;

public class Tema3Ejercicio9 {
    public static void main(String[] args) {
        // llamo al procedimiento para que muestre el triángulo
        mostrarTrianguloCentrado('*', 5);
    }

    public static void mostrarTrianguloCentrado(char caracter, int numLineas) {
        for (int i = 1; i <= numLineas; i++) {
            // Imprimir espacios antes de los caracteres
            for (int j = 1; j <= numLineas - i; j++) {
                System.out.print(" ");
            }
            // Imprimir los caracteres
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(caracter);
            }
            // Salto de línea
            System.out.println();
        }
    }
}
