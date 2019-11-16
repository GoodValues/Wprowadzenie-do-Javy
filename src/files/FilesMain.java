package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FilesMain {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName="plik.txt";
        File file=new File(fileName);
        Scanner scanner=new Scanner(file);
        String fileData="";
        while(scanner.hasNextLine()) // skanuje dopóki ma następną linijkę tekstu w notatniku
            fileData+=scanner.nextLine(); //dodaje do stringa kolejną linijkę
        System.out.println(fileData);
        fileData=fileData.replace(",", ""); // bawimy się i wyrzucamy przecinki, kropki etc...
        fileData=fileData.replace(".", "");
        fileData=fileData.toLowerCase();
        System.out.println(fileData);

        String[] splited=fileData.split(" "); // tworzymy nową tablicę typu String i przypisujemy do danej pozycji słowo z tekstu
        int counter=0;
        String word="lorem";

        for (String currentWord : splited) {
            if(currentWord.equals(word))
                counter++;
        }
        System.out.println("Znaleziono " + counter + " wystąpień słowa " + word );

        // i/o
        PrintWriter printWriter=new PrintWriter("printWriter.txt"); // tworzymy nowy notatnik
        printWriter.println(fileData); // zapisujemy w nim dane
        printWriter.close();

        // new i/o
        try {
            Files.write(Paths.get("newIO.txt"), fileData.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace(); //wyświetli nam metody , które były tutaj wykonywane po kolei i zakończy na tej, gdzie się wykrzaczył
        }

    }
}
