package by.epam.lesson22.bean;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class UsersDateBase implements Serializable {

    private static final long serialVersionUID = 1L;
    private Map<String, User> users;

    public UsersDateBase() {
    }

    public UsersDateBase(Map<String, User> users) {
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public void addUsers(User user) {
        users.put(user.getLogin(), user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsersDateBase)) return false;
        UsersDateBase that = (UsersDateBase) o;
        return Objects.equals(getUsers(), that.getUsers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsers());
    }
}
