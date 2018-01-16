import java.util.Random;

public class Cats extends Animal {

    public Cats(String name, int ennemy) {
        super(name, ennemy);
    }

    public int attack() {
        Random rand = new Random();
        int dmg = this.getAttack();
        int chance = rand.nextInt(3);
        if (chance < 1) {
            int attackSpe = rand.nextInt(20);
            dmg = attackSpe + 30;
            System.out.println(this.getName() + " utilise CalinChatPotté ! ");
        }
        return dmg;
    }


}