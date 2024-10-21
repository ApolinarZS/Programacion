package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un año en números arábigos");
        int num1 = scanner.nextInt();

        if ((num1 % 4 == 0 && num1 % 100 == 0) || num1 % 400 == 0) {
            System.out.println("El año introducido es bisiesto");
        } else {
            System.out.println("El año introducido no es bisiesto");
        }
    }
}