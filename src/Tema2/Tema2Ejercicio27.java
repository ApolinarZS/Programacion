package Tema2;

public class Tema2Ejercicio27 {
    public static void main(String[] args) {

        int contadorPrimos = 0;
        int numero = 2;

        System.out.println("Los primeros 20 números primos son:");

        while (contadorPrimos < 20) {
            boolean esPrimo = true;

            // Verificar si el número es primo
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.print(numero + " ");
                contadorPrimos++;
            }

            numero++;
        }
    }
    }
