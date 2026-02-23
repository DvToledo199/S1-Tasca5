package level1.ejercicio5;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TextFileReader {
    public static String readFile(String path){

        StringBuilder builder = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String line;

            while ((line = reader.readLine()) != null){
                builder.append(line).append("\n");
            }

            reader.close();
        } catch (IOException e){
            System.out.println("Error reading file.");
        }
        return builder.toString();


    }
}
