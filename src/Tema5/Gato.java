package Tema5;

public class Gato {
    private String nombre;
    private int edad;

    // Constructor
    public Gato(String nombre, int edad) throws Exception {
        setNombre(nombre); // Validar y asignar el nombre
        setEdad(edad);     // Validar y asignar la edad
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Setters con validaciones
    public void setNombre(String nombre) throws Exception {
        if (nombre == null || nombre.length() < 3) {
            throw new Exception("Error: El nombre debe tener al menos 3 caracteres.");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("Error: La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Gato: Nombre = " + nombre + ", Edad = " + edad);
    }
}
