package Tema3;

import static Tema3.Tema3Ejercicio5.tablas;

public class Tema3Ejercicio6 {
    public static void main(String[] args) {

        //creo un for en el que usaré la función del ejercicio 5 para mostrar las tablas de multiplicar del 1 al 10
        for(int i = 1; i <= 10; i++){
            System.out.println("TABLA DEL "+i+".");
            tablas(i);
        }
    }
}
