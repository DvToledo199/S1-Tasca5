package level1.ejercicio1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {

    public void listDirectory(String path) {

        File directory = new File(path);

        if (!directory.exists()) {
            System.out.println("The specified path does not exist.");
            return;
        }

        if (!directory.isDirectory()) {
            System.out.println("The specified path is not a directory.");
            return;
        }

        File[] files = directory.listFiles();

        if (files == null) {
            System.out.println("Unable to access directory content.");
            return;
        }

        if (files.length == 0) {
            System.out.println("The directory is empty.");
            return;
        }

        Arrays.sort(files);

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}