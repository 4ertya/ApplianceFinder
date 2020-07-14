package by.tc.task01.dao.impl;

import by.tc.task01.dao.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

import java.util.Map;

public class CreateVacuumCleanerCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> params) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner.Builder()
                .bagType(params.get("BAG_TYPE"))
                .cleaningWidth(Integer.parseInt(params.get("CLEANING_WIDTH")))
                .filterType(params.get("FILTER_TYPE"))
                .motorSpeedRegulation(Integer.parseInt(params.get("MOTOR_SPEED_REGULATION")))
                .powerConsumption(Integer.parseInt(params.get("POWER_CONSUMPTION")))
                .wandType(params.get("WAND_TYPE"))
                .build();

        return vacuumCleaner;
    }
}
