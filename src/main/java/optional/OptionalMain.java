package optional;

import java.util.Optional;

/**
 * @author Piotrek
 */
public class OptionalMain {

    public String getHouseCreditSupplierName(Optional<Person> person) {
        return person.flatMap(Person::getHouse)
                     .flatMap(House::getCreditSupplier)
                     .map(CreditSupplier::getName)
                     .orElse("Unknown");
    }

    public String getHouseCreditSupplierNameVeryBadly(PersonWithoutOptional person) {
        if (person != null) {
            HouseWithoutOptional car = person.getHouseWithoutOptional();
            if (car != null) {
                CreditSupplierWithoutOptional insurance = car.getCreditSupplierWithoutOptional();
                if (insurance != null) {
                    String name = insurance.getName();
                    //Defensive One !!!
                    if (name != null) {
                        return name;
                    }
                }
            }
        }
        return "Unknown";
    }

    public String getHouseCreditSupplierNameBadly(PersonWithoutOptional person) {
        final String nullObjectValue = "Unknown";
        if (person == null) {
            return nullObjectValue;
        }
        HouseWithoutOptional car = person.getHouseWithoutOptional();
        if (car == null) {
            return nullObjectValue;
        }
        CreditSupplierWithoutOptional insurance = car.getCreditSupplierWithoutOptional();
        if (insurance == null) {
            return nullObjectValue;
        }
        String name = insurance.getName();
        if (name == null) {
            return nullObjectValue;
        }
        return name;
    }
}
