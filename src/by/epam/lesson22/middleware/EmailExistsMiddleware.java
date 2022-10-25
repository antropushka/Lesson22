package by.epam.lesson22.middleware;

import by.epam.lesson22.bean.User;
import by.epam.lesson22.bean.UsersDateBase;
import by.epam.lesson22.dao.UsersRepository;
import by.epam.lesson22.validator.EmailValidator;

import java.util.ArrayList;
import java.util.List;

public class EmailExistsMiddleware extends Middleware{
    private UsersDateBase usersDateBase;
    private List<User> usersList = new ArrayList<>(usersDateBase.getUsers().values());
    private EmailValidator emailValidator = new EmailValidator();

    public EmailExistsMiddleware(UsersDateBase usersDateBase) {
        this.usersDateBase = usersDateBase;
    }

//    @Override
//    public boolean check(User user) {
//        if (loginValidator.validate(user.getLogin())) {
//            if (usersDateBase.getUsers().containsKey(user.getLogin())) {
//                return false;
//            } else if (!usersDateBase.getUsers().containsKey(user.getLogin())) {
//                System.out.println("This login is not exist!");
//                return true;
//            }
//        }
//        return checkNext(user);
//    }

    @Override
    public boolean check(User user) {
        List<User> userList = new ArrayList<>(usersDateBase.getUsers().values());
        if (emailValidator.validate(user.getEmail())) {
            for (int i = 0; i < userList.size(); i++) {
                if (!userList.get(i).getEmail().equals(user.getEmail())) {
                    return true;
                } else if (userList.get(i).getEmail().equals(user.getEmail())) {
                    System.out.println("This email is already exist!");
                    return false;
                }
            }
        }
        return checkNext(user);
    }

//            @Override
//            public boolean check(User user) {
//                if (loginValidator.validate(user.getLogin())) {
//                    if (usersDateBase.getUsers().containsKey(user.getLogin())) {
//                        if (!usersLogic.isCorrectPassword(user.getLogin(), user.getPassword())) {
//                            System.out.println("Wrong password!");
//                            return false;
//                        } else if (usersLogic.isCorrectPassword(user.getLogin(), user.getPassword())) {
//                            System.out.println("Good password!");
//                            return true;
//                        }
//                    } else if (!usersDateBase.getUsers().containsKey(user.getLogin())) {
//                        System.out.println("This login is not exist!");
//                        return true;
//                    }
//                }
//                return checkNext(user);
//            }
//        return checkNext(user);
//    }

}
