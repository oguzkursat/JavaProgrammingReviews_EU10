package week06;

public class WarmUpTask6 {
    public static void main(String[] args) {

        String sentence = "S*78*8*e770987987n98347i 869869=s????23425235e54435v54898)!'^i^^&%y53453o" +
                "+%^^r%53543453u&+m%.&tg+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e " +
                "a6575b6575o5675u567t i5467t&";

        String resultsentence="";

        for (int i = 0; i < sentence.length() ; i++) {
            char ch = sentence.charAt(i);
            if(ch=='.'){
                break;
            }
            if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||ch==' ') {
                resultsentence += ch;
            }
        }

        System.out.println(resultsentence);

    }
}
