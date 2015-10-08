package java8.optional;

import java.util.Optional;

/**
 * @author Piotrek
 */
public class House {

    private Optional<CreditSupplier> creditSupplier;

    public Optional<CreditSupplier> getCreditSupplier() {
        return creditSupplier;
    }
}
