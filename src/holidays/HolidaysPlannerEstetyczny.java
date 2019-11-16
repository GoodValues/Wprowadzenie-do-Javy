package holidays;

import java.util.*;

public class HolidaysPlannerEstetyczny {
    private Map<String, List<String>> destinations;

    public void display() {
        for (Map.Entry<String, List<String>> entry : destinations.entrySet()) {
            System.out.println("Miasta w " + entry.getKey() + ":");
            for (String city : entry.getValue()) {
                System.out.println(city + " ");
            }
            System.out.println();
        }
    }

    public void readDestinations() {
        boolean stillReading;
        destinations = new HashMap<>();

        do {
            System.out.println("Podaj Państwo: ");
            Scanner scanner = new Scanner(System.in);
            String country = scanner.nextLine();
            stillReading = readCities(country);
        } while (stillReading);
    }

    private boolean readCities(String country) {
        List<String> cities = new ArrayList<>();
        while (true) {
            System.out.println("Podaj miasto: ");
            Scanner scanner = new Scanner (System.in);
            String city = scanner.nextLine();
            switch (city) {
                case "jadę dalej":
                    destinations.put(country, cities);
                    return true;
                case "wracam do domu":
                    destinations.put(country, cities);
                    return false;
                default:
                    cities.add(city);
                    break;  // tutaj nam caly czas czyta, nie konczy metody
            }
        }
    }
}
