package shoplist;

import java.util.ArrayList;
import java.util.List;

// NIEOBIEKTOWO
public class ShopListMain {
    public static void main(String[] args) {
        List<String> shopList=new ArrayList<>();
        shopList.add("Ziemniaki");
        shopList.add("Cukierki");
        shopList.add("Jabłka");
        shopList.add("Ziemniaki");
        for (String product : shopList) {
            System.out.println(product);
        }
    }
}
