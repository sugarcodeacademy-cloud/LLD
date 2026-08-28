package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
//        StudentBuilder builder = new StudentBuilder();
//        builder.setAge(12);
//        builder.setBatch("23");
//        builder.setGradYear(2024);
//        builder.setName("Priya");
//        Student student = new Student(builder);
//
//    }
        //VERBOSE
//        StudentBuilder builder = Student.getBuilder(); //Student is responsible for creating a builder which tells the attributes inside a student
//        builder.setAge(12);
//        builder.setBatch("23");
//        builder.setGradYear(2024);
//        builder.setName("Priya");
//        Student student = builder.build();// builder builds the Student Object

        Student student1 = Student.getBuilder()
                .setName("Priya")
                .setAge(23)
                .setGradYear(2025)
                .setPsp(83.8)
                .setUniversityName("XYZ university")
                .setBatch("54")
                .build();
//        Student student2 = new Student(); // make student constructor private
        System.out.println(student1.getName());


    }
}
