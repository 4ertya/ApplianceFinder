package by.tc.task01.dao.impl;
import by.tc.task01.dao.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

import java.util.Map;

public class CreateOvenCommand implements Command {
    @Override
    public Appliance execute(Map<String,String> params) {
        Oven oven = new Oven.Builder()
                .powerConsumption(Integer.parseInt(params.get("POWER_CONSUMPTION")))
                .capacity(Integer.parseInt(params.get("CAPACITY")))
                .depth(Integer.parseInt(params.get("DEPTH")))
                .height(Double.parseDouble(params.get("HEIGHT")))
                .weight(Integer.parseInt(params.get("WEIGHT")))
                .width(Double.parseDouble(params.get("WIDTH")))
                .build();
        return oven;
    }
}
