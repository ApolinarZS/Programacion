package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio15 {
    public static void main(String[] args) {

        //Pedimos al usuario el número del año y del mes\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el año.");
        int ano = scanner.nextInt();

        System.out.println("Introduce el número de mes.");
        int mes = scanner.nextInt();

        while (mes < 0 || mes > 13) {
            System.out.println("Introduce un mes válido");
            mes = scanner.nextInt();
        }

        //creamos la variable días y la booleana, determinamos si el año es bisiesto\\
        boolean bisiesto = ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
        int dias;

        if (mes == 2 && bisiesto) {
            dias = 29;
        } else if (mes == 2)
            dias = 28;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
        } else dias = 30;


        //Mostramos los días del mes del año indicado\\
        System.out.println("El mes " + mes + " del año " + ano + " tiene " + dias + " días");
    }

}