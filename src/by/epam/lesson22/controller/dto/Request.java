package by.epam.lesson22.controller.dto;

import by.epam.lesson22.bean.User;
import by.epam.lesson22.bean.UsersDateBase;

public class Request {
    private String commandName;
    private UsersDateBase usersDateBase;
    private String noSuchCommandMessage;
    private User user;

    public Request(String commandName) {
        this.commandName = commandName;
    }

    public Request(String commandName, String noSuchCommandMessage) {
        this.commandName = commandName;
        this.noSuchCommandMessage = noSuchCommandMessage;
    }

    public Request(String commandName, User user) {
        this.commandName = commandName;
        this.user = user;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public UsersDateBase getUsersDateBase() {
        return usersDateBase;
    }

    public void setUsersDateBase(UsersDateBase usersDateBase) {
        this.usersDateBase = usersDateBase;
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
