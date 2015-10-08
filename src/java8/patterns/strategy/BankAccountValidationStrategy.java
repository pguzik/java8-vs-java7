package java8.patterns.strategy;

/**
 * @author Piotrek
 */
public interface BankAccountValidationStrategy {
    public boolean validate(String bankAccount);
}
