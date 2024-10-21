package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio8 {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce el primer número entero");
        int num1 = scanner.nextInt();

    System.out.println("Introduce el segundo número entero");
        int num2 = scanner.nextInt();

        if (num1 == num2){
            System.out.println("Los dos números enteros introducidos son iguales");
        } else {
            if (num1 > num2){
                System.out.println("El número " +num1+ " es mayor a "+num2);
            } else {

                    System.out.println("El número " +num2+ " es mayor a "+num1);

            }
        }

    }
}
