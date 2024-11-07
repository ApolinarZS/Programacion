package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio28 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int numeroGanador = random.nextInt(100000);

        System.out.println("Bienvenido a la Lotería de Navidad.");
        System.out.println("Tienes hasta 5 intentos para adivinar el número ganador (entre 0 y 99,999).");

        boolean haGanado = false;
        int intentos = 0;


        while (intentos < 5 && !haGanado) {
            System.out.print("Introduce tu número (intento " + (intentos + 1) + "): ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroGanador) {
                System.out.println("¡Felicidades! Has ganado la lotería.");
                haGanado = true;
            } else {
                System.out.println("Lo siento, no es el número ganador.");
            }

            intentos++;
        }


        if (!haGanado) {
            System.out.println("Lo siento, no has ganado la lotería.");
            System.out.println("El número ganador era: " + numeroGanador);
        }

        scanner.close();
    }

}
