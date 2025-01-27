package Tema3;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el mensaje:");
        String mensaje = scanner.nextLine();

        System.out.println("¿Qué deseas hacer? (1 = Cifrar, 2 = Descifrar):");
        int option = scanner.nextInt();

        boolean menu = option == 1; // Si elige 1, se cifra; si elige 2, se descifra

        if (menu) {
            System.out.println("Mensaje cifrado: " + encrypt(mensaje));
        } else {
            System.out.println("Mensaje descifrado: " + decrypt(mensaje));
        }
    }

    public static String encrypt(String mensaje) {

        StringBuilder encriptado = new StringBuilder();

        for (char caracter : mensaje.toUpperCase().toCharArray()) { // Elevamos a mayúsculas y convertimos la cadena en un array
            if (caracter >= 'A' && caracter <= 'Z') {
                // Reemplazar letras: Z -> A, otras letras avanzan 1 posición
                encriptado.append(caracter == 'Z' ? 'A' : (char) (caracter + 1));
            } else if (caracter >= '0' && caracter <= '9') {
                // Reemplazar dígitos: 9 -> 0, otros dígitos avanzan 1 posición
                encriptado.append(caracter == '9' ? '0' : (char) (caracter + 1));
            } else {
                // Mantener otros caracteres sin cambios
                encriptado.append(caracter);
            }
        }

        return encriptado.toString();
    }

    public static String decrypt(String mensaje) {

        StringBuilder desencriptado = new StringBuilder();
        for (char caracter : mensaje.toUpperCase().toCharArray()) { // Elevamos a mayúsculas y convertimos la cadena en un array
            if (caracter >= 'A' && caracter <= 'Z') {
                // Si es una letra, retrocede 1 posición (A -> Z)
                desencriptado.append((caracter == 'A') ? 'Z' : (char) (caracter - 1));
            } else if (caracter >= '0' && caracter <= '9') {
                // Si es un dígito, retrocede 1 posición (0 -> 9)
                desencriptado.append((caracter == '0') ? '9' : (char) (caracter - 1));
            } else {
                // Si no es letra ni número, mantenemos el carácter igual
                desencriptado.append(caracter);
            }
        }

        return desencriptado.toString();
    }
}

