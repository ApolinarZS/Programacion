package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio20 {
    public static void main(String[] args) {

        //pedimos los dos números\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int A = scanner.nextInt();
        System.out.println("Introduce el segundo número");
        int B = scanner.nextInt();

        //Creamos el bucle\\
        for(int i= A; A<=B; A++){
            if (A % 2 != 0){
                System.out.println(A);
            }
        }
    }

    }
