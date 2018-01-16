import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        byte choice = 0;

        while (choice == 0) {
            System.out.println("Menu : \n 1) Créer votre animal \n 2) Voir les stats de l'animal \n 3) Quitter\n \n -> ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("1")) {
                Animal.create();
                Animal.create_ennemy();
                Animal.battle();
            }
//            else if (input.equals("1")) {
//              Animal.show_stats();
//            }
            else if (input.equals("3")) {
                choice = 1;
                System.out.println("Aurevoir !");
                sc.close();
            }
        }
    }
}
