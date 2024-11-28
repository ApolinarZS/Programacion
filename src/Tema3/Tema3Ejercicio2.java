package Tema3;

import java.util.Scanner;

import static Tema3.Tema3Ejercicio1.numberSign;

public class Tema3Ejercicio2 {
    public static void main(String[] args) {

        //Llamo a la función del ejercicio anterior para comprobar que funciona
        int num = 0;
        int resultado = numberSign(num);

        Scanner scanner = new Scanner(System.in);
        //EJERCICIO 1

        //Pido el número al usuario
        System.out.println("Introduce un número");
        num = scanner.nextInt();

        if (resultado == 0) {
            System.out.println("El número introducido es " + resultado + ".");
        }
        if (resultado < 0) {
            System.out.println("El número introducido es negativo");
        } else if (resultado > 0) System.out.println("El número introducido es positivo");

        //Empezamos el ejercicio2 como tal. Le pido al usuario la edad
        System.out.println("Introduce una edad");
        int age = scanner.nextInt();

        //Compruebo si es mayor o menor de edad y se lo digo al usuario
        int realage = isAdult(age);
        if (realage == 18){
            System.out.println("Es mayor de edad");
        }else if (realage == 0) System.out.println("Es menor de edad");
    }
    public static int isAdult(int age){
        if (age >= 18){
            return 18;
        } else return 0;
    }
}

