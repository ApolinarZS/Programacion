package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número entero");
        double num1 = scanner.nextDouble();

        System.out.println("Introduce el segundo número entero");
        int num2 = scanner.nextInt();

        double suma = num1 + num2;
        double mul = num1 * num2;

        if (num1 == num2) {
            double resta1 = 0;
            double div1 = num1 / num2;
                        System.out.println("La suma, el producto, la resta y la división de " + num1 + " y " + num2 + " son " + suma + ", " + mul + ", " + resta1 + " y " + div1 + " respectivamente.");
        } else {
            if (num1 > num2) {
                double resta2 = num1 - num2;
                double div2 = num1 / num2;
                                System.out.println("La suma, el producto, la resta y la división de " + num1 + " y " + num2 + " son " + suma + ", " + mul + ", " + resta2 + "y " + div2 + " respectivamente.");
            } else {
                if (num1 < num2) {
                    double resta3 = num2 - num1;
                    double div3 = num2 / num1;
                                        System.out.println("La suma, el producto, la resta y la división de " + num2 + " y " + num1 + " son " + suma + ", " + mul + ", " + resta3 + "y " + div3 + " respectivamente.");
                }
            }


        }


    }
}

