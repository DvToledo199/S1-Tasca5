package level1.ejercicio5;


import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class DirectoryApplication {

    public static void main(String[] args) {


        if (args.length == 0) {
            System.out.println("Please provide a directory path.");
            return;
        }

        String path = args[0];

        File file = new File(path);

        if (!file.exists()) {
            System.out.println("The specified path does not exist.");
            return;
        }
        if (file.isDirectory()) {
            DirectoryLister directoryLister = new DirectoryLister();
            String result = directoryLister.listDirectory(path);

            try {
                FileWriter writer = new FileWriter("target/output.txt");
                writer.write(result);
                writer.close();
            } catch (IOException e) {
                System.out.println("Error writing file.");
            }

        } else if (file.isFile()) {

            String content = TextFileReader.readFile(path);
            System.out.println(content);
        }


    }
}