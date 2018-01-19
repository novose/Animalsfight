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
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";


    public Animal() {
        Random rand = new Random();
        this.hp = rand.nextInt(400) + 400;
        this.setAttack(rand.nextInt(30));
        this.name = "Unnamed";
        instances.add(this);
    }


    public Animal(String name, int ennemy) {
        Random rand = new Random();
        this.hp = rand.nextInt(400) + 400;
        this.setAttack(rand.nextInt(30));
        this.name = name;
        this.ennemy = ennemy;
        instances.add(this);
    }



    public static void create() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.print("Choisissez un nom pour votre animal : ");
        String name = sc.nextLine();

        while (choice == 0) {
            System.out.print("\n Choississez le type d'animal : \n 1/ Chat\n 2/ Chien\n 3/ Furet\n-> ");
            String input = sc.nextLine();
            if (input.equals("1")) {
                new Cats(name, 0);
                choice = 1;
            }
            else if (input.equals("2")) {
                new Dogs(name, 0);
                choice = 1;
            }
            else if (input.equals("3")) {
                new Ferrets(name, 0);
                choice = 1;
            }
            else {
                System.out.println("Merci de choisir un type d'animal proposé en tapant le nombre correspondant.\n");
            }
        }
    }

    public static void create_ennemy() {
        Random rand = new Random();
        int choice = rand.nextInt(3) + 1;
        System.out.println(choice);
        if (choice == 1) {
            new Cats("Wild Cat", 1);
        }
        else if (choice == 2) {
            new Dogs("Wild Dog", 1);
        }
        else if (choice == 3) {
            new Ferrets("Wild Ferret", 1);
        }
    }

    public static void battle() {
        ArrayList<Animal> animals = Animal.getInstances();
        Animal animal = animals.get(0);
        Animal ennemy = animals.get(1);
        System.out.println("\n Un " + ennemy.name + " est apparu ! Préparez vous au combat !\n\n ");

        int turn = 0;
        while (animal.getHp() > 0 && ennemy.getHp() > 0) {
            System.out.println("Que souhaitez-vous faire ?");
            System.out.print("1) Attaquer\n2) Voir les stats de l'ennemi\n3) Fuir\n-> ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("1")) {
                int damage = animal.attack();
                ennemy.setHp(ennemy.hp - damage);
                System.out.println(ANSI_RED + ennemy.name + " perd " + damage + "hp ! \n\n" + ANSI_RESET);
                if (ennemy.getHp() <= 0 )
                    break;
                int ennemy_damage = ennemy.attack();
                animal.setHp(animal.hp - ennemy_damage);
                System.out.println(ANSI_GREEN + animal.name + " perd " + ennemy_damage + "hp !\n\n" + ANSI_RESET);
                if (animal.getHp() <= 0 )
                    break;
            }
            else if (input.equals("2")) {
                System.out.println(ANSI_GREEN + animal.name + "\nHp : " + animal.getHp() + "\nAttack : " + animal.getAttack() + "\n\n" + ANSI_RESET);
                System.out.println(ANSI_RED + ennemy.name + "\nHp : " + ennemy.getHp() + "\nAttack : " + ennemy.getAttack() + "\n\n" + ANSI_RESET);
            }
            else if (input.equals("3")) {
                System.exit(0);
            }
        }
        if (animal.getHp() <= 0 ) {
            System.out.println("Vous avez été vaincu !\n\n\n");
        }
        else if (ennemy.getHp() <= 0 ) {
            System.out.println("Félicitations ! Vous avez vaincu l'animal ennemi !\n\n\n");
        }
        animals.clear();


    }

    public static void show_stats() {
        System.out.println("Chat \nHp : 400-800\nAttack : 0-30(spe : 30 + 0-20)\n");
        System.out.println("Chien \nHp : 400-800\nAttack : 0-30(spe : 20 + 0-40)\n");
        System.out.println("Furet \nHp : 400-800\nAttack : 0-30(spe : 15 + 15-50)\n");
    }

    public static ArrayList<Animal> getInstances() {
        return instances;
    }

    public int attack(){ return 0;}

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
