package by.tc.task01.main.printCommand.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.main.printCommand.Command;

public class PrintLaptopCommand implements Command {
    @Override
    public void execute(Appliance appliance) {
        Laptop laptop = (Laptop) appliance;

        System.out.println(
                "Laptop: \n" +
                        "\tBATTERY_CAPACITY: " + laptop.getBATTERY_CAPACITY() + ";\n" +
                        "\tOS: " + laptop.getOS() + ";\n" +
                        "\tMEMORY_ROM: " + laptop.getMEMORY_ROM() + ";\n" +
                        "\tSYSTEM_MEMORY: " + laptop.getSYSTEM_MEMORY() + ";\n" +
                        "\tCPU: " + laptop.getCPU() + ";\n" +
                        "\tDISPLAY_INCHES: " + laptop.getDISPLAY_INCHES() + ";"
        );
    }
}
