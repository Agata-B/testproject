package presentationExcercises;

import java.util.regex.Pattern;

public class regexExample {

    public static boolean isIdCorrect(String id) {
        Pattern iDPattern = Pattern.compile("[0-9]{11}");
        return iDPattern.matcher(id).matches();
    }

    public static boolean isEmailCorrect(String email) {
        Pattern emailPattern = Pattern.compile("[0-9a-z\\.\\-]+@[a-z0-9]+\\.[a-z]+");
        return emailPattern.matcher(email).matches();
    }
    public static void main (String[]args){
        System.out.println(isIdCorrect("258741368"));
        System.out.println(isEmailCorrect("agata01@wp.pl"));
    }
}
