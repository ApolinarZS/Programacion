package Tema4;

import java.util.Scanner;

import static Tema4.Persona.*;

public class PersonaMain {
        public static void main (String[] args){

            Scanner scanner = new Scanner(System.in);
            //Creo la primera persona
            Persona persona1 = new Persona();

            //pido el dni a la primera persona y comprobamos que tenga 9 carácteres
            String dn1 = persona1.getdni();
            System.out.println("Primera persona: Introduce tu DNI (ha de tener 9 carácteres en total).");
            dn1 = scanner.nextLine();
            checkDNI(dn1);

            //pido el nombre a la primera persona
            String nombre1 = persona1.getNombre();
            System.out.println("Primera persona: Introduce tu nombre");
            nombre1 = scanner.nextLine();

            //pido los apellidos a la primera persona
            String apellidos1 = persona1.getApellidos();
            System.out.println("Primera persona: Introduce tus apellidos");
            apellidos1 = scanner.nextLine();

            //pido la edad a la primera persona
            int edad1 = persona1.getEdad();
            System.out.println("Primera persona: Introduce tu edad");
            edad1 = scanner.nextInt();
            isAdult(edad1);
            isRetired(edad1);

            System.out.println("-".repeat(20));
            System.out.println("-".repeat(20));

            //creamos la segunda persona
            Persona persona2 = new Persona();

            //pido el dni a la segunda persona y comprobamos que tenga 9 carácteres
            String dn2 = persona2.getdni();
            System.out.println("Segunda persona: Introduce tu DNI (ha de tener 9 carácteres en total).");
            dn2 = scanner.nextLine();
            checkDNI(dn2);

            //pido el nombre a la segunda persona
            String nombre2 = persona2.getNombre();
            System.out.println("Segunda persona: Introduce tu nombre");
            nombre2 = scanner.nextLine();

            //pido los apellidos a la segunda persona
            String apellidos2 = persona2.getApellidos();
            System.out.println("Segunda persona: Introduce tus apellidos");
            apellidos2 = scanner.nextLine();

            //pido la edad a la segunda persona, vemos si es mayor de edad o si está jubilado
            int edad2 = persona2.getEdad();
            System.out.println("Segunda persona: Introduce tu edad");
            edad2 = scanner.nextInt();
            isAdult(edad2);
            isRetired(edad2);

            //comprobamos la diferencia de edad
            int edadDiff = ageDifference(edad1, edad2);
            if (edadDiff == 0){
                System.out.println("Los dos tenéis la misma edad!");
            } else System.out.println("La diferencia de edad entre las dos personas es de "+edadDiff+" años.");

        }
}
