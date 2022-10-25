package by.epam.lesson22.middleware;

import by.epam.lesson22.bean.User;
import by.epam.lesson22.bean.UsersDateBase;
import by.epam.lesson22.dao.UsersRepository;
import by.epam.lesson22.validator.PasswordValidator;


public class PasswordExistsMiddleware extends Middleware{

    private UsersDateBase usersDateBase = UsersRepository.getUsersDateBase();
    private PasswordValidator passwordValidator = new PasswordValidator();

    public PasswordExistsMiddleware(UsersDateBase usersDateBase) {
        this.usersDateBase = usersDateBase;
    }

    @Override
    public boolean check(User user) {
        if (passwordValidator.validate(user.getPassword())) {
            return true;
        }
        return checkNext(user);
    }
}
