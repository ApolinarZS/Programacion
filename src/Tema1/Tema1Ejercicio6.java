package Tema1;

import java.util.Scanner;
public class Tema1Ejercicio6 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduce el valor del radio del circulo");

        double radio = scanner.nextDouble();
        double area = 3.14*radio*radio;

        System.out.println("El área del círculo es " + area);
            }
}
