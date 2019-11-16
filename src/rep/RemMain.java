package rep;

import java.util.HashMap;
import java.util.Map;

public class RemMain {
    public static void main(String[] args) {
        Map<Employee, Manager> structure = new HashMap<>();
        structure.put(new Employee("Czarek"), new Manager("Grzesiek"));
        structure.put(new Employee("Andzelika"), new Manager("Lysy"));
    }
}
