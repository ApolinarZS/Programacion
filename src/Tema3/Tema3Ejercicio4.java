package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //llamo a la función del menú
        showMenu();
        //leo la respuesta del usuario en una nueva variable int
        int cambio = scanner.nextInt();

        //creo un switch para realizar los cambios según la respuesta del usuario
        switch (cambio){
            case 1->{
                System.out.println("Introduce el valor a cambiar de euros a dólares");
                double valor = scanner.nextDouble();
                double resultadonuevodolar = (euro2dollar(valor));//almaceno la función para usarla cómodamente
                System.out.println(valor+"euros son "+resultadonuevodolar+" dólares");//le muestro el resultado al usuario
            }
            case 2->{
                System.out.println("Introduce el valor a cambiar de dólares a euros");
                double valor = scanner.nextDouble();
                double resultadonuevoeuro = (euro2dollar(valor));//almaceno la función para usarla cómodamente
                System.out.println(valor+"dólares son "+resultadonuevoeuro+" euros");//le muestro el resultado al usuario
            }
        }
    }
    //procedimiento que muestra el menú
    public static void showMenu(){
        System.out.println("      MENÚ    ");
        System.out.println("CAMBIO DE DIVISAS");
        System.out.println("(1) - EUROS A DÓLARES");
        System.out.println("(2) - DÓLARES A EUROS");
    }
    //procedimiento que calcula el cambio de euros a dólares
    public static double euro2dollar(double valor){
        double nuevodolar = valor * 1.05;
        return nuevodolar;
    }
    //procedimiento que calcula el cambio de dólares a euros
    public static double dollar2euro(double valor){
        double nuevoeuro = valor * 0.95;
        return nuevoeuro;
    }
}
