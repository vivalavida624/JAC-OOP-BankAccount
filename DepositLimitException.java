package Assignment04;

public class DepositLimitException extends BankAccountException{
    public DepositLimitException() {
        super("The amount is great than the deposit limit.");
    }

    public DepositLimitException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
