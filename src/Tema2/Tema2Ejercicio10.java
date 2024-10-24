package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main(String[] args) {

        //Pedimos al usuario los números a ordenar\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor del primer número");
        double num1 = scanner.nextDouble();
        System.out.println("Introduce el valor del segundo número");
        double num2 = scanner.nextDouble();
        System.out.println("Introduce el valor del tercer número");
        double num3 = scanner.nextDouble();

        //Vemos si están ordenados de menor a mayor y se lo decimos al usuario\\
        if (num1<num2 || num2<num3){
            System.out.println("Los números introducidos están ordenados de menor a mayor");
        } else System.out.println("Los números introducidos no están ordenados de menor a mayor");

        scanner.close();
    }

}