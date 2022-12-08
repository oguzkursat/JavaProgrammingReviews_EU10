package day09;

public class CharacterIdentity {
    public static void main(String[] args) {

        char character = '@';
        if(character>='a' && character<='z' || character>='A' && character<='Z'){
            System.out.println(character + " is an alphabetical character");
        }else if(character>='0' && character<='9'){
            System.out.println(character + " is a digit character");
        }else {
            System.out.println(character + " is a special character");
        }





    }
}
