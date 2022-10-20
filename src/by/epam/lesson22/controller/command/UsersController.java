package by.epam.lesson22.controller.command;

import by.epam.lesson22.controller.dto.Request;
import by.epam.lesson22.controller.dto.Response;

public class UsersController {

    private final CommandProvider commandProvider = new CommandProvider();

    public Response makeResponse (Request userRequest) {

        String commandName = userRequest.getCommandName();
        Command command = commandProvider.getCommand(commandName);
        Response response = command.execute(userRequest);

        return response;
    }
}
