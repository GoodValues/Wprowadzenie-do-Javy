package zabawaNaStringach;

import java.util.Arrays;

public class HumanPupiPairMain {
    public static void main(String[] args) {
        String data="Alx, kot; Adxm, kunx; Filip, norkx";

        HumanPupiPair str1=new HumanPupiPair("alx", "kot"); // sobie stworzylem,

        //replaceChar(data, "x"); // też można użyć, ale jest to bardziej skomplikowana funkcja
        System.out.println(data=data.replace('x', 'a'));

        System.out.println(data=data.replace(" ", ""));
        System.out.println(data=data.toLowerCase());

        String unsplitedPairs[]=data.split(";");
        System.out.println(Arrays.toString(unsplitedPairs));
        HumanPupiPair[] pairsTable=new HumanPupiPair[unsplitedPairs.length];
        for (int i = 0 ; i < unsplitedPairs.length ; i++) {
            String[] currentPair=unsplitedPairs[i].split(",");
            pairsTable[i]=new HumanPupiPair(currentPair[0], currentPair[1]);
            System.out.println(pairsTable[i].getName()+ " ma " + pairsTable[i].getAnimal());
        }
//        HumanPupiPair tab[]=new HumanPupiPair[splitedArray.length];
//        for(int i=0; i<splitedArray.length; i++) tab[i]=splitedArray[i];

        String splitElements[]=null;

    }
}
