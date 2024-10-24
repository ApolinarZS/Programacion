package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio3 {
    public static void main(String[] args) {

        //Pedimos el valor de la base y de la altura
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor de la base del triángulo");
        double base = scanner.nextDouble();

        System.out.println("Introduce el valor de la altura del triángulo");
        double altura = scanner.nextDouble();

        //Calculamos el área \\
        double area = base/2*altura;

        //Mostramos los resultados al usuario\\
        System.out.println("Siendo "+base+" la base y "+altura+" la altura, el área del rectángulo es "+area+ ".");

        scanner.close();
    }
}
