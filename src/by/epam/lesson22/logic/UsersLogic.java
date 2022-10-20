package by.epam.lesson22.logic;

import by.epam.lesson22.validator.EmailValidator;
import by.epam.lesson22.validator.LoginValidator;
import by.epam.lesson22.validator.PasswordValidator;
import by.epam.lesson22.validator.PhoneNumValidator;
import by.epam.lesson22.bean.User;
import by.epam.lesson22.bean.UsersDateBase;
import by.epam.lesson22.dao.UsersRepository;
import by.epam.lesson22.view.ConsoleOutput;

import java.util.Scanner;

public class UsersLogic {

    private final UsersDateBase usersDateBase = UsersRepository.getUsersDateBase();
    Scanner scanner = new Scanner(System.in);

    private static final UsersLogic instance = new UsersLogic();
    ConsoleOutput consoleOutput = ConsoleOutput.getInstance();

    private EmailValidator emailValidator = new EmailValidator();
    private PhoneNumValidator phoneNumValidator = new PhoneNumValidator();
    private PasswordValidator passwordValidator = new PasswordValidator();
    private LoginValidator loginValidator = new LoginValidator();

    public UsersLogic() {
    }

    public static UsersLogic getInstance() {
        return instance;
    }

    public void registerOfNewUser() {
        User user = new User("", "", "", "");
        System.out.println("create a login");
        user.setLogin(scanner.nextLine());
        System.out.println("create a password");
        user.setPassword(scanner.nextLine());
        System.out.println("enter your email address");
        user.setEmail(scanner.nextLine());
        System.out.println("enter the phone number in the format XXX(XX)XXX-XX-XX");
        user.setTelephoneNum(scanner.nextLine());
        // дополнить, если заданный догин уже занят
        if (loginValidator.validate(user.getLogin())
                && emailValidator.validate(user.getEmail())
                && phoneNumValidator.validate(user.getTelephoneNum())
                && passwordValidator.validate(user.getPassword())) {
            UsersRepository.getUsersDateBase().addUsers(user);
            consoleOutput.successRegistrationMessage();
            consoleOutput.printInfoAboutUser(user);
        } else {
                consoleOutput.failedRegistrationMessage();
        }
    }
}
