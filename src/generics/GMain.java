package generics;

import java.util.List;

public class GMain {
    public static void main(String[] args) {
        Pocket<String> stringPocket = new Pocket<>();
        stringPocket.setValue("Japety");
        System.out.println(stringPocket.getValue());

        Backpack<String, Integer, Float, Boolean> backpack = new Backpack<>();
        backpack.setVal1("Choinka");
        backpack.setVal2(30);
        backpack.setVal3(15.2f);
        backpack.setVal4(true);
        System.out.printf("W plecaku są: %s, %d, %.3f, %b", backpack.getVal1(), backpack.getVal2(),
                backpack.getVal3(), backpack.getVal4());

        Handbag<Integer> handbag = new Handbag<>();
        for(int i=12; i<100; i++)
            handbag.addValue(i);
        List<Integer> list = handbag.getValue();
        for (Integer value : list) {
            System.out.println(value + " ");
        }
        Backpack<Handbag<Pocket<String>>, Pocket<Integer>, Boolean, Float> bigBag = new Backpack<>();
        bigBag.setVal4(14.39f);
        bigBag.setVal3(false);

        Pocket<Integer> pocket = new Pocket<>();
        pocket.setValue(11);
        bigBag.setVal2(pocket);

        Pocket<String> pocket1 = new Pocket<>();
        pocket1.setValue("Drzewo");
        Handbag<Pocket<String>> handbag1 = new Handbag<>();
        handbag1.addValue(pocket1);
        bigBag.setVal1(handbag1);
        System.out.println();
    }
}
