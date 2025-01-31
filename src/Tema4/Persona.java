package Tema4;

public class Persona {

    //Atributos de la persona
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private static final int adultAge = 18;
    private static final int retiredAge = 65;

    public Persona(){
        this.dni = "";
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
    }

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = 0;
    }

    public String getdni() {
        return dni;
    }

    public void setdni(String dni) {
        this.dni = dni;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

        if (edad <= 0 || edad > 120){
            System.out.println("Edad inválida");
        } else   this.edad = edad;

    }

    public static void isAdult(int edad){

        if (edad >= adultAge){
            System.out.println("Eres mayor de edad!");
        } else System.out.println("Eres menor de edad...");

    }

    public static void isRetired (int edad){

        if (edad > retiredAge){
            System.out.println("Te jubilaste, enhorabuena, descansa y disfruta de la vida.");
        } else System.out.println("Aún te queda por trabajar, mucho ánimo.");

    }

    public static int ageDifference(int edad1, int edad2){
        if (edad1 < edad2){
            return edad2 - edad1;
        }
        return edad1 - edad2;
    }

    public static void checkDNI(String dni){

        if (dni.length() == 9){
            dni = dni;

        } else System.out.println("DNI inválido");
    }

}
