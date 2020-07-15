package by.tc.task01.main.printCommand.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.main.printCommand.Command;

public class PrintOvenCommand implements Command {
    @Override
    public void execute(Appliance appliance) {
        Oven oven = (Oven) appliance;
        System.out.println(
                "Oven: \n" +
                        "\tPOWER_CONSUMPTION: " + oven.getPOWER_CONSUMPTION() + ";\n" +
                        "\tWEIGHT: " + oven.getWEIGHT() + ";\n" +
                        "\tCAPACITY: " + oven.getCAPACITY() + ";\n" +
                        "\tDEPTH: " + oven.getDEPTH() + ";\n" +
                        "\tHEIGHT: " + oven.getHEIGHT() + ";\n" +
                        "\tWIDTH: " + oven.getWIDTH() + ";"
        );
    }
}
