package by.epam.lesson22.middleware;

import by.epam.lesson22.bean.User;
import by.epam.lesson22.bean.UsersDateBase;
import by.epam.lesson22.logic.UsersLogic;
import by.epam.lesson22.validator.LoginValidator;

public class LoginExistsMiddleware extends Middleware {

    private UsersDateBase usersDateBase;
    private UsersLogic usersLogic = UsersLogic.getInstance();
    LoginValidator loginValidator = new LoginValidator();

    public LoginExistsMiddleware(UsersDateBase usersDateBase) {
        this.usersDateBase = usersDateBase;
    }



    @Override
    public boolean check(User user) {
        if (loginValidator.validate(user.getLogin())) {
            if (!usersDateBase.getUsers().containsKey(user.getLogin())) {
                return true;
            } else if (usersDateBase.getUsers().containsKey(user.getLogin())) {
                System.out.println("This login is already exist!");
                return false;
            }
        }
        return checkNext(user);
    }



}
