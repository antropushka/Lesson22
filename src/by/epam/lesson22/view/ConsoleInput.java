package by.epam.lesson22.view;

import by.epam.lesson22.bean.User;

import java.util.Scanner;

public class ConsoleInput {
    private static final ConsoleInput instance = new ConsoleInput();
    public static Scanner scanner = new Scanner(System.in);


    public ConsoleInput() {
    }

    public static ConsoleInput getInstance() {
        return instance;
    }
    public User  enterUsersDate() {
        User user = new User("", "", "", "");
        System.out.println("create a login");
        user.setLogin(scanner.nextLine());
        System.out.println("create a password");
        user.setPassword(scanner.nextLine());
        System.out.println("enter your email address");
        user.setEmail(scanner.nextLine());
        System.out.println("enter the phone number in the format XXX(XX)XXX-XX-XX");
        user.setTelephoneNum(scanner.nextLine());
        return user;
    }
}
