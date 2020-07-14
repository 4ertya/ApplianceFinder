package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {
        switch (criteria.getGroupSearchName()) {
            case "Oven":
            case "Laptop":
            case "Refrigerator":
            case "Speakers":
            case "TabletPC":
            case "VacuumCleaner":
                break;
            default:
                return false;
        }

        return true;
    }

}

//you may add your own new classes