import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Animal {

    private String name;
    private int hp;
    private int attack;
    private int specialattack;
    private int maxrandom;
    private String type;
    private int ennemy;
    private static ArrayList<Animal> instances = new ArrayList<>();


    public Animal() {
        Random rand = new Random();
        this.hp = rand.nextInt(800) + 400;
        this.setAttack(rand.nextInt(30));
        this.name = "Unnamed";
        instances.add(this);
    }


    public Animal(String name, int ennemy) {
        Random rand = new Random();
        this.hp = rand.nextInt(800) + 400;
        this.setAttack(rand.nextInt(30));
        this.name = name;
        this.ennemy = ennemy;
        instances.add(this);
    }



    public static void create() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("Choisissez un nom pour votre animal :");
        String name = sc.nextLine();

        while (choice == 0) {
            System.out.println("\n Choississez le type d'animal : \n 1/ Chat\n 2/ Chien\n 3/ Furet\n ");
            String input = sc.nextLine();
            if (input.equals("1")) {
                new Cats(name, 0);
                choice = 1;
            }
           /* else if (input.equals("2")) {
                new Dogs(name);
                choice = 1;
            }
            else if (input.equals("3")) {
                new Ferrets(name);
                choice = 1;
            }*/
            else {
                System.out.println("Merci de choisir un type d'animal proposé en tapant le nombre correspondant.\n");
            }
        }
    }

    public static void create_ennemy() {
        System.out.println("\n Un ennemi est apparu ! Préparez vous au combat !\n\n ");
        Random rand = new Random();
        int choice = rand.nextInt(3) + 1;
//        if (choice == 1) {
            new Cats("Wild Cat", 1);
//        }
       /* else if (choice == 2) {
            new Dogs("Wild Dog", 1);
        }
        else if (choice == 3) {
            new Ferrets("Wild Ferret", 1);
        }*/
    }

    public static void battle() {
        ArrayList<Animal> animals = Animal.getInstances();
        System.out.println(" !");
        Animal animal = animals.get(0);
        Animal ennemy = animals.get(1);
        int turn = 0;
//        while (animal.getHp() > 0 && ennemy.getHp() > 0) {
//
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            if (input.equals("1")) {
//
//                turn = 1;
//            }
//
//        }
    }

    public static void show_stats() {
        ArrayList<Animal> animals = Animal.getInstances();
        Animal animal = animals.get(0);
        System.out.println(animal.getName());
        System.out.println(animal.getHp());
        System.out.println(animal.getAttack());
    }

    public static ArrayList<Animal> getInstances() {
        return instances;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpecialattack() {
        return specialattack;
    }

    public void setSpecialattack(int specialattack) {
        this.specialattack = specialattack;
    }

    public int getMaxrandom() {
        return maxrandom;
    }

    public void setMaxrandom(int maxrandom) {
        this.maxrandom = maxrandom;
    }

    public int getEnnemy() {
        return ennemy;
    }

    public void setEnnemy(int ennemy) {
        this.ennemy = ennemy;
    }
}
