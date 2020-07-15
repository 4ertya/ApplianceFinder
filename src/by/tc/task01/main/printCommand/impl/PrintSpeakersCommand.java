package by.tc.task01.main.printCommand.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.main.printCommand.Command;

public class PrintSpeakersCommand implements Command {
    @Override
    public void execute(Appliance appliance) {
        Speakers speakers = (Speakers) appliance;

        System.out.println(
                "Speakers: \n" +
                        "\tPOWER_CONSUMPTION: " + speakers.getPOWER_CONSUMPTION() + ";\n" +
                        "\tNUMBER_OF_SPEAKERS: " + speakers.getNUMBER_OF_SPEAKERS() + ";\n" +
                        "\tFREQUENCY_RANGE: " + speakers.getFREQUENCY_RANGE() + ";\n" +
                        "\tCORD_LENGTH: " + speakers.getCORD_LENGTH() + ";"
        );
    }
}
