package marynażyk;

import java.util.Random;
import java.util.Scanner;

public class Komputer implements Player {

    private String name;

    public Komputer (String name) {
        this.name=name;
    }

    @Override
    public Gun makeChoice() {

            System.out.println("Komputer ma do wyboru: \n -paper \n -stone \n -scissors");
            int choiceInt;
            String choiceString;

            Random rand=new Random();
            choiceInt=rand.nextInt(3);
            if (choiceInt==Gun.paper.ordinal()) {
                System.out.println("Komputer wybrał papier");
                return Gun.paper;
            }
            else if (choiceInt==1) {
                System.out.println("Komputer wybrał nozyczki");
                return Gun.scissors;
            }
            else if (choiceInt==2) {
                System.out.println("Komputer wybrał kamień");
                return Gun.stone;
            }
            return null;

//            Random random=new Random();
//            int value=random.nextInt(Gun.values().length);
//            Gun selectedGun=Gun.values()[value];
//            return selectedGun;
    }

}
