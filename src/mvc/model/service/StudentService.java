package mvc.model.service;

import mvc.control.AdmReg;
import mvc.model.Student;
import mvc.model.a.Person;

public class StudentService {
    //Student service
    Person person;
    AdmReg admReg;


    public void isEmptyStudent() {
        admReg = new AdmReg();

        String fN= admReg.addFirstName();
        if (fN.trim().isEmpty()){
            throw new IllegalArgumentException("First name cannot be empty");
        }
        String lN= admReg.addLastName();
        if (lN.trim().isEmpty()){
            throw new IllegalArgumentException("Last name cannot be empty");
        }
        String email= admReg.addEmail().concat("@gmail.com");
        if (email.trim().isEmpty()){
            throw new IllegalArgumentException("Email cannot be empty");
        }
        String phone= admReg.addPhoneNumber();
        if (phone.trim().isEmpty()){
            throw new IllegalArgumentException("Phone number cannot be empty");
        }
        String idNumber= admReg.addIDNumber();
        if (idNumber.trim().isEmpty()){
            throw new IllegalArgumentException("ID number cannot be empty");
        }
        String regID= admReg.addRegId();
        if (regID.trim().isEmpty()){
            throw new IllegalArgumentException("Reg ID cannot be empty");
        }
        person= new Student(fN,lN,email,phone,idNumber,regID);
    }

}
