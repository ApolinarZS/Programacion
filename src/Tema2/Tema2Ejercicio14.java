package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio14 {
    public static void main(String[] args) {

        //Pedimos al usuario el número de personas y de días\\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de personas.");
        int persona = scanner.nextInt();
        System.out.println("Introduce el número de días.");
        int dias = scanner.nextInt();

        //Definimos la tarifa\\
        double tarifa = 15;
        double precio;

        //Calculamos el precio estándar y rebajado\\
        if (persona >= 5 && dias >= 7){
            dias--;
            double precioO = tarifa*dias*persona*0.75;
            //Mostramos el precio del total\\
            System.out.println("El precio total de la estancia es " +precioO+ ".");
        } else {
            precio = tarifa*dias*persona;
            //Mostramos el precio del total\\
            System.out.println("El precio total de la estancia es " +precio+ ".");
        }
        scanner.close();
    }

}
