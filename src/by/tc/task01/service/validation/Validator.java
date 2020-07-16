package by.tc.task01.service.validation;

import by.tc.task01.dao.CommandName;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.sql.SQLOutput;
import java.util.Map;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {

        switch (criteria.getGroupSearchName().toUpperCase()) {
            case "OVEN":
            case "LAPTOP":
            case "REFRIGERATOR":
            case "SPEAKERS":
            case "TABLETPC":
            case "VACUUMCLEANER":
                break;
            default:
                System.out.println("Incorrect appliance name");
                return false;
        }

        for (Map.Entry<String, Object> param : criteria.getCriteria().entrySet()) {

            if (SearchCriteria.StringParams.contains(param.getKey())) {
                if (!(param.getValue() instanceof String)) {
                    System.out.println(param.getKey() + "  should be a String");
                    return false;
                }
            }

            if (SearchCriteria.NumberParams.contains(param.getKey())){
                if (!(param.getValue() instanceof Number)) {
                    System.out.println(param.getKey() + "  should be a number");
                    return false;
                }
            } else {
                System.out.println(param.getKey() + " - Incorrect criteria name");
            }
        }
        return true;
    }

}

//you may add your own new classes