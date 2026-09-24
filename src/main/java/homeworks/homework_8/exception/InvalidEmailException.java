package homeworks.homework_8.exception;

public class InvalidEmailException extends RuntimeException{
    public InvalidEmailException(String message){
        super(message);
    }
}
