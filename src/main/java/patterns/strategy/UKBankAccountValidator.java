package patterns.strategy;

/**
 * @author Piotrek
 */
public class UKBankAccountValidator implements BankAccountValidationStrategy {
    @Override
    public boolean validate(String bankAccount) {
        return bankAccount.matches("[a-z]+");
    }
}
