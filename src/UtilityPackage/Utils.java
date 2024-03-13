package UtilityPackage;

public class Utils {
    public static boolean isPasswordValid (String password) {
        int num = 0 , word = 0 ;
        for (int i=0 ; i<password.length() ; i++) {
            if (password.charAt(i) >= '0' && password.charAt(i)<= '9') num ++;
            if ( (password.charAt(i) >= 'a' && password.charAt(i)<='z') || (password.charAt(i) >= 'A' && password.charAt(i)<='Z')) word ++;
        }
        return (num>0) || (word>0) ;
    }
}

