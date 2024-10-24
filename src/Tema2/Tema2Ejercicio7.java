package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static void main(String[] args) {

        //Pedimos al usuario dos números\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor del primer número");
        double num1 = scanner.nextDouble();
        System.out.println("Introduce el valor del segundo número");
        double num2 = scanner.nextDouble();

        //los ordenamos, calculamos la resta y mostramos el resultado\\
        if (num1 > num2){
            double num3 = num1-num2;
            System.out.println("El resultado de la resta del mayor por el menor es " +num3+ ".");
        } else if (num2 > num1){
            double num4 = num2-num1;
            System.out.println("El resultado de la resta del mayor por el menor es " +num4+ ".");

    }
        scanner.close();

    }

}
