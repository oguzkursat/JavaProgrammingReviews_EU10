package day08;

public class SchoolType {
    public static void main(String[] args) {

        byte gradeLevel = 7;

        if(gradeLevel>0 && gradeLevel<6){
            System.out.println(gradeLevel + " grade level is Elementary School");
        } else if (gradeLevel<9) {
            System.out.println(gradeLevel + " grade level is Middle School");
        }else if (gradeLevel<13) {
            System.out.println(gradeLevel + " grade level is High School");
        }else if (gradeLevel<17) {
            System.out.println(gradeLevel + " grade level is College");
        }else if (gradeLevel<19) {
            System.out.println(gradeLevel + " grade level is Grad School");
        }


    }
}
