package by.epam.lesson22.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    private Matcher matcher;

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public EmailValidator() {
    }

    public boolean validate(final String reg) {
        matcher = pattern.matcher(reg);
        return matcher.matches();
    }
}
