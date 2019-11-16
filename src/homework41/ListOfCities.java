package homework41;

import java.util.ArrayList;
import java.util.List;

public class ListOfCities {
    private List<String> list;
    private String miasto;

    public ListOfCities() {
        list=new ArrayList<String>();
    }

    public void add (String miasto) {
        list.add(miasto);
    }

    public String getName() {
        return miasto;
    }

    public void display() {
        for (String city : list) System.out.println(city);
    }

    public int size() {
        return list.size();
    }
}
