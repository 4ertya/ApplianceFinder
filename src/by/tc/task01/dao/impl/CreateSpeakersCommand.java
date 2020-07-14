package by.tc.task01.dao.impl;

import by.tc.task01.dao.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

import java.util.Map;

public class CreateSpeakersCommand implements Command {
    @Override
    public Appliance execute(Map<String, String> params) {
        Speakers speakers = new Speakers.Builder()
                .numberOfSpeakers(Integer.parseInt(params.get("NUMBER_OF_SPEAKERS")))
                .powerConsumption(Integer.parseInt(params.get("POWER_CONSUMPTION")))
                .frequencyRange(Integer.parseInt(params.get("FREQUENCY_RANGE")))
                .cordLength(Integer.parseInt(params.get("CORD_LENGTH")))
                .build();

        return speakers;
    }
}
