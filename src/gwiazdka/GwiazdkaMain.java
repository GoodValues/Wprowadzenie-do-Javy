package gwiazdka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GwiazdkaMain {
    public static void main(String[] args) {
        List<Character> gwiazda = new ArrayList<Character>();
        gwiazda.add('*');
        gwiazda.add('^');
        int ilosc = 5;
        String napis = "";
        for (int i = 0; i < ilosc; i++) {
            napis += gwiazda.toString();
        }
        System.out.println(napis.toString());
        System.out.println(napis.getClass());

        for (int i = 0; i < ilosc; i++) {
            for (int j = 0; j < ilosc; j++) System.out.print(gwiazda);
            System.out.println();
        }

        System.out.println("dodaj czy usun kolumnę: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice == "usun") {
            for (int i = 0; i < ilosc; i++) {
                for (int j = 0; j < ilosc; j++) System.out.println(gwiazda);
            }
        }
        if (choice == "dodaj") {
            for (int i = 0; i < ilosc; i++) {
                for (int j = 0; j < ilosc + 1; j++) System.out.println(gwiazda);
            }
        }
    }
}
