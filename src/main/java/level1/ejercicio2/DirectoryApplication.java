package level1.ejercicio2;


public class DirectoryApplication {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a directory path.");
            return;
        }

        String path = args[0];

        DirectoryLister directoryLister = new DirectoryLister();
        directoryLister.listDirectory(path);
    }
}