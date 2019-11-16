package shoplist;

import java.util.ArrayList;
import java.util.List;

public class ShopList {
    private List<String> list;

    public ShopList() {
        list=new ArrayList<>();
    }

    public void addProduct(String product) {
        for (String currentProduct : list) {
            if(currentProduct.equals(product)) {
                System.out.println("Product " + product + " is already added to the list");
                return;
            }
        }
        list.add(product);
    }

    public void display() {
        for (String currentProduct : list) {
            System.out.println(currentProduct);
        }
    }

    public void remove(String product) {
        if(list.remove(product)) {
            System.out.println(product + " removed");
            return;
        }
        System.out.println(product + " is not on the list");
    }

    public void displayProductStartsBy(char beginLetter) {
        String letter = String.valueOf(beginLetter);
        letter = letter.toLowerCase();
        for (String product : list) {
            if(product.toLowerCase().charAt(0) == letter.charAt(0))
                System.out.println(product);
        }
    }
}
