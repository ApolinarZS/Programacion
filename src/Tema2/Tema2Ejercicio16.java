package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio16 {
    public static void main(String[] args) {

        //Pedimos al usuario el valor D o E \\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce si quieres convertir euros adólares (D) o dólares a euros (E).");
        char valor = scanner.next().charAt(0);

        switch (valor){
            case 'D'->{
                //Pedimos la cantidad de dinero en euros a convertir\\
                System.out.println("Introduce el valor en euros a convertir a dólares (EEUU)");
                double euros = scanner.nextDouble();

                //Calculamos la conversión)
                double dolares = euros*1.08;

                //Mostramos el resultado\\
                System.out.println(dolares+" dólares.");
            }
            case 'E'->{
                //Pedimos la cantidad de dinero en dólares a convertir\\
                System.out.println("Introduce el valor en dólares a convertir a euros (EEUU)");
                double dolares = scanner.nextDouble();

                //Calculamos la conversión)
                double euros = dolares * 0.93;

                //Mostramos el resultado\\
                System.out.println(euros + " euros.");

            }
        }

    }

    }
