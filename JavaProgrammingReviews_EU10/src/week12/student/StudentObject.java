package week12.student;

import java.util.Scanner;

public class StudentObject {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter student's name:");
        Student student1= new Student(input.next());
        System.out.println("Please enter "+ student1.name+"'s age:");
        student1.age=input.nextInt();
        System.out.println("Please enter "+ student1.name+"'s batch number:");
        student1.batchNumber=input.nextLong();

        System.out.println(student1);

    }
}
