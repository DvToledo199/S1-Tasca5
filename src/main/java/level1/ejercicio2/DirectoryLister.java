package level1.ejercicio2;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

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
        listDirectoryRecursive(directory, 0);

    }
    private void listDirectoryRecursive(File file, int level) {

        for (int i = 0; i < level; i++){
            System.out.print("    ");
        }

        if (file.isDirectory()){
            System.out.print("(D) ");
        } else {
            System.out.print("(F) ");
        }

        Date lastModified = new Date(file.lastModified());

        System.out.println(file.getName() + " - " + lastModified);

        if (file.isDirectory()) {

            File[] children = file.listFiles();

            if (children != null) {

                Arrays.sort(children);

                for (File child : children) {
                    listDirectoryRecursive(child, level + 1);
                }
            }
        }
    }
}