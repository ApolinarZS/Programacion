package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número entero");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número entero");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int mul = num1 * num2;

        if (num1 == num2) {
            int resta1 = 0;
            int div1 = num1 / num2;
            int resto1 = num1 % num2;
            System.out.println("La suma, el producto, la resta, la división y el resto de " + num1 + " y " + num2 + " son " + suma + ", " + mul + ", " + resta1 + ", " + div1 + " y " + resto1 + " respectivamente.");
        } else {
            if (num1 > num2) {
                int resta2 = num1 - num2;
                int div2 = num1 / num2;
                int resto2 = num1 % num2;
                System.out.println("La suma, el producto, la resta, la división y el resto de " + num1 + " y " + num2 + " son " + suma + ", " + mul + ", " + resta2 + ", " + div2 + " y " + resto2 + " respectivamente.");
            } else {
                    int resta3 = num2 - num1;
                    int div3 = num2 / num1;
                    int resto3 = num2 % num1;
                    System.out.println("La suma, el producto, la resta, la división y el resto de " + num2 + " y " + num1 + " son " + suma + ", " + mul + ", " + resta3 + ", " + div3 + " y " + resto3 + " respectivamente.");

            }


        }


    }
}
