package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Le pido al usuario el día, mes y año
        System.out.print("Introduce el día (1-31): ");
        int dia = scanner.nextInt();
        System.out.print("Introduce el mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Introduce el año: ");
        int anio = scanner.nextInt();

        // Validamos la fecha usando la función
        if (esFechaValida(dia, mes, anio)) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha no es válida.");
        }
        scanner.close();
    }

    //Función para validar la fecha
    public static boolean esFechaValida(int dia, int mes, int anio) {
        if (anio < 1) {
            return false; // Año inválido
        }
        if (mes < 1 || mes > 12) {
            return false; // Mes inválido
        }
        return dia >= 1 && dia <= diasEnMes(mes, anio); // Día inválido
    }

    //Función para calcular los días en un mes
    public static int diasEnMes(int mes, int anio) {
        return switch (mes) {
            case 4, 6, 9, 11 -> 30; // Abril, junio, septiembre, noviembre
            case 2 -> esBisiesto(anio) ? 29 : 28; // Febrero
            default -> 31; // Todos los demás meses
        };
    }

    //Función para determinar si un año es bisiesto
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
