package pl.javastart.task;

public class NameUndefinedException extends RuntimeException {
    public NameUndefinedException(String fieldName, int minNumberOfSign) {
        super(fieldName + " nie może być nullem lub mieć mniej niż " + minNumberOfSign + " znaki");
    }
}
