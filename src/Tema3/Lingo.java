package Tema3;

import java.util.Scanner;

public class Lingo {

    //privadas y finales para no poder ser alteradas
    private static final int max_intentos = 5; //intentos máximos del usuario
    private static final int longitud = 5; //longitud máxima de la palabra

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Palabra oculta para el usuario
        String oculta = "hueso";

        System.out.println("¡Bienvenido al juego del Lingo!");
        System.out.println("Tienes que adivinar una palabra de " + longitud + " letras en un máximo de " + max_intentos + " intentos.");

        // Inicializar la pista para guiar al usuario
        String hint = "-".repeat(longitud);
        System.out.println("Palabra oculta: " + hint);

        // Intentos del jugador, mientras tenga, seguirá el juego
        int intento;
        for (intento = 1; intento <= max_intentos; intento++) {
            System.out.print("(Intento " + intento + "): ");
            String guess = scanner.nextLine().toLowerCase();

            // Validamos la longitud de la palabra ingresada por el usuario
            if (guess.length() != longitud) {
                System.out.println("Por favor, introduce una palabra de " + longitud + " letras.");
                intento--; // No cuenta el intento si es inválido
                continue; //saltamos el resto del bucle y pasamos al siguiente intento
            }

            // Generar pista
            hint = generateHint(oculta, guess);
            System.out.println("Hint: " + hint);

            // Verificar si el jugador adivinó la palabra
            if (guess.equals(oculta)) {
                System.out.println("¡Congratulations! Has adivinado la palabra correctamente.");
                return; //para finalizar completamente el métdo
            }
        }
        System.out.println("Lo siento, no has adivinado la palabra. La palabra correcta era: " + oculta);

        /* //No supe hacer funcionar esto, busqué soluciones y vi que podía usar "return" en la victoria y dejar este sout suelto, ya que si gana nunca con el return nunca llegará al sout, pero sin él, te lo dirá igualmente
        if (intento == 5){//si se alcanzan los intentos máximos
            System.out.println("Lo siento, no has adivinado la palabra. La palabra correcta era: " + oculta);
        }*/
    }

    // generamos la pista
    private static String generateHint(String hiddenWord, String userGuess) {
        int longitud = hiddenWord.length();
        StringBuilder hint = new StringBuilder("-----"); // Inicializa la pista con guiones

        // Arreglos para controlar qué caracteres ya se han usado
        int[] usedInHidden = new int[longitud]; // Marca posiciones usadas en la palabra oculta
        int[] usedInGuess = new int[longitud];  // Marca posiciones usadas en el intento del usuario

        // Marcar las letras en la posición correcta
        for (int i = 0; i < longitud; i++) {
            if (userGuess.charAt(i) == hiddenWord.charAt(i)) {
                hint.setCharAt(i, '*'); // Marca posición correcta
                usedInHidden[i] = 1;   // Marca posición usada en la palabra oculta
                usedInGuess[i] = 1;    // Marca posición usada en el intento
            }
        }

        // Marcar letras contenidas pero en posiciones incorrectas
        for (int i = 0; i < longitud; i++) {
            if (usedInGuess[i] == 0) { // Solo procesar las posiciones no usadas
                for (int j = 0; j < longitud; j++) {
                    if (usedInHidden[j] == 0 && userGuess.charAt(i) == hiddenWord.charAt(j)) {
                        hint.setCharAt(i, 'x'); // Marca como letra correcta en posición incorrecta
                        usedInHidden[j] = 1;   // Marca posición usada en la palabra oculta
                        break;                 // Deja de buscar para esta letra
                    }
                }
            }
        }

        return hint.toString(); // Devuelve la pista como cadena
    }
}
