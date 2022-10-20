package by.epam.lesson22.main;

import by.epam.lesson22.bean.UsersDateBase;
import by.epam.lesson22.view.ConsoleOutput;

public class Main {

    public static void main (String[] args) {

        UsersDateBase usersDateBase = UsersDatePutter.createUsersDateBase();
        ConsoleOutput consoleOutput = ConsoleOutput.getInstance();
        UsersMenu usersMenu = new UsersMenu();
        usersMenu.startProgram();
        consoleOutput.printInfoAllUsers(usersDateBase.getUsers());



    }
}
