package by.epam.lesson22.dao;

import by.epam.lesson22.bean.UsersDateBase;
import by.epam.lesson22.main.UsersDatePutter;

public class UsersRepository {

    private static UsersDateBase usersDateBase = UsersDatePutter.createUsersDateBase();

    public static UsersDateBase getUsersDateBase() {
        return usersDateBase;
    }

    public static void setUsersDateBase(UsersDateBase usersDateBase) {
        UsersRepository.usersDateBase = usersDateBase;
    }
}
