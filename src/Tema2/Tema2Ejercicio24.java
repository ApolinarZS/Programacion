package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio24 {
    public static void main(String[] args) {

        //Creamos las variables\\
        Scanner scanner = new Scanner(System.in);
        int aprobados = 0;
        int suspendidos = 0;
        double nota;

        System.out.println("Introduce las notas de los alumnos (ingresa un número negativo para terminar):");
        //Pedimos las notas, establecemos la condición de clausura y sumamos los contadores\\
        while (true) {
            System.out.print("Nota: ");
            nota = scanner.nextDouble();
            if (nota > 10) {
                System.out.println("Introduce una nota válida");
                nota = scanner.nextDouble();
            }
            if (nota < 0) {
                break;
            }

            if (nota >= 5) {
                aprobados++;
            } else {
                suspendidos++;
            }
        }
        scanner.close();

        //Mostramos la suma total de aprobados y suspendidos\\
        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspendidos: " + suspendidos);

    }

}
