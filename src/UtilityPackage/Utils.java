package UtilityPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static boolean isEmailValid ( String email ) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches() ;
    }
    public static boolean isPasswordValid (String password) {
        int num = 0 , word = 0 ;
        for (int i=0 ; i<password.length() ; i++) {
            if (password.charAt(i) >= '0' && password.charAt(i)<= '9') num ++;
            if ( (password.charAt(i) >= 'a' && password.charAt(i)<='z') || (password.charAt(i) >= 'A' && password.charAt(i)<='Z')) word ++;
        }
        return (num>0) && (word>0) ;
    }
}

