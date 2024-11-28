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

        for (int i= 1; i <= 10; i++){//bucle que calcula y muestra el resultado de las multiplicaciones
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
