package Tema4;

public class Persona {

    //Atributos de la persona
    private String DNI;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String dni, String dni1) {

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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
        this.edad = edad;
    }
    public void print(){
        System.out.println(DNI);
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(edad);
    }
}
