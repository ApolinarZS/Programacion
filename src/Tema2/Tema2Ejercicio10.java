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

        //Vemos si son consecutivos y se lo decimos al usuario\\
        double num4 = num1++;
        double num5 = num2++;

        if (num2 == num4 && num5 == num3){
            System.out.println("Los números introducidos son consecutivos");
        } else System.out.println("Los números introducidos no son consecutivos");

        scanner.close();

    }
}
