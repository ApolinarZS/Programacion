package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Introduce el valor del dado");
        int dado = scanner.nextInt();
        int dado2 = 0;

        if (dado < 1 || dado > 6) {
            System.out.println("El número introducido no corresponde a un dado D6");
        } else {
            flag = true;
        }

        switch (dado) {
            case 1:
                dado2 = 6;
                break;
            case 2:
                dado2 = 5;
                break;
            case 3:
                dado2 = 4;
                break;
            case 4:
                dado2 = 3;
                break;
            case 5:
                dado2 = 2;
                break;
            case 6:
                dado2 = 1;
                break;
        }
        System.out.println("La cara de tu dado es " + dado + " y la cara contraria es " + dado2);
    }
}
