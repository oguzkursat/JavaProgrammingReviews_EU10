package hatalikodlar;

public class FirstDuplicationOfString {
    public static void main(String[] args) {

        int [] num1= {1,2,3,4,5};
        int [] num2= {4,5,6,7,8};
        int temp=0;
        //int [] result= new int[temp];

        for (int i = 0; i <num1.length ; i++) {
            for (int j = 0; j <num2.length ; j++) {

                if(num1[i]==num2[j]){
                    temp++;

                }

            }

        }
        System.out.println( temp);

    }
}