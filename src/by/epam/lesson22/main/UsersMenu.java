package by.epam.lesson22.main;

import by.epam.lesson22.validator.EmailValidator;
import by.epam.lesson22.controller.command.CommandName;
import by.epam.lesson22.controller.command.UsersController;
import by.epam.lesson22.controller.dto.Request;
import by.epam.lesson22.controller.dto.Response;
import by.epam.lesson22.dao.UsersRepository;
import by.epam.lesson22.view.ConsoleOutput;

import java.util.Scanner;

public class UsersMenu {

    Scanner scanner = new Scanner(System.in);
    UsersController usersController = new UsersController();
    EmailValidator emailValidator = new EmailValidator();
    ConsoleOutput consoleOutput = ConsoleOutput.getInstance();


    public void startProgram() {
        while (true) {

            System.out.println("Please, make your choice. Click: \n" +
                    "1 : to register; \n" +
                    "2 : to log in; \n" +
                    "0 : exit the program.");

            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.print("The option you entered is not in the menu. Please make your choice again!");
            }
            int userChoice = scanner.nextInt();

            switch (userChoice) {

            case 1:
                Request requestRegistration = new Request(CommandName.REGISTRATION.name());
                Response responseRegistration = usersController.makeResponse(requestRegistration);
                System.out.println(UsersRepository.getUsersDateBase().getUsers());
                break;

            case 2:
                Request requestLogIn = new Request(CommandName.LOG_IN.name());
                Response responseLogIn = usersController.makeResponse(requestLogIn);
                //...код-код
                break;

            case 0:
                consoleOutput.exitMessage();
                return;

            default:
                Request noSuchRequest = new Request(CommandName.NO_SUCH_COMMAND.name());
                Response noSuchResponse = usersController.makeResponse(noSuchRequest);
                consoleOutput.errorMessage();
            }

        }
    }
}

