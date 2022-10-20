package by.epam.lesson22.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidator {
    private Matcher matcher;

    private static final String LOGIN_PATTERN = "^[a-zA-Z][a-zA-Z0-9-_\\.]{2,15}$";

    private static final Pattern pattern = Pattern.compile(LOGIN_PATTERN);

    public LoginValidator () {
    }

    public boolean validate(final String reg) {
        matcher = pattern.matcher(reg);
        return matcher.matches();
    }
}
