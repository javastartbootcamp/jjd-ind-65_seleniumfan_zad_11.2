package pl.javastart.task;

public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException(int minAge) {
        super("Podałeś wiek mniejszy od " + minAge);
    }
}
