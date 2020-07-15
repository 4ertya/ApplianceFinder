package by.tc.task01.main.printCommand.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.main.printCommand.Command;

public class PrintTabletPCCommand implements Command {
    @Override
    public void execute(Appliance appliance) {
        TabletPC tabletPC = (TabletPC) appliance;

        System.out.println(
                "TabletPC: \n" +
                        "\tBATTERY_CAPACITY: " + tabletPC.getBATTERY_CAPACITY() + ";\n" +
                        "\tFLASH_MEMORY_CAPACITY: " + tabletPC.getFLASH_MEMORY_CAPACITY() + ";\n" +
                        "\tMEMORY_ROM: " + tabletPC.getMEMORY_ROM() + ";\n" +
                        "\tCOLOR: " + tabletPC.getCOLOR() + ";\n" +
                        "\tDISPLAY_INCHES: " + tabletPC.getDISPLAY_INCHES() + ";"
        );
    }
}
