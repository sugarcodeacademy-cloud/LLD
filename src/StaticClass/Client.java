package StaticClass;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student("Priya",  34, 10);
//        s1.rollNo = 10;
//        System.out.println(s1.rollNo);

        Student s2 = new Student("Vinod", 22, 5);
//        s2.rollNo = 5;
//        System.out.println(s2.rollNo);
        System.out.println(Student.universityName);

    }
}

