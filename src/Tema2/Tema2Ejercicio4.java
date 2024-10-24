package Tema2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main(String[] args) {

        double num4 = 0;

        //Pedimos al usuario los valores de los 3 números\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor del primer número");
        double num1 = scanner.nextDouble();
        System.out.println("Introduce el valor del segundo número");
        double num2 = scanner.nextDouble();
        System.out.println("Introduce el valor del tercer número");
        double num3 = scanner.nextDouble();

        //Determinamos el valor más alto\\
        if (num1 > num2 && num1 < num3){
            num4 = num1;
        } else if (num2 > num1 && num2 > num3){
            num4 = num2;
        } else num4 = num3;

        //Mostramos el valor más alto\\
        System.out.println("El número más alto es " +num4+".");

        scanner.close();
    }
}
