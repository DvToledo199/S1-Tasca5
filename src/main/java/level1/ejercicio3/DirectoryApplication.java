package level1.ejercicio3;

import java.io.FileWriter;
import java.io.IOException;


public class DirectoryApplication {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a directory path.");
            return;
        }

        String path = args[0];


        DirectoryLister directoryLister = new DirectoryLister();
        String result = directoryLister.listDirectory(path);

        try {
            FileWriter writer = new FileWriter("target/output.txt");
            writer.write(result);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

    }
}