package shoplist;

public class ShopListMainObj {
    public static void main(String[] args) {

        ShopList shopList = new ShopList();

        shopList.addProduct("Ziemniaki");
        shopList.addProduct("Cukierki");
        shopList.addProduct("Jagody");
        shopList.addProduct("Jabłka");
        shopList.addProduct("Ziemniaki");
        shopList.display();
        shopList.remove("Cukierki");
        shopList.display();
        System.out.println();
        shopList.displayProductStartsBy('J');
    }
}
