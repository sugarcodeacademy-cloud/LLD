package Student;

public class Student {

    private String name;

    int rollNo;

    protected int batchID;

    public String universityName="Oxford";

    Student(String studentName, String universityName){
        System.out.println(this.universityName);
        this.name = studentName;
        this.universityName = universityName;
    }

    Student(){

    }
}
