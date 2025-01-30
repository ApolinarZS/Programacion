package Tema4;

public class RelojMain {

    public static void main (String[] args){

        //guardamos los datos
        Reloj reloj = new Reloj(6,27,38);

        reloj.setModo(false);

        int hora = reloj.getHora();
        int minuto = reloj.getMinuto();
        int segundo = reloj.getSegundo();
        boolean modo = reloj.isModo();

        System.out.println(reloj);
    }
}
