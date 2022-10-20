package by.epam.lesson22.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumValidator {

    private Matcher matcher;

    private static final String PHONE_PATTERN =  "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$"
             + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$"
             + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$";

    private static final Pattern pattern = Pattern.compile(PHONE_PATTERN);

    public PhoneNumValidator() {
    }

    public boolean validate(final String reg) {
        matcher = pattern.matcher(reg);
        return matcher.matches();
    }
}
