package by.epam.lesson22.controller.command_impl;

import by.epam.lesson22.bean.User;
import by.epam.lesson22.controller.command.Command;
import by.epam.lesson22.controller.dto.Request;
import by.epam.lesson22.controller.dto.Response;
import by.epam.lesson22.logic.UsersLogic;

public class RegistrationCommand implements Command {

    UsersLogic usersLogic = UsersLogic.getInstance();
    @Override
    public Response execute(Request request) {
        Response response = null;
        usersLogic.registerOfNewUser();
        String commandName = request.getCommandName();
        return new Response(commandName);
    }
}
