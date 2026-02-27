package classFiles;
public class Lecturer implements Person {
    private String name;
    private final String id;
    private String email;
    private String phoneNumber;
    public Lecturer(String name, String id, String email, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.email= email;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String name() {
        return this.name;
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
