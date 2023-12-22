package Assignment04;

public class InvalidAmountException extends BankAccountException{

    public InvalidAmountException() {
        super("The amount can not be 0 or less than 0");
    }

    public InvalidAmountException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
