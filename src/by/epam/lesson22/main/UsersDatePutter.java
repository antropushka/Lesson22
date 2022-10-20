package by.epam.lesson22.main;

import by.epam.lesson22.bean.User;
import by.epam.lesson22.bean.UsersDateBase;

import java.util.HashMap;
import java.util.Map;

public class UsersDatePutter {
    public static UsersDateBase createUsersDateBase() {
        UsersDateBase usersDateBase = new UsersDateBase();
        Map<String, User> users = new HashMap<String, User>();
        usersDateBase.setUsers(users);
        User user1 = new User("antropova", "593032",
                "artiom185400@gmail.com", "+375339549300");
        User user2 = new User("bogdanovich", "5e31132",
                "bogdanovichV@mail.ru", "+375445683455");
        User user3 = new User("kondral", "59_8423032",
                "akondralAlex@yandex.ru", "+375293891995");
        User user4 = new User("tkachovAA", "5ec493_2",
                "artiomtkachoy@yandex.ru", "+375291631278");
        users.put(user1.getLogin(), user1);
        users.put(user2.getLogin(), user2);
        users.put(user3.getLogin(), user3);
        users.put(user4.getLogin(), user4);

        return usersDateBase;
    }
}
