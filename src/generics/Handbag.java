package generics;

import java.util.ArrayList;
import java.util.List;

public class Handbag<T> {
    private List<T> list;

    public Handbag() {
        list=new ArrayList<>();
    }

    public void addValue(T value) {
        list.add(value);
    }
    public List<T> getValue() {
        return list;
    }
}
