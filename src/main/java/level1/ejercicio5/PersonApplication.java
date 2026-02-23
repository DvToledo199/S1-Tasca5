package level1.ejercicio5;

public class PersonApplication {
    public static void main(String[] args) {

        Person person = new Person("David", 30);
        PersonSerializer.serialize(person, "target/person.ser");

        Person loaded = PersonSerializer.deserialize("target/person.ser");

        if (loaded != null) {
            System.out.println(loaded);
        }

    }
}
