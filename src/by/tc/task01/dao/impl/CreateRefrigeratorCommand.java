package by.tc.task01.dao.impl;

import by.tc.task01.dao.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

import java.util.Map;

public class CreateRefrigeratorCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> params) {
        Refrigerator refrigerator = new Refrigerator.Builder()
                .freezerCapacity(Integer.parseInt(params.get("FREEZER_CAPACITY")))
                .overallCapacity(Integer.parseInt(params.get("OVERALL_CAPACITY")))
                .powerConsumption(Integer.parseInt(params.get("POWER_CONSUMPTION")))
                .weight(Integer.parseInt(params.get("WEIGHT")))
                .height(Integer.parseInt(params.get("HEIGHT")))
                .width(Integer.parseInt(params.get("WIDTH")))
                .build();

        return refrigerator;
    }
}
