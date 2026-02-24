package level2.ejercicio1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigLoader {

    private Properties properties;

    public ConfigLoader() {
        properties = new Properties();
    }

    public void load() {
        try {
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);
            file.close();

        } catch (IOException e) {
            System.out.println("Error loading configuration file.");
        }
    }

    public String getInputDirectory() {
        return properties.getProperty("input.directory");
    }

    public String getOutputFile() {
        return properties.getProperty("output.file");
    }

}
