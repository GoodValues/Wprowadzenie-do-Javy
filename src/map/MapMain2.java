package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, List<String>> friends = new HashMap<>();
        List<String> adasFriends = new ArrayList<>();
        adasFriends.add("Michał");
        adasFriends.add("Krzyś");
        adasFriends.add("Karolina");
        friends.put("Ada", adasFriends);

        List<String> filipsFriends = new ArrayList<>();
        filipsFriends.add("Wiktor");
        filipsFriends.add("Andzelika");
        filipsFriends.add("Patrycja");
        friends.put("Filip", filipsFriends);

        for (Map.Entry<String, List<String>> entry : friends.entrySet()) {
            System.out.println(entry.getKey() + " ma przyjaciół: ");
            for (String friend  : entry.getValue()) {
                System.out.println(friend);
            }
        }
    }
}
