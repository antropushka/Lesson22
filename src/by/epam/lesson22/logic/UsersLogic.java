package by.epam.lesson22.logic;

import by.epam.lesson22.dao.DAOException;
import by.epam.lesson22.middleware.*;
import by.epam.lesson22.validator.EmailValidator;
import by.epam.lesson22.validator.LoginValidator;
import by.epam.lesson22.validator.PasswordValidator;
import by.epam.lesson22.validator.PhoneNumValidator;
import by.epam.lesson22.bean.User;
import by.epam.lesson22.bean.UsersDateBase;
import by.epam.lesson22.dao.UsersRepository;
import by.epam.lesson22.view.ConsoleOutput;

public class UsersLogic {

    private final UsersDateBase usersDateBase = UsersRepository.getUsersDateBase();
    private Middleware middleware;

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

    public void register(User user) throws DAOException {
        Middleware middleware = Middleware.link(
                new LoginExistsMiddleware(usersDateBase),
                new EmailExistsMiddleware(usersDateBase),
                new PhoneNumExistsMiddleware(usersDateBase),
                new PasswordExistsMiddleware(usersDateBase));
        if (middleware.check(user)) {
            usersDateBase.addUsers(user);
            consoleOutput.successRegistrationMessage();
        }
    }

}
