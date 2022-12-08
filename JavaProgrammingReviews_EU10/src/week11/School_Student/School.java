package week11.School_Student;

import java.util.ArrayList;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Aygun",'F',"25/10/1990",32,1223,'A');
        Student student2 = new Student("Kürşat",'M',"16/08/1992",30,3421,'A');
        Student student3 = new Student("Özgür",'M',"23/04/1976",46,3802,'A');
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(studentsNameStartsWithA(students));

    }
    public static ArrayList<Student> studentsNameStartsWithA (ArrayList<Student> students){
        students.removeIf(p-> !(p.name.startsWith("A")));
        return students;
    }
}
