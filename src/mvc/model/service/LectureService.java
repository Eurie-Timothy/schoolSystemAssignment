package mvc.model.service;

import mvc.model.a.Person;
import mvc.control.AdmReg;
import mvc.model.Lecture;

public class LectureService {

    Person person;
    AdmReg admReg;


    void isEmptyLecture() {
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
        String staffId= admReg.addStaffId();
        if (staffId.trim().isEmpty()){
            throw new IllegalArgumentException("Staff ID cannot be empty");
        }
        person= new Lecture(fN,lN,email,phone,staffId,idNumber);
    }
}
