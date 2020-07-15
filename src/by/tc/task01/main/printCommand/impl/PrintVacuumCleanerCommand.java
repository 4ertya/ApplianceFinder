package by.tc.task01.main.printCommand.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.main.printCommand.Command;

public class PrintVacuumCleanerCommand implements Command {
    @Override
    public void execute(Appliance appliance) {
        VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;

        System.out.println(
                "VacuumCleaner: \n" +
                        "\tPOWER_CONSUMPTION: " + vacuumCleaner.getPOWER_CONSUMPTION() + ";\n" +
                        "\tFILTER_TYPE: " + vacuumCleaner.getFILTER_TYPE() + ";\n" +
                        "\tBAG_TYPE: " + vacuumCleaner.getBAG_TYPE() + ";\n" +
                        "\tWAND_TYPE: " + vacuumCleaner.getWAND_TYPE() + ";\n" +
                        "\tMOTOR_SPEED_REGULATION: " + vacuumCleaner.getMOTOR_SPEED_REGULATION() + ";\n" +
                        "\tCLEANING_WIDTH: " + vacuumCleaner.getCLEANING_WIDTH() + ";"
        );
    }
}
