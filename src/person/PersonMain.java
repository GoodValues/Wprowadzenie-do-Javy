package person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) throws FileNotFoundException {
        String filesname="imiona.txt";
        File file=new File(filesname);
        Scanner scanner=new Scanner(file);
        String names="";
        while(scanner.hasNext())
            names+=scanner.nextLine();
        names=names.replace(" ", "");
        System.out.println(names);
        //String names = "Mateusz, Filip, John, Jessica, Kuba";
        String bikeBrands = "Giant, Merida, Kellys, Romet, Betwin";
        String carBrands = "Audi, Opel, VW, Bugatti, BMW, Subaru, Porsche, Ford";
        Person[] people = StringParser.parse(names);
        Bike[] bikes = StringParser.parseBikes(bikeBrands);
        Car[] cars = StringParser.parseCars(carBrands);

        for (int i = 0; i < people.length; i++) {
            Random rand = new Random();
            people[i].buy(bikes[rand.nextInt(bikes.length)]);
            people[i].buy(cars[rand.nextInt(cars.length)]);
        }

        for (Person person : people) {
            Vehicle[] vehicles = person.getVehicles(); //brane są od czlowieka wszytkie auta
            for (int i = 0; i < vehicles.length; i++) {
                Vehicle currentVehicle = vehicles[i];
                LocalDateTime dateTime=currentVehicle.getBoughtDate();
                DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");

                String zakup=person.getName() + " kupił " + (currentVehicle.getClass() == Bike.class ? " rower " : " samochód ")
                        + " marki " + currentVehicle.getBrand() + " dnia " + dateTime.format(formatter) + "\n" ;

                    try {
                        Files.write(Paths.get("zakup.txt"), zakup.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace(); //wyświetli nam metody , które były tutaj wykonywane po kolei i zakończy na tej, gdzie się wykrzaczył
                    }

            }
        }
    }
}
