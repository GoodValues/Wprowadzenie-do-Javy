package homework41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListofListsMain {
    public static void main(String[] args) {
        //ArrayList<String> lista=new ArrayList<String>();
        ListOfCities miastaPolski=new ListOfCities();
        List<ListOfCities> listOfLists=new ArrayList<ListOfCities>();
        miastaPolski.add("Wro");
        miastaPolski.add("Wawa");
        listOfLists.add(miastaPolski);
        listOfLists.add(miastaPolski);

        miastaPolski.display();

        System.out.println(listOfLists.toString());

        for (int i = 0; i < listOfLists.size(); i++) {
                for(int j=0; j<miastaPolski.size(); j++)
                {
                    System.out.println(miastaPolski.toString());
            }
            System.out.println();
        }

    }
}
