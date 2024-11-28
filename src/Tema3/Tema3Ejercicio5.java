package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero del 1 al 10");
        int num = scanner.nextInt();
        tablas(num);
    }
    //función que me calculará la tabla de multiplicar que pida el usuario
    public static void tablas(int num){

        for (int ii= 1; ii <= 10; ii++){//bucle que calcula y muestra el resultado de las multiplicaciones
            System.out.println(num+" * "+ii+" = "+(num*ii));
        }
    }
}
