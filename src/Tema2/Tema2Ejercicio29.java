package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29 {
    public static void main(String[] args) {

        Random random = new Random();
        int secreto = random.nextInt(1, 100);

        System.out.println("Introduce el número secreto (1 al 100)");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        while (secreto != numero){
            if (secreto < numero){
                System.out.println("El número secreto es menor");
            } else {
                System.out.println("El número secreto es mayor");
            }
            System.out.println("Introduce el número secreto (1 al 100)");
            numero = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Has acertado");
    }

}
