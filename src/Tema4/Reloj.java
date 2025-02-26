package Tema4;

public class Reloj {

    //Atributos del reloj
    private int hora;
    private int minuto;
    private int segundo;
    private boolean modo;

    public Reloj() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this. segundo = segundo;
    }

    public static void muestra(int hora, int minuto, int segundo, boolean modo){

    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23){
            hora = 0;
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59){
            minuto = 0;
        }
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59){
            segundo = 0;
        }
        this.segundo = segundo;
    }

    public boolean isModo() {
        return modo;
    }

    public void setModo(boolean modo) {
        this.modo = modo;
    }

    public String toString(){

        String formato;
            if (!modo && hora <= 12){
                 formato = "(12 horas)";
            } else {
                 formato = "(24 horas)";
            }
        return hora+":"+this.minuto+":"+this.segundo+" "+formato+" .";
    }
}
