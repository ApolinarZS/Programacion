package Tema3;

public class MyMath {

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
        boolean primo = true;
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
    public static boolean noEsPrimo(int num) {
        return !siEsPrimo(num);
    }
    public static int cifras(int num){
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
    public static int pares(int num){
        if (num < 0) {
            num = -num;
        }
        int pares = 0;

        while (num > 0) {
            num /= 10;
        }

        return pares;
    }

}
