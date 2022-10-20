package by.epam.lesson22;

import by.epam.lesson22.validator.PasswordValidator;
import by.epam.lesson22.validator.PhoneNumValidator;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main (String[] args) {

//        PhoneNumValidator phoneNumValidator = new PhoneNumValidator();
//        List<String> phones = new ArrayList<>();
//        phones.add("+kmfb lb ");
//        phones.add("+594395945932547800000006974656");
//        phones.add("485034053");
//        phones.add("+375293098514");
//        for (int i = 0; i < phones.size(); i++) {
//            String temp = phones.get(i);
//            boolean valid = phoneNumValidator.validate(temp); ;
//            System.out.println("Email: " + temp + " -> " + valid);
//        }
//
        PasswordValidator passwordValidator = new PasswordValidator();
        List<String> passwords = new ArrayList<>();
        passwords.add("Affsa89_!");
        passwords.add("A_908akdadwf=");
        passwords.add("485034053");
        passwords.add("+375293098514");
        for (int i = 0; i < passwords.size(); i++) {
            String temp = passwords.get(i);
            boolean valid = passwordValidator.validate(temp); ;
            System.out.println("password:" + temp + " -> " + valid);
        }


//        EmailValidator emailValidator = new EmailValidator();
//        List<String> emails = new ArrayList<String>();
//        emails.add("alex@.com.ua");
//        emails.add("alex123@gmail.a");
//        emails.add("alex123@.com");
//        emails.add("alex@%*.com");
//        emails.add("tati-antropova@mail.ru");
//        for (int i = 0; i < emails.size(); i++) {
//            String temp = emails.get(i);
//            boolean valid= emailValidator.validate(temp);
//            System.out.println("Email: " + temp + " -> " + valid);
//        }
//
//

    }
}
