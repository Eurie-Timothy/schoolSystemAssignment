package mvc.model;

import java.util.Random;
import mvc.model.a.*;

public class Lecture implements Person {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String idNumber;
    private String staffId;

    Random rand = new Random();

    public Lecture(String firstName, String lastName, String email, String phoneNumber, String staffId, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.staffId = staffId;
        this.idNumber = idNumber;
    }

    @Override
    public String firstName(){
        return firstName;
    }
    @Override
    public String lastName(){
        return firstName;
    }
    @Override
    public String email(){
        return email;
    }
    @Override
    public String phoneNumber(){
        return phoneNumber;
    }
    @Override
    public String idNumber(){
        return idNumber;
    }
}