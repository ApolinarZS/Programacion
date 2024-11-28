package Tema3;

import java.util.Scanner;

import static Tema3.Tema3Ejercicio1.numberSign;
import static Tema3.Tema3Ejercicio2.isAdult;
import static Tema3.Tema3Ejercicio3.*;
import static Tema3.Tema3Ejercicio4.*;
import static Tema3.Tema3Ejercicio5.tablas;
import static Tema3.Tema3Ejercicio7.esPrimo;
import static Tema3.Tema3Ejercicio8.esFechaValida;
import static Tema3.Tema3Ejercicio9.mostrarTrianguloCentrado;

public class Tema3Ejercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char option;//será la variable que fije qué opción quiere el usuario
        boolean menu = true;//determinará si el usuario quiere seguir usando el programa o no

        do {//Muestro el menú
            System.out.println("---------MENÚ---------");
            System.out.println("a) Muestra el signo de un número introducido por el usuario.");
            System.out.println("b) Indica si el usuario es mayor de edad o no.");
            System.out.println("c) Calcula el área y perímetro de un círculo.");
            System.out.println("d) Conversor de euros a dólaers y de dólares a euros.");
            System.out.println("e) Mostrar tabla de multiplicar de un número.");
            System.out.println("f) Mostrar tablas de multiplicar del 1 al 10.");
            System.out.println("g) Comprobador de números primos.");
            System.out.println("h) Comprobador de fechas.");
            System.out.println("i) Dibujar triángulos");
            System.out.println("j) SALIR");
            option = scanner.next().charAt(0);
            switch (option){
                case 'a'->{
                    //Pido el número al usuario
                    System.out.println("Introduce un número");
                    int num = scanner.nextInt();
                    //almaceno el resultado de la función
                    int resultado = numberSign(num);

                    //Compruebo si es 0, positivo o negativo y se lo digo al usuario
                    if (resultado == 0){
                        System.out.println("El número introducido es "+resultado+".");
                    }
                    if (resultado < 0 ){
                        System.out.println("El número introducido es negativo");
                    } else if (resultado > 0) System.out.println("El número introducido es positivo");
                }
                case 'b'->{
                    //Empezamos el ejercicio2 como tal. Le pido al usuario la edad
                    System.out.println("Introduce una edad");
                    int age = scanner.nextInt();

                    //Compruebo si es mayor o menor de edad y se lo digo al usuario
                    int realage = isAdult(age);
                    if (realage == 18){
                        System.out.println("Es mayor de edad");
                    }else if (realage == 0) System.out.println("Es menor de edad");
                }
                case'c'->{
                    //le pido al usuario el radio
                    System.out.println("Introduce un radio (puedes usar decimales)");
                    double radius = scanner.nextDouble();
                    while (!validRadius(radius)){
                        System.out.println("Introduce un radio válido (no puede ser menor o igual a 0");
                    }
                    //llamo y almaceno el perímetro calculado
                    double resultadoperimetro = calculateCirclePerimeter(radius);
                    //llamo y almaceno el área calculada
                    double resultadocarea = calculateCircleArea(radius);

                    //se lo muestro al usuario
                    System.out.println("El perímetro del círculo es "+resultadoperimetro+".");
                    System.out.println("El área del círculo es "+resultadocarea+".");
                }
                case 'd'->{
                    //llamo a la función del menú
                    showMenu();
                    //leo la respuesta del usuario en una nueva variable int
                    int cambio = scanner.nextInt();

                    //creo un switch para realizar los cambios según la respuesta del usuario
                    switch (cambio){
                        case 1->{
                            System.out.println("Introduce el valor a cambiar de euros a dólares");
                            double valor = scanner.nextDouble();
                            double resultadonuevodolar = (euro2dollar(valor));//almaceno la función para usarla cómodamente
                            System.out.println(valor+"euros son "+resultadonuevodolar+" dólares");//le muestro el resultado al usuario
                        }
                        case 2->{
                            System.out.println("Introduce el valor a cambiar de dólares a euros");
                            double valor = scanner.nextDouble();
                            double resultadonuevoeuro = (dollar2euro(valor));//almaceno la función para usarla cómodamente
                            System.out.println(valor+"dólares son "+resultadonuevoeuro+" euros");//le muestro el resultado al usuario
                        }
                    }
                }
                case 'e'->{
                    System.out.println("Introduce un número entero del 1 al 10");
                    int num = scanner.nextInt();
                    tablas(num);
                }
                case 'f'->{
                    //creo un for en el que usaré la función del ejercicio 5 para mostrar las tablas de multiplicar del 1 al 10
                    for(int i = 1; i <= 10; i++){
                        System.out.println("TABLA DEL "+i+".");
                        tablas(i);
                    }
                }
                case 'g'->{
                    //le pido al usuario que introduzca los números
                    //uso un do while para que me introduzca al menos 1 número
                    int num;//números introducidos por el usuario
                    do {
                        System.out.println("Introduce números enteros positivos (Introduce 0 si quieres parar)");
                        num = scanner.nextInt();
                        if (esPrimo(num)){
                            System.out.println("El número introducido es primo.");
                        } else System.out.println("El número introducido NO es primo");
                    } while (num != 0);
                }
                case 'h'->{
                    //Le pido al usuario el día, mes y año
                    System.out.print("Introduce el día (1-31): ");
                    int dia = scanner.nextInt();
                    System.out.print("Introduce el mes (1-12): ");
                    int mes = scanner.nextInt();
                    System.out.print("Introduce el año: ");
                    int anio = scanner.nextInt();

                    // Validamos la fecha usando la función
                    if (esFechaValida(dia, mes, anio)) {
                        System.out.println("La fecha es válida.");
                    } else {
                        System.out.println("La fecha no es válida.");
                    }
                }
                case 'i'-> mostrarTrianguloCentrado('*', 5);
                case 'j'-> {
                    menu = false;
                    System.out.println("Has salido del menú.");
                }
            }
        }while (menu);
    }
}
