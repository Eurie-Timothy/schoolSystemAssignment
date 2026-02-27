package classFiles;
public class Lecturer implements Person {
    private String firstName, lastName;
    private final String id;
    private String email;
    private String phoneNumber;
    public Lecturer(String firstName, String lastName, String id, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.email= email;
        this.phoneNumber = phoneNumber;
    }
    public String name() {
        return this.firstName + " " + this.lastName;
    }
    @Override
    public String id() {
        return this.id;
    }
    @Override
    public String email(){
        return this.email;
    }
    @Override
    public String phoneNumber(){
        return this.phoneNumber;
    }


}
