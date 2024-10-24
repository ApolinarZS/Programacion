package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio6 {
    public static void main(String[] args) {

        //Pedimos el número al usuario\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        double num1 = scanner.nextDouble();

        //Vemos si es positivo, negativo o zero y se lo decimos al usuario\\
        if (num1 == 0){
            System.out.println("El número introducido es zero");
        } else if (num1 > 0){
            System.out.println("El número introducido es positivo");
        } else if (num1 < 0){
            System.out.println("El número introducido es negativo");
        }
        scanner.close();

    }
}
