package Assignment04;

public class NotEnoughBalanceException extends BankAccountException{

    public NotEnoughBalanceException() {
        super("The amount is greater than the current balance.");
    }

    public NotEnoughBalanceException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
