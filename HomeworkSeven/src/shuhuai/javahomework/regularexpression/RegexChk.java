package shuhuai.javahomework.regularexpression;

import java.util.regex.Pattern;

public class RegexChk {
    public static boolean verifyInteger(String s) {
        Pattern pattern = Pattern.compile("^(-)?[0-9]+$");
        return pattern.matcher(s).matches();
    }

    public static boolean verifyPhone(String s) {
        Pattern pattern = Pattern.compile("^1[0-9]{10}$");
        return pattern.matcher(s).matches();
    }

    public static boolean verifyEmail(String s) {
        Pattern pattern = Pattern.compile("^\\S{3,}@[a-zA-Z0-9][-a-zA-Z0-9]{0,62}([.][a-zA-Z0-9][-a-zA-Z0-9]{0,62}){1,2}$");
        return pattern.matcher(s).matches();
    }

    public static boolean verifyPostcode(String s) {
        Pattern pattern = Pattern.compile("^\\d{6}$");
        return pattern.matcher(s).matches();
    }

    public static boolean verifyID(String s) {
        return s.matches("^(\\d{17})([0-9]|X)$");
    }
}