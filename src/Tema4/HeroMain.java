package Tema4;

import java.util.Scanner;

public class HeroMain {

    public static void main (String[] args){


        boolean menu = true;
        Scanner scanner = new Scanner(System.in);


        Hero hero1 = new Hero("Eric",1,15,15,0,3,2);
        Hero hero2 = new Hero("Goblin",1, 10, 10, 0,2,1);

        String name1 = hero1.getName();
        int level1 = hero1.getLevel();
        int health1 = hero1.getHealth();
        int maxHealth1 = hero1.getMaxHealth();
        int experience1 = hero1.getExperience();
        int attack1 = hero1.getAttack();
        int defense1 = hero1.getDefense();

        String name2 = hero2.getName();
        int level2 = hero2.getLevel();
        int health2 = hero2.getHealth();
        int maxHealth2 = hero2.getMaxHealth();
        int experience2 = hero2.getExperience();
        int attack2 = hero2.getAttack();
        int defense2 = hero2.getDefense();


        do {
            menu();
            char option = scanner.next().charAt(0);//Leemos por consola la opción que elige el usuario
            switch (option) {
                case 'a' -> {
                    hero1.drinkPotion(hero1);
                }
                case 'b' -> {
                    hero1.rest(hero1);
                }
                case 'c' -> {
                    System.out.println(hero1);
                }
                case 'd' -> {
                    hero1.attack(hero1, hero2);

                }
                case 'e' -> {
                    menu = false;
                    System.out.println("Saliste del juego");
                }
            }
        }while (menu);

    }

    private static void menu() {
        System.out.println("Qué quieres hacer?");
        System.out.println("a. Beber Poción || b. Descansar || c. Mostrar información del héroe || d. Atacar || e. Dejar de jugar");
    }
}
