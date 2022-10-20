package by.epam.lesson22.controller.command;

import by.epam.lesson22.controller.command_impl.LogInCommand;
import by.epam.lesson22.controller.command_impl.NoSuchCommand;
import by.epam.lesson22.controller.command_impl.RegistrationCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private final Map<CommandName, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(CommandName.LOG_IN, new LogInCommand());
        commands.put(CommandName.REGISTRATION, new RegistrationCommand());
        commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
    }

    public Command getCommand (String command) {
        CommandName commandName;
        Command command1;

        try {
            commandName = CommandName.valueOf(command);
            command1 = commands.get(commandName);
            if (command1 == null) {
                command1 = commands.get(CommandName.NO_SUCH_COMMAND);
            }
        } catch (Exception e) {
            command1 = commands.get(CommandName.NO_SUCH_COMMAND);
        }
        return command1;
    }
}
