package pl.kurs.homework2WithExceptions.exceptions;

public class WizardIsNullException extends Exception{
    public WizardIsNullException() {
    }

    public WizardIsNullException(String message) {
        super(message);
    }
}
