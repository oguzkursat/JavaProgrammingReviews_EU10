package daily_tasks.day28_ArrayList;

public class StrongPassword {
    /*public static void main(String[] args) {

        String password = "Cydeo1990@"; //  {"C","y","d","e",}

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = isUpperCase(password);
        boolean r3 = isLowerCase(password);
        boolean r4 = isSpecialCharacter(password);
        boolean r5 = isDigit(password);

        boolean isStrongPassword = r1&&r2&&r3&&r4&&r5;

        System.out.println(isStrongPassword);
    }

    public static boolean isUpperCase(String password) {
        boolean isUpperCase = false;
        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i)>='A' && password.charAt(i)<='Z'){
                isUpperCase = true;
                break;
            }
        }
        return isUpperCase;
    }
    public static boolean isLowerCase(String password) {
        boolean isLowerCase = false;
        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i)>='a' && password.charAt(i)<='z'){
                isLowerCase = true;
                break;
            }
        }
        return isLowerCase;
    }
    public static boolean isSpecialCharacter(String password) {
        boolean isSpecialCharacter = false;
        for (int i = 0; i < password.length(); i++) {
            if(!(password.charAt(i)>='A' && password.charAt(i)<='Z' || password.charAt(i)>='a' && password.charAt(i)<='z' || password.charAt(i)>='0' && password.charAt(i)<='9')){
                isSpecialCharacter = true;
                break;
            }
        }
        return isSpecialCharacter;
    }
    public static boolean isDigit(String password) {
        boolean isDigit = false;
        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i)>='0' && password.charAt(i)<='9'){
                isDigit = true;
                break;
            }
        }
        return isDigit;
    }*/


    /*public static void main(String[] args) {

        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;

        char[] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else {
                r4 = true;
            }

            if(r2 && r3 && r4 && r5){
                break;
            }
        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println(isStrongPassword);


    }*/

    public static void main(String[] args) {

        String password = "Cydeo1990@";
        System.out.println(isStrong(password));
    }

    public static boolean isStrong(String password) {
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        char[] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else {
                r4 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;

    }
}
