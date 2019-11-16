package holidays;

import java.util.*;

public class HolidaysPlanner {
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
        destinations = new HashMap<>();

        boolean readNextCountry = true;

        while (true) {
            List<String> cities = new ArrayList<>();
            boolean readNextCity = true;
            System.out.println("Podaj Państwo: ");
            Scanner scanner = new Scanner(System.in);
            String country = scanner.nextLine();
            while (readNextCity) {
                System.out.println("Podaj miasto: ");
                String city = scanner.nextLine();
                switch (city) {
                    case "jadę dalej":
                        destinations.put(country, cities);
                        readNextCity = false;
                        break;
                    case "wracam do domu":
                        destinations.put(country, cities);
                        return;
                    default:
                        cities.add(city);
                        break;
                }
            }
        }
    }

//    public void remove() {
//        Scanner scanner = new Scanner(System.in);
//        String removedCity = scanner.nextLine();
//        for (int i=0; i<destinations.size(); i++)]
//        for (int j=0; j<destinations.)
//        if (removedCity==)
//        for (Map.Entry<String, List<String>> entry : destinations.entrySet()) {
//            System.out.println("miasta w " + entry.getKey() + "to:" );
//            for (String miasta : entry.getValue()) {
//                if(miasta==removedCity) destinations.remove(entry,city);
//            }
//            System.out.println(entry);
//
//        }
//    }
}


