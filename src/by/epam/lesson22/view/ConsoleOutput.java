package by.epam.lesson22.view;

import by.epam.lesson22.bean.User;

import java.util.Map;

public class ConsoleOutput {
    private static final ConsoleOutput instance = new ConsoleOutput();



    public ConsoleOutput() {
    }

    public static ConsoleOutput getInstance() {
        return instance;
    }

    public void printInfoAllUsers (Map<String, User> users) {
        System.out.println("--------------------------------------------------------\n"
                          + "|   login   |   password   | email | telephone number| \n"
                + "--------------------------------------------------------");
        for (int i = 0; i < users.size(); i++) {
            System.out.printf("|%-10s|%-10s|%-15s|%-10s|\n",
                    users.get(i).getLogin(),
                    users.get(i).getPassword(),
                    users.get(i).getEmail(),
                    users.get(i).getTelephoneNum());
        }
        System.out.println("-----------------------\n");
    }

    public void printInfoAboutUser (User user) {
        System.out.print(user);
    }

    public void exitMessage() {
        System.out.println("GoodBuy!");
    }
    public void errorMessage() {
        System.out.println("Such command does not exist.");
    }
    public void successRegistrationMessage() {
        System.out.println("registration completed successfully");
    }

    public void failedRegistrationMessage() {
        System.out.println(" registration could not be completed successfully try again");
    }


}
