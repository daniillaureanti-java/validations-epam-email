package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        // Put your code here
        if (email == null) {
            return false;
        }
        final String regex = "^[a-zA-Z]+_[a-zA-Z]+[0-9]*@epam.com$";

        return Pattern.matches(regex,email);

    }
}





