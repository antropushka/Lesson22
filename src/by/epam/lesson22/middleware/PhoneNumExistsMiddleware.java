package by.epam.lesson22.middleware;

import by.epam.lesson22.bean.User;
import by.epam.lesson22.bean.UsersDateBase;
import by.epam.lesson22.dao.UsersRepository;
import by.epam.lesson22.validator.PhoneNumValidator;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumExistsMiddleware extends Middleware {
    private UsersDateBase usersDateBase = UsersRepository.getUsersDateBase();
    private PhoneNumValidator phoneNumValidator = new PhoneNumValidator();

    public PhoneNumExistsMiddleware(UsersDateBase usersDateBase) {
        this.usersDateBase = usersDateBase;
    }

    @Override
    public boolean check(User user) {
        List<User> userList = new ArrayList<>(usersDateBase.getUsers().values());
        if (phoneNumValidator.validate(user.getTelephoneNum())) {
            for (int i = 0; i < userList.size(); i++) {
                if (!userList.get(i).getEmail().equals(user.getTelephoneNum())) {
                    return true;
                } else if (userList.get(i).getEmail().equals(user.getEmail())) {
                    System.out.println("This telNum is already exist!");
                    return false;
                }
            }
        }
        return checkNext(user);
    }
}
