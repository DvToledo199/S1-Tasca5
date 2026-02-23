package level1.ejercicio5;

import java.io.*;

public class PersonSerializer {

    public static void serialize(Person person, String path) {

        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(person);

            objectOut.close();
            fileOut.close();

        }catch (IOException e){
            System.out.println("Error during serialization.");
        }
    }

    public static Person deserialize(String path){

        try {
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Person person = (Person) objectIn.readObject();

            objectIn.close();
            fileIn.close();

            return person;

        } catch (IOException | ClassNotFoundException e){
            System.out.println("Error during deserialization.");
            return null;
        }
    }
}
