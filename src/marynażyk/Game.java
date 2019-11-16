package marynażyk;

import java.util.Scanner;

public class Game {

    public void start() {

        System.out.println("Who is the first player?\n -Human\n -Komputer");
        Scanner scanner= new Scanner (System.in);
        String player=scanner.nextLine();
        Player player1;

        if (player.equals("Human"))
            player1=new Human("Player1");
        else
            player1=new Komputer("Player1");

        Player player2=new Komputer("Player2");

        Gun player1Choice=player1.makeChoice();
        Gun player2Choice=player2.makeChoice();

        if(player1Choice==player2Choice)
            System.out.println("Draw");
        else if (player1Choice == Gun.paper && player2Choice==Gun.stone)
            System.out.println("Player 1 win");
        else if (player1Choice == Gun.scissors && player2Choice==Gun.paper)
            System.out.println("Player 1 win");
        else if (player1Choice == Gun.stone && player2Choice==Gun.scissors)
            System.out.println("Player 1 win");
        else System.out.println("Player 2 win");
    }
}
