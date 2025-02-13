package Tema4;

import java.util.Random;

public class HeroJuego {

    public static void main (String[] args){

        Hero hero1 = new Hero("Eric",1,50,50,0,15,10);
        int round = 1;//contador para las rondas

        String name = hero1.getName();
        int level = hero1.getLevel();
        int health = hero1.getHealth();
        int maxHealth = hero1.getMaxHealth();
        int experience = hero1.getExperience();
        int attack = hero1.getAttack();
        int defense = hero1.getDefense();

        while (health > 0) {//mientras el heroe viva el juego seguirá
            System.out.println("ROUND "+round+"!");
            gHorda();

        }

    }
    public static void gHorda(){
        Random rnd = new Random();//random para la cantidad de goblins que aparecen
        int horda = rnd.nextInt(1,3);
        switch (horda){
            case 1->{
                System.out.println("Ha aparecido un goblin!");

                Hero goblin1 = new Hero("Goblin1",1, 20, 20, 0, 5, 2);
                String g1Name = goblin1.getName();
                int g1Health = goblin1.getHealth();
                int g1MaxHealth = goblin1.getMaxHealth();
                int g1Experience = goblin1.getExperience();
                int g1Attack = goblin1.getAttack();
                int g1Defense = goblin1.getDefense();
            }
            case 2->{
                System.out.println("Han aparecido dos goblins!");
                Hero goblin1 = new Hero("Goblin1",1, 20, 20, 0, 5, 2);
                String g1Name = goblin1.getName();
                int g1Health = goblin1.getHealth();
                int g1MaxHealth = goblin1.getMaxHealth();
                int g1Experience = goblin1.getExperience();
                int g1Attack = goblin1.getAttack();
                int g1Defense = goblin1.getDefense();

                Hero goblin2 = new Hero("Goblin2",1, 20, 20, 0, 5, 2);
                String g2Name = goblin2.getName();
                int g2Health = goblin2.getHealth();
                int g2MaxHealth = goblin2.getMaxHealth();
                int g2Experience = goblin2.getExperience();
                int g2Attack = goblin2.getAttack();
                int g2Defense = goblin2.getDefense();
            }
            case 3->{
                System.out.println("Han aparecido tres goblins");
                Hero goblin1 = new Hero("Goblin1",1, 20, 20, 0, 5, 2);
                String gName = goblin1.getName();
                int g1Health = goblin1.getHealth();
                int g1MaxHealth = goblin1.getMaxHealth();
                int g1Experience = goblin1.getExperience();
                int g1Attack = goblin1.getAttack();
                int g1Defense = goblin1.getDefense();

                Hero goblin2 = new Hero("Goblin2",1, 20, 20, 0, 5, 2);
                String g2Name = goblin2.getName();
                int g2Health = goblin2.getHealth();
                int g2MaxHealth = goblin2.getMaxHealth();
                int g2Experience = goblin2.getExperience();
                int g2Attack = goblin2.getAttack();
                int g2Defense = goblin2.getDefense();

                Hero goblin3 = new Hero("Goblin2",1, 20, 20, 0, 5, 2);
                String g3Name = goblin3.getName();
                int g3Health = goblin3.getHealth();
                int g3MaxHealth = goblin3.getMaxHealth();
                int g3Experience = goblin3.getExperience();
                int g3Attack = goblin3.getAttack();
                int g3Defense = goblin3.getDefense();
            }
        }

    }
}
