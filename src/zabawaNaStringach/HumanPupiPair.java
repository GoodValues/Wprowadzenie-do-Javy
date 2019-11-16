package zabawaNaStringach;

public class HumanPupiPair {
    private String name;
    private String animal;

    public HumanPupiPair(String name, String animal) {
        this.name=name;
        this.animal=animal;
    }

    public String getName() {
        return name;
    }

    public String getAnimal() {
        return animal;
    }

    public static void replaceChar(String str,String target) {
        String result = str.replaceAll(target, "a");
        System.out.println(result);
    }




}
