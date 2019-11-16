package listOfList;

import java.util.ArrayList;
import java.util.List;

public class ListofListMain {
    public static void main(String[] args) {
        List<List<Integer>> l = new ArrayList<>();
        int maxIndex=10;
        for (int i=0; i <=maxIndex; i++) {
            List<Integer> tmpList = new ArrayList<>();
            for (int j=0; j<=maxIndex; j++)
                tmpList.add(i*j);
            l.add(tmpList);
        }
        System.out.println(l.get(4).get(7));
        l.get(4).remove(7);
        System.out.println(l.get(4).get(7));

        for (List<Integer> currentList : l) { //pierwsza metoda wyświetlania
            for (Integer value : currentList ) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        for (int i=0; i<l.size(); i++) {
            List<Integer> tmpList=l.get(i);
            for (int j=0; j<tmpList.size(); j++) {
                System.out.print(tmpList.get(j) + " ");
            }
            System.out.println();
        }

    }
}
