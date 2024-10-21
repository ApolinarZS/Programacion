package Tema1;

public class Tema1Ejercicio5 {
    public static void main(String[] args) {
        int num1 = 24 % 5;
        double num2 = (int) (7 / 2 + 2.5);
        double num3 = 10.8/2+2;
        int num4 = ((4+6)*3+2*(5-1));
        double num5 = 5/2+17%3;
        boolean num6 = 7>=5 || 27!=8;
        boolean num7 = (45<=7) || ! (5>=7);
        int num8 = 27%4+15/4;
        double num9 = 37/4*4-2;
        boolean num10 = (25>=7) && ! (7<=2);
        boolean num11 = ('H'< 'J') && ('9'!='7');
        boolean num12 = 25>20 & 13>5;
        boolean num13 = 10+4<15-3 || 2*5+1>14-2*2;
        boolean num14 = 4*2<=8 || 2*2<5 & 4>3+1;
        boolean num15 = 10<=2*5 & 3<4 || ! (8>7) & 3*2<=4*2-1;

        System.out.println("24 % 5= " + num1);
        System.out.println("7 / 2 + 2.5= " + num2);
        System.out.println("10.8/2+2= " + num3);
        System.out.println("(4+6)*3+2*(5-1)= " + num4);
        System.out.println("5/2+17%3= " + num5);
        System.out.println("7>=5 || 27!=8= " + num6);
        System.out.println("(45<=7) || ! (5>=7)= " + num7);
        System.out.println("27%4+15/4= " + num8);
        System.out.println("37/4*4-2= " + num9);
        System.out.println("(25>=7) && ! (7<=2)= " + num10);
        System.out.println("('H'< 'J') && ('9'!='7')= " + num11);
        System.out.println("25>20 & 13>5= " + num12);
        System.out.println("10+4<15-3 || 2*5+1>14-2*2= " + num13);
        System.out.println("4*2<=8 || 2*2<5 & 4>3+1= " + num14);
        System.out.println("10<=2*5 & 3<4 || ! (8>7) & 3*2<=4*2-1= " + num15);
    }
}
