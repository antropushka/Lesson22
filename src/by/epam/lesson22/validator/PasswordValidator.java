package by.epam.lesson22.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private Matcher matcher;

    private static final String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,20}$";
    //одна заглавная, одна строчная, одно число, спец символ, не менее 8 знаков

    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public PasswordValidator () {
    }

    public boolean validate(final String reg) {
        matcher = pattern.matcher(reg);
        return matcher.matches();
    }
}
