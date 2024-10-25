package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Pedimos las horas, minutos y segundos. Y comprobamos que sea válido\\
        System.out.println("Introduce la hora (0-23): ");
        int horas = scanner.nextInt();

        while (horas < 0 || horas > 24){
            System.out.println("Introduce una hora válida");
        horas = scanner.nextInt();
        }

        System.out.println("Introduce los minutos (0-59): ");
        int minutos = scanner.nextInt();

        while (minutos < 0 || minutos > 60){
            System.out.println("Introduce un minuto válido");
            minutos = scanner.nextInt();
        }

        System.out.println("Introduce los segundos (0-59): ");
        int segundos = scanner.nextInt();

        while (segundos < 0 || segundos > 60){
            System.out.println("Introduce un segundo válido");
            segundos = scanner.nextInt();
        }

        //Sumamos el segundo\\
        segundos++;

        //Ajustamos y reiniciamos la hora si es necesario\\
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }

        // Mostramos la hora con un segundo más\\
        System.out.println("La hora con un segundo más es: "+horas+":" +minutos+":" +segundos);

        scanner.close();
            }
        }





