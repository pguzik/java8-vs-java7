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
            HouseWithoutOptional house = person.getHouseWithoutOptional();
            if (house != null) {
                CreditSupplierWithoutOptional creditSupplier = house.getCreditSupplierWithoutOptional();
                if (creditSupplier != null) {
                    String name = creditSupplier.getName();
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
        HouseWithoutOptional house = person.getHouseWithoutOptional();
        if (house == null) {
            return nullObjectValue;
        }
        CreditSupplierWithoutOptional creditSupplier = house.getCreditSupplierWithoutOptional();
        if (creditSupplier == null) {
            return nullObjectValue;
        }
        String name = creditSupplier.getName();
        if (name == null) {
            return nullObjectValue;
        }
        return name;
    }
}
