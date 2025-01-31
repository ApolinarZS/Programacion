package Tema3;


import java.util.Scanner;

public class MyString {


    public static void main(String[] args) {

        System.out.println(reverseCap());
        System.out.println(vocales());
        System.out.println(palabralarga());
        System.out.println(vecesincluida());
        System.out.println(cantidadpalabras());
        System.out.println(telefono());
        frecvocales();
    }

    public static String reverseCap() {//e1 a
        Scanner scanner = new Scanner(System.in);//pido al usuario la palabra a invertir
        System.out.println("Introduce la cadena a invertir");
        String cadena = scanner.next();

        String reverse = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {//cogemos las letras de atras a adelante y las sumamos a la variable vacia, dando el resultado que queremos

            reverse = reverse + cadena.charAt(i);
        }
        return reverse;
    }

    public static int vocales(){//e1 b

        Scanner scanner = new Scanner(System.in);//pido al usuario la cadena de la cual sacaré la cantidad de vocales
        System.out.println("Introduce la cadena de la cual quieras saber la cantidad de vocales");
        String cadena = scanner.next();

        int nvocales = 0;//declaro la variable que servirá como contador

        for (int j = 0; j < cadena.length(); j++) {//bucle por el que contaremos letra por letra si es una vocal
            char letraactual = cadena.toLowerCase().charAt(j);

            if (letraactual == 'a' || letraactual == 'e' || letraactual == 'i' || letraactual == 'o'|| letraactual == 'u') {
                nvocales++;
            }

        }

        return nvocales;
    }

    public static String palabralarga(){

        Scanner scanner = new Scanner(System.in);//pido al usuario la cadena de la cual sacaré la palabra más larga
        System.out.println("Introduce la cadena de la cual quieras saber la palabra más larga");
        String cadena = scanner.nextLine();

        String laMasLarga = "";
        int longitud = 0;

        String[] palabras = cadena.split(" ");//separamos por los espacios

        for (String palabra : palabras) {// : para mirar de palabra en palabra
            if (palabra.length() > longitud) {//comparamos la longitud de las palabras metiendo en la variable lamaslarga, la palabra más larga hasta el momento
                laMasLarga = palabra;
                longitud = palabra.length();
            }
        }

        return laMasLarga;
    }

    public static int vecesincluida(){

        Scanner scanner = new Scanner(System.in);//pido al usuario las cadenas de las cuales diré cuantas veces la segunda aparece en la primera
        System.out.println("Introduce la primera cadena");
        String cadena = scanner.nextLine();
        System.out.println("Introduce la segunda cadena (te diré cuantas veces aparece en la primera)");
        String cadena2 = scanner.nextLine();

        int count = 0;
        int index = 0;

        String mainString = "";
        
        while ((index = cadena.indexOf(cadena2, index)) != -1) {
            count++;
            index += cadena2.length();
        }

        return count;
    }

    public static int cantidadpalabras(){

        Scanner scanner = new Scanner(System.in);//pido al usuario las cadenas de las cuales diré cuantas veces la segunda aparece en la primera
        System.out.println("Introduce la cadena de la cual te diré cuantas palabras contiene");
        String cadena = scanner.nextLine();

        String[] palabras = cadena.trim().split(" ");

        return palabras.length; // Devuelve el número de palabras
    }

    public static String telefono(){

        Scanner scanner = new Scanner(System.in);//pido al usuario el teléfono
        System.out.println("Introduce el número de teléfono que separaré en código de país, prefijo y número principal");
        String numero = scanner.nextLine();
        if (numero.length() < 11) {
            System.out.println("El número de teléfono debe tener al menos 11 dígitos.");
        }

        String codigopais = numero.substring(0, 2); // Primeros 2 dígitos
        String prefijo = numero.substring(2, 5);      // Siguientes 3 dígitos
        String numeroprincipal = numero.substring(5);     // Resto del número

        // Formatear el número en el formato (+XX)-XXX-XXXXXX
        return String.format("(+%s)-%s-%s", codigopais, prefijo, numeroprincipal);
    }
    public static void frecvocales(){
        Scanner scanner = new Scanner(System.in);//pido al usuario el
        System.out.println("Introduce una cadena y te diré cuantas veces aparece cada vocal");
        String cadena = scanner.nextLine();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < cadena.length(); j++) {
            char actual = cadena.toLowerCase().charAt(j);

            switch (actual) {
                case 'a'-> a++;
                case 'e'-> e++;
                case 'i'-> i++;
                case 'o'-> o++;
                case 'u'-> u++;
            }
        }

        System.out.println("Total de vocales: " + (a+e+i+o+u));

        System.out.println("Cantidad de a: " + a + ("*").repeat(a));
        System.out.println("Cantidad de e: " + e);
        System.out.println("Cantidad de i: " + i);
        System.out.println("Cantidad de o: " + o);
        System.out.println("Cantidad de u: " + u);
    }

}

