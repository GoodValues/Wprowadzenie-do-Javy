package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ZabawaFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\adam.n\\Desktop\\Java-wprowadzenie\\text.txt");
        FileWriter writer = new FileWriter(file, true); // appends text to the file

        writer.write("Hello, World\n");
        writer.close();

    }
}
