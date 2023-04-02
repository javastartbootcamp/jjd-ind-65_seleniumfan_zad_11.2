package pl.javastart.task;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;
    private static final int MIN_AGE = 1;
    private static final int MIN_NUMBER_OF_SIGNS = 2;

    public Person(String firstName, String lastName, int age, String pesel) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        checkFirstName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        checkLastName(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    private void checkFirstName(String firstName) {
        if (Objects.isNull(firstName) || firstName.length() < MIN_NUMBER_OF_SIGNS) {
            throw new NameUndefinedException("Imię", MIN_NUMBER_OF_SIGNS);
        }
    }

    private void checkLastName(String lastName) {
        if (Objects.isNull(lastName) || lastName.length() < MIN_NUMBER_OF_SIGNS) {
            throw new NameUndefinedException("Nazwisko", MIN_NUMBER_OF_SIGNS);
        }
    }

    private void checkAge(int age) {
        if (age < MIN_AGE) {
            throw new IncorrectAgeException(MIN_AGE);
        }
    }
}
