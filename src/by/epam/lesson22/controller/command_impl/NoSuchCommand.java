package by.epam.lesson22.controller.command_impl;

import by.epam.lesson22.controller.command.Command;
import by.epam.lesson22.controller.dto.Request;
import by.epam.lesson22.controller.dto.Response;

public class NoSuchCommand implements Command {
    @Override
    public Response execute(Request request) {
        return null;
    }
}
