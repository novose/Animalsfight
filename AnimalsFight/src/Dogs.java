import java.util.Random;

public class Dogs extends Animal {

    public Dogs(String name, int ennemy) {
        super(name, ennemy);
    }

    public int attack() {
        Random rand = new Random();

        int dmg = this.getAttack();
        int chance = rand.nextInt(4) + 1;
        if (chance < 1) {
            int attackSpe = rand.nextInt(40);
            dmg = attackSpe + 20;
            System.out.println(this.getName() + " utilise Scoobidou ! ");
        }
        else {
            System.out.println(this.getName() + " utilise l'attaque normale ! ");
        }
        return dmg;
    }
}