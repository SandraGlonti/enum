package pl.kurs.homework2WithExceptions.exceptions;

public class NotEnoughHealthException extends Exception{
    public NotEnoughHealthException() {
    }

    public NotEnoughHealthException(String message) {
        super(message);
    }
}
