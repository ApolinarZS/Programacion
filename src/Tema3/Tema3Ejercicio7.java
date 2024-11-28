package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //le pido al usuario que introduzca los números
        //uso un do while para que me introduzca al menos 1 número
        int num;//números introducidos por el usuario
        do {
            System.out.println("Introduce números enteros positivos (Introduce 0 si quieres parar)");
            num = scanner.nextInt();
            if (esPrimo(num)){
                System.out.println("El número introducido es primo.");
            } else System.out.println("El número introducido NO es primo");
        } while (num != 0);
    }
    //creo la función que hará la comprobación de si es primo el número o no
    public static boolean esPrimo(int num){
        boolean primo = true;
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }
}
