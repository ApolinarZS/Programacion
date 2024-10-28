package Tema2;

public class Tema2Ejercicio21 {
    public static void main(String[] args) {

        //definimos las variables\\
        int num = 0;
        int spares = 0;

        while (num < 1000){
            num = num + 2;
            System.out.println(num);
            spares = num+ spares;
            System.out.println(spares);
        }
    }
}
