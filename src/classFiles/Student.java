package classFiles;

public class Student implements Person{
    private String name;
    private String id;
    private String email;
    private String phoneNumber;
    public Student(String name, String id, String email, String phoneNumber) {
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

    public void getDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Email: "+this.email);
        System.out.println("Phone Number: "+this.phoneNumber);
    }

}
