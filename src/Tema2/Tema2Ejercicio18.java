package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio18 {
    public static void main(String[] args) {

        //Pido el valor del número del cual vamos a calcular la raíz cuadrada\\
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        while (num == 0 || num < 0){
            System.out.println("Introduce un número positivo para calcular la raiz cuadrada");
            num = scanner.nextInt();
            if (num < 0){
                System.out.println("ERROR, Introduzca un número válido");
            }
        }

        //Calculamos la raíz cuadrada\\
        double rcuadrao = Math.sqrt(num);

        //Mostramos el resultado\\
        System.out.println("LA raíz cuadrada de " +num+" es "+rcuadrao+".");

    }

    }
