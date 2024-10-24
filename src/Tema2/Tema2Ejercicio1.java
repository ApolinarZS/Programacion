package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static void main(String[] args) {

        //Le pido el valor del lado de cuadrado al usuario y creo la variable"\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor del lado del cuadrado");
        double lado = scanner.nextDouble();

        //Calculamos el área y el perimetro en dos nuevas variables\\
        double area = lado*lado;
        double per = 4*lado;

        //Mostramos por pantalla el resultado\\
        System.out.println("Siendo " +lado+ " el valor del lado, el área y perímetro del cuadrado son " +area+" y " +per+ " respectivamente.");

        scanner.close();
    }
}
