package by.epam.lesson22.middleware;

import by.epam.lesson22.bean.User;

public abstract class Middleware {

    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(User user);

    public boolean checkNext(User user) {
        if (next == null) {
            return true;
        }
        return  next.check(user);

    }


}
