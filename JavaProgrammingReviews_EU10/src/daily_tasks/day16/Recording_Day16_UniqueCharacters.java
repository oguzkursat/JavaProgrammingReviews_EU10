package daily_tasks.day16;

public class Recording_Day16_UniqueCharacters {
    public static void main(String[] args) {

        String str="saasgfhghgasjhhkmşwi";

        String result="";

        /*char ch = 'q';

        if(str.indexOf(ch)==str.lastIndexOf(ch)){
            result+=ch;
        }*/
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;
            }
        }

        System.out.println(result);


    }
}
