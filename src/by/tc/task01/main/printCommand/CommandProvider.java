package by.tc.task01.main.printCommand;

import by.tc.task01.dao.CommandName;
import by.tc.task01.main.printCommand.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(CommandName.OVEN, new PrintOvenCommand());
        commands.put(CommandName.LAPTOP, new PrintLaptopCommand());
        commands.put(CommandName.REFRIGERATOR, new PrintRefrigeratorCommand());
        commands.put(CommandName.VACUUMCLEANER, new PrintVacuumCleanerCommand());
        commands.put(CommandName.TABLETPC, new PrintTabletPCCommand());
        commands.put(CommandName.SPEAKERS, new PrintSpeakersCommand());
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
