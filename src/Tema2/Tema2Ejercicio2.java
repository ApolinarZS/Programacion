package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static void main(String[] args) {

        //Pedimos el valor de la base y de la altura
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor de la base del rectángulo");
        double base = scanner.nextDouble();

        System.out.println("Introduce el valor de la altura del rectángulo");
        double altura = scanner.nextDouble();

        //Calculamos el área y el perímetro\\
        double area = base+altura;
        double per = base*2+altura*2;

        //Mostramos los resultados al usuario\\
        System.out.println("Siendo "+base+" la base y "+altura+" la altura, el área y el perímetro del rectángulo son "+area+ " y "+per+" respectivamente.");

    }
}
