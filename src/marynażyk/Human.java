package marynażyk;

import java.util.Scanner;

public class Human implements Player {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public Gun makeChoice() {
        while (true) {
            System.out.println(name + " insert your choice: ");
            System.out.println("-paper \n -stone \n -scissors");
            Scanner scanner = new Scanner(System.in);
            String choiceString = scanner.nextLine();
            switch (choiceString) {
                case "paper":
                    return Gun.paper; //nie potrzebujemy breaków , bo na i tak wyjdzie z metody gdy wpiszemy konkretną wartość
                case "stone":
                    return Gun.stone; //while się będzie toczył, gdy natrafi na wybór użytkownika, bo mamy return, który wychodzi z metody
                case "scissors":
                    return Gun.scissors;
                default:
                    System.out.println("Incorrect choice, please try again");
            }
        }
    }

    public String getName() {
        return name;

    }

}

