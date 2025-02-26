package Tema5;

class Usuariob {
    private String nombre;
    private int edad;
    private String dni;

    public Usuariob(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + dni;
    }
}
