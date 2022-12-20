package week13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {

    static ArrayList <Teacher> teachers = new ArrayList<>();

    static {

        Teacher teacher1 = new Teacher("Muhtar","Abc",'M', LocalDate.of(1987,1,1),1);
        Teacher teacher2 = new Teacher("Gurhan","Abc",'M', LocalDate.of(1977,1,1),2);
        Teacher teacher3 = new Teacher("Aysun","Abc",'F', LocalDate.of(1967,1,1),3);
        Teacher teacher4 = new Teacher("Mike","Abc",'M', LocalDate.of(1970,1,1),4);
        Teacher teacher5 = new Teacher("Saim","Abc",'M', LocalDate.of(1989,1,1),5);
        Teacher teacher6 = new Teacher("Asya","Abc",'F', LocalDate.of(1990,1,1),6);

        teachers.addAll(Arrays.asList(teacher1,teacher2,teacher3,teacher4,teacher5,teacher6));

    }

    public static void main(String[] args) {
        System.out.println(teachers);
        
        ArrayList<Teacher> result = getTeachersNameStartWith("Mi");
        System.out.println(result);

        ArrayList<Teacher> sameGenders = getTeachersByGender('M');
        System.out.println(sameGenders);


        
    }

    private static ArrayList<Teacher> getTeachersByGender(char gender) {
        ArrayList<Teacher> result =new ArrayList<>(teachers);
        result.removeIf(p-> ! (p.gender==gender));
        return result;

        /*for (Teacher teacher : teachers) {
            if (teacher.gender==gender){
                result.add(teacher);
            }
        }
*/
    }

    private static ArrayList<Teacher> getTeachersNameStartWith(String prefix) {
        ArrayList<Teacher> result = new ArrayList<>(teachers) ;
        result.removeIf(p -> !p.name.startsWith("Mi"));
        return result;

/*
        for (Teacher teacher : teachers) {
            if (teacher.name.startsWith(prefix)){
                result.add(teacher);
            }
        }
*/
    }


}
