package patterns.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        BankAccountValidator v1 = new BankAccountValidator(new PLBankAccountValidator());
        System.out.println(v1.validate("aaaa"));
        BankAccountValidator v2 = new BankAccountValidator(new UKBankAccountValidator());
        System.out.println(v2.validate("bbbb"));

        BankAccountValidator v3 = new BankAccountValidator((String s) -> s.matches("\\d+"));
        System.out.println(v3.validate("aaaa"));
        BankAccountValidator v4 = new BankAccountValidator((String s) -> s.matches("[a-z]+"));
        System.out.println(v4.validate("bbbb"));
    }
}
