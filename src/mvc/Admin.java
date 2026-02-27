package mvc;

import java.util.Scanner;
import classFiles.Student;
public class Admin {
    Scanner sc = new Scanner(System.in);
    Student student;

    void addStudent(){
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String id = sc.nextLine();
        String email = sc.nextLine();
        String phoneNumber = sc.nextLine();
        student = new Student(firstName, lastName, id, email, phoneNumber);
    }
}
