package level1.ejercicio1;

public class DirectoryLister {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a directory path.");
            return;
        }

        String path = args[0];

        DirectoryService service = new DirectoryService();
        service.listDirectory(path);
    }
}