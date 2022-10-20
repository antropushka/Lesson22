package by.epam.lesson22.controller.command;

import by.epam.lesson22.controller.dto.Request;
import by.epam.lesson22.controller.dto.Response;

public interface Command {

    Response execute(Request request);
}
