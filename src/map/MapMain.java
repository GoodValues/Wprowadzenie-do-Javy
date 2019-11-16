package map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> nameSurnameMap = new HashMap<>();
        nameSurnameMap.put("Filip", "Kopytko");
        nameSurnameMap.put("Ada", "Kolanko");
        nameSurnameMap.put("John", "Deep");

        System.out.println(nameSurnameMap.get("Ada"));

        for (Map.Entry<String, String> pair: nameSurnameMap.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }

        Map<String, Integer> nameAgeMap = new HashMap<>();
        nameAgeMap.put("Filip", 20);
        nameAgeMap.put("Ada", 30);
        nameAgeMap.put("John", 40);

        System.out.println(nameAgeMap.get("Ada"));

        for (Map.Entry<String, Integer> pair : nameAgeMap.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
