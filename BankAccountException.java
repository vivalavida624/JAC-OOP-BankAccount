package Assignment04;

public class BankAccountException extends Exception{

    public BankAccountException() {
        super("Exception during the bank account operation");

    }
    public BankAccountException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
