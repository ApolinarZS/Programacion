package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    public static void main(String[] args) {

        //pedimos el número entero\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int num = scanner.nextInt();

        //comprobamos y pedimos que el número sea positivo\\
        while (num < 0){
            System.out.println("Introduce un número positivo");
            num = scanner.nextInt();
        }
        scanner.close();

        //contamos las cifras\\
        int digitos = (int)(Math. log10(num)+1);

        //mostramos por pantalla el resultado\\
        System.out.println("El número " +num+" tiene " +digitos+" cifras");


    }
}
