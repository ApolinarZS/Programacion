package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio17 {
    public static void main(String[] args) {

        //Pedimos al usuario el valor 0,1 o 2 \\
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce si quieres calcular la superfície y perímetro de un cuadrado (0), un rectángulo (1) o la superficie de un triángulo (2).");
        int valor = scanner.nextInt();

        switch (valor){
            case '0'->{
                //Le pido el valor del lado de cuadrado al usuario y creo la variable"\\
                System.out.println("Introduce el valor del lado del cuadrado");
                double lado = scanner.nextDouble();

                //Calculamos el área y el perimetro en dos nuevas variables\\
                double area = lado*lado;
                double per = 4*lado;

                //Mostramos por pantalla el resultado\\
                System.out.println("Siendo " +lado+ " el valor del lado, el área y perímetro del cuadrado son " +area+" y " +per+ " respectivamente.");
            }
            case '1'->{
                //Pedimos el valor de la base y de la altura
                System.out.println("Introduce el valor de la base del rectángulo");
                double base = scanner.nextDouble();

                System.out.println("Introduce el valor de la altura del rectángulo");
                double altura = scanner.nextDouble();

                //Calculamos el área y el perímetro\\
                double area = base+altura;
                double per = base*2+altura*2;

                //Mostramos los resultados al usuario\\
                System.out.println("Siendo "+base+" la base y "+altura+" la altura, el área y el perímetro del rectángulo son "+area+ " y "+per+" respectivamente.");

            }

            case '2'->{
                //Pedimos el valor de la base y de la altura
                System.out.println("Introduce el valor de la base del triángulo");
                double base = scanner.nextDouble();

                System.out.println("Introduce el valor de la altura del triángulo");
                double altura = scanner.nextDouble();

                //Calculamos el área \\
                double area = base/2*altura;

                //Mostramos los resultados al usuario\\
                System.out.println("Siendo "+base+" la base y "+altura+" la altura, el área del rectángulo es "+area+ ".");
        }

    }

}
}
