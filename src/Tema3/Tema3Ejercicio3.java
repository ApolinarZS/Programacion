package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //le pido al usuario el radio
        System.out.println("Introduce un radio (puedes usar decimales)");
        double radius = scanner.nextDouble();
        while (!validRadius(radius)){
            System.out.println("Introduce un radio válido (no puede ser menor o igual a 0");
        }
        //llamo y almaceno el perímetro calculado
        double resultadoperimetro = calculateCirclePerimeter(radius);
        //llamo y almaceno el área calculada
        double resultadocarea = calculateCircleArea(radius);

        //se lo muestro al usuario
        System.out.println("El perímetro del círculo es "+resultadoperimetro+".");
        System.out.println("El área del círculo es "+resultadocarea+".");
    }
    //función para comprobar que el radio es válido
    public static boolean validRadius(double radius){
        return radius >= 0;
    }
    //función para calcular el perímetro
    public static double calculateCirclePerimeter(double radius){
        double perimetro = 2 * 3.14 * radius;
        return perimetro;
    }
    //función para calcular el área
    public static double calculateCircleArea(double radius){
        double area = 3.14 * radius * radius;
        return area;
    }
}
