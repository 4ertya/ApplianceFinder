package by.tc.task01.main.printCommand.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.main.printCommand.Command;

public class PrintRefrigeratorCommand implements Command {

    @Override
    public void execute(Appliance appliance) {
        Refrigerator refrigerator = (Refrigerator) appliance;
        System.out.println(
                "Refrigerator: \n" +
                        "\tPOWER_CONSUMPTION: " + refrigerator.getPOWER_CONSUMPTION() + ";\n" +
                        "\tWEIGHT: " + refrigerator.getWEIGHT() + ";\n" +
                        "\tFREEZER_CAPACITY: " + refrigerator.getFREEZER_CAPACITY() + ";\n" +
                        "\tOVERALL_CAPACITY: " + refrigerator.getOVERALL_CAPACITY() + ";\n" +
                        "\tHEIGHT: " + refrigerator.getHEIGHT() + ";\n" +
                        "\tWIDTH: " + refrigerator.getWIDTH() + ";"
        );
    }
}
