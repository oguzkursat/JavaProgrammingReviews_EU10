package daily_tasks.day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        int [] arr = {1,2,3};

        System.out.println("Test started");

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("Catch Block");
        }finally {
            System.out.println("Finally Block");
        }

        System.out.println("Test completed");



    }
}
