package mvc.control;

import mvc.model.Lecture;
import mvc.model.Student;
import java.util.Scanner;

public class AdmReg {
    Scanner sc = new Scanner(System.in);

    Student student;
    Lecture lecture;

    //STUDENT's CODE
    public void addStudent(){
       String a = sc.nextLine();
       String b = sc.nextLine();
       String c = sc.nextLine();
       String d = sc.nextLine();
       student= new Student(a,b,c,d);
    }

     //LECTURER's CODE
    public void addLecture(){
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();
        lecture = new Lecture(a,b,c,d);
    }


    //DB





}
