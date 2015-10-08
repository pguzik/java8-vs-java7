package java8.patterns.strategy;

/**
 * @author Piotrek
 */
public class PLBankAccountValidator implements BankAccountValidationStrategy {
    @Override
    public boolean validate(String bankAccount) {
        return bankAccount.matches("\\d+");
    }
}
