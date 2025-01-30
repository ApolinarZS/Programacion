package Tema3;

import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random roll = new Random();

        Jugador j1 = crearJugador(scanner, "Jugador 1");
        Jugador j2 = crearJugador(scanner, "Jugador 2");

        mostrarEstadisticas(j1, j2);

        iniciarCombate(j1, j2, scanner, roll);
    }

    private static Jugador crearJugador(Scanner scanner, String nombreJugador) {
        System.out.println(nombreJugador + ", ¿cómo quieres jugar?\n1. Personajes predeterminados || 2. Personaje personalizado");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            return seleccionarPersonajePredeterminado(scanner, nombreJugador);
        } else {
            return crearPersonajePersonalizado(scanner, nombreJugador);
        }
    }

    private static Jugador seleccionarPersonajePredeterminado(Scanner scanner, String nombreJugador) {
        System.out.println("Elige personaje:\n1. Magia Borrás\n2. Sad Bob\n3. Shrek\n4. Cirno");
        int clase = scanner.nextInt();
        return switch (clase) {
            case 1 -> new Jugador("Magia Borrás", 100, 200, 50, 150);
            case 2 -> new Jugador("Sad Bob", 50, 200, 50, 200);
            case 3 -> new Jugador("Shrek", 200, 99, 200, 1);
            case 4 -> new Jugador("Cirno", 200, 50, 50, 200);
            default -> throw new IllegalArgumentException("Opción no válida");
        };
    }

    private static Jugador crearPersonajePersonalizado(Scanner scanner, String nombreJugador) {
        System.out.println(nombreJugador + " - Introduce tu nombre");
        String nombre = scanner.next();
        System.out.println("Distribuye 500 puntos entre PV, ATK, DEF y VEL (máx. 200 por estadística)");

        int[] stats = distribuirEstadisticas(scanner);
        return new Jugador(nombre, stats[0], stats[1], stats[2], stats[3]);
    }

    private static int[] distribuirEstadisticas(Scanner scanner) {
        int total = 500;
        int[] stats = new int[4];
        String[] nombres = {"PV", "ATK", "DEF", "VEL"};

        for (int i = 0; i < 4; i++) {
            do {
                System.out.println("Introduce " + nombres[i] + " (1-200):");
                stats[i] = scanner.nextInt();
            } while (stats[i] < 1 || stats[i] > 200);
            total -= stats[i];
        }
        return stats;
    }

    private static void mostrarEstadisticas(Jugador j1, Jugador j2) {
        System.out.println("\nRESUMEN DE ESTADÍSTICAS\n");
        System.out.println(j1);
        System.out.println("----------------------------------------");
        System.out.println(j2);
    }

    private static void iniciarCombate(Jugador j1, Jugador j2, Scanner scanner, Random roll) {
        int ronda = 0;
        boolean juego = true;
        while (juego) {
            ronda++;
            System.out.println("\nRONDA " + ronda + "\n");

            if (j1.vel > j2.vel) {
                juego = turno(j1, j2, scanner, roll);
                if (juego) juego = turno(j2, j1, scanner, roll);
            } else {
                juego = turno(j2, j1, scanner, roll);
                if (juego) juego = turno(j1, j2, scanner, roll);
            }
        }
    }

    private static boolean turno(Jugador atacante, Jugador defensor, Scanner scanner, Random roll) {
        System.out.println(atacante.nombre + ", ¿qué acción deseas realizar?\n1. ATACAR || 2. REGENERAR");
        int accion = scanner.nextInt();

        if (accion == 1) {
            int danio = calcularDanio(atacante, defensor, roll);
            defensor.pv -= danio;
            System.out.println(defensor.nombre + " recibe un ataque de " + danio);
            if (defensor.pv <= 0) {
                System.out.println("¡" + atacante.nombre + " ha ganado!");
                return false;
            }
        } else {
            int regen = roll.nextInt(1, 50);
            atacante.regenerar(regen);
            System.out.println(atacante.nombre + " regenera " + regen + " puntos de vida");
        }
        return true;
    }

    private static int calcularDanio(Jugador atacante, Jugador defensor, Random roll) {
        double atk_roll = roll.nextDouble(0.15, 0.5);
        double def_roll = roll.nextDouble(0.07, 0.20);
        return (int) ((atacante.atk * atk_roll) * 3 / (defensor.def * def_roll));
    }
}

class Jugador {
    String nombre;
    int pv, atk, def, vel, pvMax;

    public Jugador(String nombre, int pv, int atk, int def, int vel) {
        this.nombre = nombre;
        this.pv = pv;
        this.atk = atk;
        this.def = def;
        this.vel = vel;
        this.pvMax = pv;
    }

    public void regenerar(int cantidad) {
        this.pv = Math.min(this.pv + cantidad, this.pvMax);
    }

    @Override
    public String toString() {
        return nombre + " - PV: " + pv + ", ATK: " + atk + ", DEF: " + def + ", VEL: " + vel;
    }
}


