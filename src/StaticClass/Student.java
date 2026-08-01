package StaticClass;

public class Student {

    int rollNo;

    String name;

    final static String universityName= "SUGARCODE";

    int batchNumber;
    void changeUniveristy(Student s){

    }
    Student(String name, int batchNumber, int rollNo ){
        this.name= name;
        this.batchNumber = batchNumber;
        this.rollNo = rollNo;
    }

}
