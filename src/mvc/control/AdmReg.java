package mvc.control;

import mvc.model.Lecture;
import mvc.model.Student;
import java.util.Scanner;

public class AdmReg {
    Scanner sc = new Scanner(System.in);
   //General
    public String addFirstName() {
        System.out.print("FirstName: ");
        String foo = sc.nextLine();
        return foo;
    }
    public String addLastName() {
        System.out.print("LastName: ");
        String foo = sc.nextLine();
        return foo;
    }
    public String addEmail() {
        System.out.print("Email: ");
        String foo = sc.nextLine();
        return foo;
    }
    public String addPhoneNumber() {
        System.out.print("PhoneNumber: ");
        String foo = sc.nextLine();
        return foo;
    }

    //LECTURE's CODE

    public String addIDNumber() {
        System.out.print("IDNumber: ");
        String foo = sc.nextLine();
        return foo;
    }
    public String addStaffId() {
        System.out.print("StaffId: ");
        String foo = sc.nextLine();
        return foo;
    }

    //STUDENT's CODE
    public String addRegId() {
        System.out.print("RegID: ");
        String foo = sc.nextLine();
        return foo;
    }



}
