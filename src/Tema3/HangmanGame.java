package Tema3;

import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jugador 1: Ingresa una palabra para adivinar:");
        String palabra = scanner.nextLine().toLowerCase();//palabra a adivinar

        // Hacemos espacio en la consola para que el segundo jugador no lea la palabra
        for (int i = 0; i < 50; i++) System.out.println();

        int intentos = 6;//marcamos los intentos que tiene el usuario para adivinar la palabra
        StringBuilder palabradivinada = new StringBuilder("_".repeat(palabra.length()));//creamos las _ según la longitud de la palabra a adivinar
        StringBuilder errores = new StringBuilder();//variable en la que almacenamos las letras erróneas usadas

        while (intentos > 0) { //bucle en el que estaremos hasta que los intentos se acaben
            System.out.println("Palabra: " + palabradivinada);
            System.out.println("Errores: " + errores);
            System.out.println("Intentos restantes: " + intentos);
            Hangman(6 - intentos);//cuantos menos intentos, más se dibujará al hanged man

            System.out.println("Jugador 2: Ingresa una letra o escribe 'resolver' para adivinar la palabra:");
            String letra = scanner.nextLine().toLowerCase();//forzamos que la letra introducida esté en minúscula

            if (letra.equals("resolver")) {//si el usuario introduce resolver
                System.out.println("Ingresa tu solución:");
                String solution = scanner.nextLine().toLowerCase();//se le permitirá introducir una palabra
                if (solution.equals(palabra)) {//y si es igual
                    System.out.println("¡Felicidades! Has adivinado la palabra: " + palabra);//el usuario 2 gana
                    break;//y salimos
                } else {
                    System.out.println("Incorrecto. Has perdido.");//pero si no acierta, pierde
                    break;
                }
            } else if (letra.length() == 1) {//si la letra introducida es un único carácter
                char guess = letra.charAt(0);//la introducimos en la variable guess
                if (palabra.contains(String.valueOf(guess))) { //y si la palabra a adivinar contiene la letra introducida
                    for (int i = 0; i < palabra.length(); i++) {//usando este bucle la mostramos en su respectivo lugar
                        if (palabra.charAt(i) == guess) {
                            palabradivinada.setCharAt(i, guess);
                        }
                    }
                    if (palabradivinada.toString().equals(palabra)) {//si letra a letra adivina la palabra, felicitamos al usuario por adivinarla
                        System.out.println("¡Felicidades! Has adivinado la palabra: " + palabra);
                        break;
                    }
                } else {
                    if (!errores.toString().contains(String.valueOf(guess))) {//si la letra introducida ya ha sido utilizada antes, le damos un aviso y le quitamos un intento
                        errores.append(guess).append(" ");
                        intentos--;
                    } else {
                        System.out.println("Ya intentaste esa letra.");
                    }
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingresa solo una letra o escribe 'resolver'.");//intentamos manejar la información introducida por el usuario
            }
        }

        if (intentos == 0) {
            System.out.println("Has perdido. La palabra era: " + palabra);//el usuario se ha quedado sin intentos y ha perdido
            Hangman(6);
        }
        scanner.close();
    }

    private static void Hangman(int paso) {
        //dibujo del ahorcado
        switch (paso) {
            case 1 -> {
                System.out.println("\n o ");
            }
            case 2 -> {
                System.out.println("\n o ");
                System.out.println(" |");
            }
            case 3 -> {
                System.out.println("\n o ");
                System.out.println("/|");
            }
            case 4 -> {
                System.out.println("\n o ");
                System.out.println("/|\\");
            }
            case 5 -> {
                System.out.println("\n o ");
                System.out.println("/|\\");
                System.out.println("/");
            }
            case 6 -> {
                System.out.println("\n o ");
                System.out.println("/|\\");
                System.out.println("/ \\");
            }
            default -> {
                System.out.println();
            }
        }
    }
}

