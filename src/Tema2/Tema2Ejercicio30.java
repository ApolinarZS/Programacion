package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operacion;


        System.out.println("Bienvenido a la calculadora. Escribe 'exit' en cualquier momento para salir.");

        while (true) {
            try {
                System.out.print("Introduce el primer número (o 'exit' para salir): ");
                String entrada = scanner.next();


                if (entrada.equalsIgnoreCase("exit")) {
                    System.out.println("Saliendo de la calculadora...");
                    break;
                }


                double numero1 = Double.parseDouble(entrada);

                System.out.print("Introduce la operación (+, -, *, /, %): ");
                operacion = scanner.next();

                if (operacion.equalsIgnoreCase("exit")) {
                    System.out.println("Saliendo de la calculadora...");
                    break;
                }

                System.out.print("Introduce el segundo número (o 'exit' para salir): ");
                entrada = scanner.next();

                if (entrada.equalsIgnoreCase("exit")) {
                    System.out.println("Saliendo de la calculadora...");
                    break;
                }


                double numero2 = Double.parseDouble(entrada);


                double resultado = 0;
                boolean operacionValida = true;

                switch (operacion) {
                    case "+":
                        resultado = numero1 + numero2;
                        break;
                    case "-":
                        resultado = numero1 - numero2;
                        break;
                    case "*":
                        resultado = numero1 * numero2;
                        break;
                    case "/":
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                            operacionValida = false;
                        }
                        break;
                    case "%":
                        if (numero2 != 0) {
                            resultado = numero1 % numero2;
                        } else {
                            System.out.println("Error: No se puede calcular el módulo con cero.");
                            operacionValida = false;
                        }
                        break;
                    default:
                        System.out.println("Operación no válida.");
                        operacionValida = false;
                }

                if (operacionValida) {
                    System.out.println("Resultado: " + resultado);
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, introduce un número válido.");
            }
        }

        scanner.close();
    }
}