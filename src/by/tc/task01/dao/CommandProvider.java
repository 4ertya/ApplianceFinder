package by.tc.task01.dao;

import by.tc.task01.dao.impl.*;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(CommandName.OVEN, new CreateOvenCommand());
        commands.put(CommandName.LAPTOP, new CreateLaptopCommand());
        commands.put(CommandName.REFRIGERATOR, new CreateRefrigeratorCommand());
        commands.put(CommandName.VACUUMCLEANER, new CreateVacuumCleanerCommand());
        commands.put(CommandName.TABLETPC, new CreateTabletPCCommand());
        commands.put(CommandName.SPEAKERS, new CreateSpeakersCommand());

    }

    public Command takeCommand(String command) {
        CommandName commandName;
        Command value;
        try {
            commandName = CommandName.valueOf(command.toUpperCase());
            value = commands.get(commandName);
        } catch (IllegalArgumentException e) {
            return null;
        }
        return value;
    }

}
