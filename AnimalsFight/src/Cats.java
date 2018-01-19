import java.util.Random;

public class Cats extends Animal {

    public Cats(String name, int ennemy) {
        super(name, ennemy);
    }

    public int attack() {
        Random rand = new Random();

        int dmg = this.getAttack();
        int chance = rand.nextInt(3);
        System.out.println(chance);
        if (chance < 1) {
            int attackSpe = rand.nextInt(20);
            dmg = attackSpe + 30;
            System.out.println(this.getName() + " utilise CalinChatPotté ! ");
        }
        else {
            System.out.println(this.getName() + " utilise l'attaque normale ! ");
        }
        return dmg;
    }


}