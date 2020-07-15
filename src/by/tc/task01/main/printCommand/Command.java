package by.tc.task01.main.printCommand;

import by.tc.task01.entity.Appliance;

public interface Command {
    public void execute(Appliance appliance);
}
