package by.epam.lesson22.controller.dto;

import by.epam.lesson22.bean.User;
import by.epam.lesson22.bean.UsersDateBase;

public class Response {

    private String commandName;
    private UsersDateBase usersDateBase;
    private String noSuchCommandMessage;
    private User user;

    public Response(String commandName) {
        this.commandName = commandName;
    }

    public Response(String commandName, String noSuchCommandMessage) {
        this.commandName = commandName;
        this.noSuchCommandMessage = noSuchCommandMessage;
    }

    public Response(String commandName, User user) {
        this.commandName = commandName;
        this.user = user;
    }

    public UsersDateBase getUsersDateBase() {
        return usersDateBase;
    }

    public void setUsersDateBase(UsersDateBase usersDateBase) {
        this.usersDateBase = usersDateBase;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getNoSuchCommandMessage() {
        return noSuchCommandMessage;
    }

    public void setNoSuchCommandMessage(String noSuchCommandMessage) {
        this.noSuchCommandMessage = noSuchCommandMessage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
