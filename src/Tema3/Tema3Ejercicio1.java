package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Pido el número al usuario
        System.out.println("Introduce un número");
        int num = scanner.nextInt();
        //almaceno el resultado de la función
        int resultado = numberSign(num);

        //Compruebo si es 0, positivo o negativo y se lo digo al usuario
        if (resultado == 0){
            System.out.println("El número introducido es "+resultado+".");
        }
        if (resultado < 0 ){
            System.out.println("El número introducido es negativo");
        } else if (resultado > 0) System.out.println("El número introducido es positivo");
    }
    //creo la función que realizará las comprobaciones del número y devolverá el valor asignado
    public static int numberSign(int num){
        if (num == 0){
            return num;
        }
        if (num < 0){
            return -1;
        } else return 1;
    }
}
