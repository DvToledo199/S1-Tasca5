package level2.ejercicio1;


import java.io.FileWriter;
import java.io.IOException;


public class DirectoryApplication {

    public static void main(String[] args) {

        ConfigLoader config = new ConfigLoader();
        config.load();

        String inputDirectory = config.getInputDirectory();
        String outputFile = config.getOutputFile();


        DirectoryLister directoryLister = new DirectoryLister();
        String result = directoryLister.listDirectory(inputDirectory);

        try {
            FileWriter writer = new FileWriter(outputFile);
            writer.write(result);
            writer.close();

            System.out.println("File generated successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

    }
}