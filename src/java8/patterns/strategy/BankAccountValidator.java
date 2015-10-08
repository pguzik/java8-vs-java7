package java8.patterns.strategy;

/**
 * @author Piotrek
 */
public class BankAccountValidator {
    private final BankAccountValidationStrategy strategy;

    public BankAccountValidator(BankAccountValidationStrategy v){
        this.strategy = v;
    }

    public boolean validate(String bankAccount){
        return strategy.validate(bankAccount); }
}
