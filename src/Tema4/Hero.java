package Tema4;

public class Hero {

    //Atributos del héroe
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    public Hero(){
        this.name = "";
        this.level = 0;
        this.health = 0;
        this.maxHealth = 0;
        this.experience = 0;
        this.attack = 0;
        this.defense = 0;
    }

    public Hero(String name, int level, int health, int maxHealth, int experience, int attack, int defense){
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;

    }
    public void drinkPotion(Hero hero1) {
        int potion = 10;
        health = health + potion;
        if (health > maxHealth){
            health = maxHealth;
            System.out.println("Te curaste completamente gracias a la poción! Tienes "+health+" PV");
        } else System.out.println("Te curaste "+potion);
    }

    public void rest(Hero hero1){
        int descanso = 50;
        hero1.health = hero1.health + descanso;
        if (hero1.health > hero1.maxHealth){
            hero1.health = hero1.maxHealth;
            System.out.println("Has descansado con éxito, ahora tienes "+hero1.health+" PV");
        } else System.out.println("Te curaste "+descanso+".");

    }
    public void attack(Hero hero1, Hero hero2){

        int danorecibido = Math.max(1, hero1.attack - hero2.defense);
        hero2.health = hero2.health - danorecibido;
        System.out.println("Atacas!");
        System.out.println("Le quedan "+hero2.health+" PV.");
        hero1.experience = hero1.experience + 10;
        if (hero1.experience >= 50){
            levelUp(hero1);
        }


    }
    public void levelUp(Hero hero1){
        if (hero1.experience >= 50){
            System.out.println("Subiste de nivel!");
            hero1.level = hero1.level + 1;
            System.out.println("Nivel: "+hero1.level+".");
            hero1.maxHealth = hero1.maxHealth + 5;
            hero1.health = hero1.health + 5;
            System.out.println("PV: "+hero1.health+".");
            hero1.attack = hero1.attack + 1;
            System.out.println("ATK: "+hero1.attack+".");
            hero1.defense = hero1.defense + 1;
            System.out.println("DEF: "+hero1.defense+".");
            hero1.experience = 0;
        }
    }
    public String toString(){

        String formato;
        return "Nivel: "+level+ "|| PV: "+health+" || ATK: "+attack+" || DEF: "+defense+" || EXP: "+experience+".";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


}



