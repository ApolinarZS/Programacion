package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio12 {
    public static void main(String[] args) {

        //Pedimos al usuario los números a ordenar\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor del primer número");
        double num1 = scanner.nextDouble();
        System.out.println("Introduce el valor del segundo número");
        double num2 = scanner.nextDouble();
        System.out.println("Introduce el valor del tercer número");
        double num3 = scanner.nextDouble();

        //Los ordenamos y se lo decimos al usuario\\
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }

        scanner.close();
    }

}
