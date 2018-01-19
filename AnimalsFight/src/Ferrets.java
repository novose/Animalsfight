import java.util.Random;

public class Ferrets extends Animal {

    public Ferrets(String name, int ennemy) {
        super(name, ennemy);
    }

    public int attack() {
        Random rand = new Random();

        int dmg = this.getAttack();
        int chance = rand.nextInt(2) + 1;
        if (chance < 1) {
            int attackSpe = rand.nextInt(35) + 15;
            dmg = attackSpe + 15;
            System.out.println(this.getName() + " utilise BoulePuante ! ");
        }
        else {
            System.out.println(this.getName() + " utilise l'attaque normale ! ");
        }
        return dmg;
    }
}