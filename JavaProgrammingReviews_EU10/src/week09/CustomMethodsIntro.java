package week09;

import java.util.Arrays;
import java.util.Locale;

public class CustomMethodsIntro {
    public static void main(String[] args) {

      initials("wooden","spoon");

    }

    public static void initials(String firstName , String lastName){
        String fn = ""+firstName.charAt(0);
        String ln = ""+lastName.charAt(0);

        System.out.println(fn.toUpperCase() + "." + ln.toUpperCase());
    }
}
