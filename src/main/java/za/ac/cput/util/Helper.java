package za.ac.cput.util;

import java.util.regex.Pattern;

public class Helper {

    public static boolean isNullorEmpty(String s){
        if (s == null || s.isEmpty())
            return true;
        return false;
    }


    public static boolean isValidEmail(String emailAddress) {

        if(emailAddress == null || emailAddress.isEmpty())
            return true;

        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }
}
