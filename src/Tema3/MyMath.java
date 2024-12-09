package Tema3;

import java.util.Scanner;

public class MyMath {

    public static void main(String[] args) {

        //hacemos un menú para que le sea claro al usuario
        Scanner scanner = new Scanner(System.in);

        boolean menu = true; //determinará si el programa se repite o no
        do{
            System.out.println("---------MENÚ---------");
            System.out.println("a) Calcular el perímetro y el área de un círculo.");
            System.out.println("b) Calcular el perímtro y el área de un cuadrado.");
            System.out.println("c) Calcula el área y perímetro de un rectángulo.");
            System.out.println("d) Comprobar si un número entero es o no primo.");
            System.out.println("e) Comprobar cuantas cifras tiene un número entero.");
            System.out.println("f) Comprobar cuantas cifras PARES tiene un número entero.");
            System.out.println("g) Comprobar cuantas cifras IMPARES tiene un número entero.");
            System.out.println("h) Calcular el factorial de un número entero.");
            System.out.println("i) Calcular el factorial de un número de manera recursiva.");
            System.out.println("j) Calcular cuantas soluciones tiene una ecuación de segundo grado.");
            System.out.println("k) Calcular la suma de las cifras de un número entero.");
            System.out.println("l) SALIR.");

            char option = scanner.next().charAt(0);//Leemos por consola la opción que elige el usuario


            switch (option){
                case 'a'->{
                    System.out.println("Introduce el radio del círculo.");
                    double radius =scanner.nextDouble();

                    double area = circleArea(radius);
                    double perimeter = circlePerimeter(radius);

                    System.out.println("El área del círculo es "+area+".");
                    System.out.println("El perímetro del círculo es "+perimeter+".");
                }
                case 'b'->{
                    System.out.println("Introduce el lado del cuadrado.");
                    double side =scanner.nextDouble();

                    double area = squareArea(side);
                    double perimeter = squarePerimeter(side);

                    System.out.println("El área del círculo es "+area+".");
                    System.out.println("El perímetro del círculo es "+perimeter+".");
                }
                case 'c'->{
                    System.out.println("Introduce el ancho del rectángulo.");
                    double width = scanner.nextDouble();
                    System.out.println("Introduce la altura del rectángulo.");
                    double height = scanner.nextDouble();

                    double area = rectangleArea(width, height);
                    double perimeter = rectanglePerimeter(width, height);

                    System.out.println("El área del círculo es "+area+".");
                    System.out.println("El perímetro del círculo es "+perimeter+".");
                }
                case 'd'->{
                    System.out.println("Introduce un número y te diré si es primo o no.");
                    int num = scanner.nextInt();

                    while (num < 0){
                        System.out.println("Introduce un número válido (no puede ser menor o igual a 0).");
                        num = scanner.nextInt();
                    }
                    boolean primo = siEsPrimo(num);
                    boolean noprimo = noEsPrimo(num);

                    if (primo) System.out.println("El número introducido es primo.");
                    if (noprimo) System.out.println("El número introducido NO es primo.");
                }
                case 'e'->{
                    System.out.println("Introduce un número entero y te diré cuantas cifras tiene.");
                    int num = scanner.nextInt();

                    int digitos = cifras(num);
                    System.out.println("El número introducido tiene "+digitos+" cifras.");
                }
                case 'f'->{
                    System.out.println("Introduce un número entero y te diré cuantas cifras son pares.");
                    int num = scanner.nextInt();

                    int numpares = pares(num);
                    System.out.println("El número introducido tiene "+numpares+" cifras pares.");
                }
                case 'g'->{
                    System.out.println("Introduce un número entero y te diré cuantas cifras son impares.");
                    int num = scanner.nextInt();

                    int numimpares = impares(num);
                    System.out.println("El número introducido tiene "+numimpares+" cifras impares.");
                }
                case 'h'->{
                    System.out.println("Introduce un número entero y te calcularé su factorial");
                    int num = scanner.nextInt();

                    int numfactorial = factorial(num);
                    System.out.println("El factorial de "+num+" es "+numfactorial+".");
                }
                case 'i'->{
                    System.out.println("Introduce un número entero y te calcularé su factorial de manera recursiva.");
                    int num = scanner.nextInt();

                    int numfactorialR = factorialR(num);
                    System.out.println("El factorial de manera recursiva de "+num+" es "+numfactorialR+".");
                }
                case 'j'->{
                    System.out.println("Introduce el valor de a, b y c. Te diré cuantas soluciones tiene su ecuación de segundo grado");
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    System.out.println("c:");
                    int c = scanner.nextInt();

                    ecuacion(a, b, c);
                }
                case 'k'->{
                    System.out.println("Introduce un número entero y te diré la suma de sus cifras.");
                    int num = scanner.nextInt();

                    int suma = sumadigitos(num);
                    System.out.println("La suma de las cifras del número introducido es "+suma+".");
                }
                case 'l'->{
                    menu = false;
                    System.out.println("Has salido del menú.");
                }
            }
        } while (menu);

    }

    public static double circlePerimeter (double radius){
        return 2 * 3.14 * radius;
    }

    public static double circleArea (double radius){
        return 3.14 * radius * radius;
    }

    public static double squarePerimeter (double side){
        return 4 * side;
    }

    public static double squareArea (double side){
        return side * side;
    }

    public static double rectanglePerimeter (double width, double height){
        return (2 * width) + (2 * height);
    }

    public static double rectangleArea (double width, double height){
        return width * height;
    }

    public static boolean siEsPrimo (int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean noEsPrimo (int num) {
        return !siEsPrimo(num);
    }

    public static int cifras (int num){
        // En el caso de que sea negativo lo volvemos positivo
        if (num < 0) {
            num = -num;
        }

        // Si el número es 0, tiene un dígito
        if (num == 0) {
            return 1;
        }

        int contador = 0;

        // Contar los dígitos dividiendo por 10 repetidamente
        while (num > 0) {
            num /= 10;
            contador++;
        }

        return contador;
    }

    public static int pares (int num){
        if (num < 0) {
            num = -num;
        }
        int pares = 0;

        while (num > 0) {
            num /= 10;
            if (num % 2 == 0) pares++;
        }
        return pares;
    }

    public static int impares (int num){
        if (num < 0) {
            num = -num;
        }
        int impares = 0;

        while (num > 0) {
            num /= 10;
            if (num % 2 != 0) impares++;
        }
        return impares;
    }

    public static int factorial (int num){
        for (int i = 1; i <= num; i++) {
             num *= i;
        }
        return num;
    }

    public static int factorialR (int num){

        if (num == 0){
            return 1;
        } else return num * factorialR(num - 1);
    }

    public static void ecuacion (int a, int b, int c) {

        int d = (b * 2) - (4 * a * c);

        if (d > 0) System.out.println("Tiene dos soluciones reales distintas.");
        if (d == 0) System.out.println("Tiene una única solución");
        if (d < 0) System.out.println("No tiene solución real");
    }

    public static int sumadigitos (int num){

        if (num < 0) {
            num = -num;
        }

        int suma = 0;
        while (num > 0) {
            int digito = num % 10;
            suma = suma + digito;
            num /= 10;

        }
        return suma;
    }
}
