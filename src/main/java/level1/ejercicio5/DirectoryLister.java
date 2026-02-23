package level1.ejercicio5;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class DirectoryLister {

    public String listDirectory(String path) {

        File directory = new File(path);

        if (!directory.exists()) {
            System.out.println("The specified path does not exist.");
            return "";
        }

        if (!directory.isDirectory()) {
            System.out.println("The specified path is not a directory.");
            return "";
        }

        File[] files = directory.listFiles();

        if (files == null) {
            System.out.println("Unable to access directory content.");
            return "";
        }

        if (files.length == 0) {
            System.out.println("The directory is empty.");
            return "";
        }
        StringBuilder builder = new StringBuilder();

        listDirectoryRecursive(directory, 0, builder);

        return builder.toString();

    }

    private void listDirectoryRecursive(File file, int level, StringBuilder builder) {

        for (int i = 0; i < level; i++) {
            builder.append("    ");
        }

        if (file.isDirectory()) {
            builder.append("(D) ");
        } else {
            builder.append("(F) ");
        }

        Date lastModified = new Date(file.lastModified());

        builder.append(file.getName())
                .append(" - ")
                .append(lastModified)
                .append("\n");

        if (file.isDirectory()) {

            File[] children = file.listFiles();

            if (children != null) {

                Arrays.sort(children);

                for (File child : children) {
                    listDirectoryRecursive(child, level + 1, builder);
                }
            }
        }
    }
}