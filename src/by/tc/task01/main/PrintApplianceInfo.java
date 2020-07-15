package by.tc.task01.main;


import by.tc.task01.entity.Appliance;
import by.tc.task01.main.printCommand.Command;
import by.tc.task01.main.printCommand.CommandProvider;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Appliance> appliances) {
        CommandProvider commandProvider = new CommandProvider();

        if (appliances != null) {
            for (Appliance appliance : appliances) {
                Command currentCommand = commandProvider.takeCommand(appliance.getClass().getSimpleName());
                currentCommand.execute(appliance);
            }
        }
    }
}
