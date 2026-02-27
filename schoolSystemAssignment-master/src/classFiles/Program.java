package classFiles;

public class Program implements Course {
    private final String programID;
    private String courseName;
    public Program(String programID,  String courseName) {
        this.programID = programID;
        this.courseName = courseName;
    }
    @Override
    public String programID() {
        return this.programID;
    }
    @Override
    public String courseName() {
        return this.courseName;
    }
}
