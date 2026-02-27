package mvc.model;

import mvc.model.a.*;

public class Student implements Person {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Student(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String firstName(){
        return firstName;
    }
    @Override
    public String lastName(){
        return lastName;
    }
    @Override
    public String email(){
        return email;
    }
    @Override
    public String phoneNumber(){
        return phoneNumber;
    }


}
