package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
//        Person person = new Person("Jan", null, 25, "1234567890");
//        System.out.println(person);

        try {
            Person person = new Person("Jan", "Kowalski", 25, "1234567890");
            System.out.println(person);
            person.setAge(-10);
            System.out.println(person);
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
