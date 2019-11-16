package person;

public class StringParser {
    public static Person[] parse(String names) {
        String[] namesTable=names.split(",");
        Person[] people=new Person[namesTable.length];

        for(int i=0; i<namesTable.length; ++i) //++i moze byc, bo przy forze i tak inkrementuje w ostatniej kolejnosci
            people[i]=new Person (namesTable[i]); //uzupełniiamy sobie tablicę klasy Person

        return people;
    }
    public static Car[] parseCars (String carsBrands) {
        String[] brands=carsBrands.split(",");
        Car[] cars=new Car[brands.length];

        for (int i=0; i<brands.length; i++)
            cars[i]=new Car (brands[i]);
        return cars;
    }

    public static Bike[] parseBikes (String bikeBrands) {
        String[] brands=bikeBrands.split(",");
        Bike[] bikes=new Bike[brands.length];;

        for (int i=0; i<brands.length; i++)
            bikes[i]=new Bike (brands[i]);
        return bikes;
    }
}
