package sample;

public class Student {
    private String name;
    private String studentID;
    public Student(String name, String studentID, double score){
        this.name = name;
        this.studentID = studentID;
    }
    public Student(String name, String studentID){
        this.name = name;
        this.studentID = studentID;
    }
    public Student(){
    }
    public String getName(){
        return this.name;
    }
    public String getStudentID(){
        return this.studentID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
