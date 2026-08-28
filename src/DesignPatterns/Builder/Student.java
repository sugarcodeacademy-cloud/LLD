package DesignPatterns.Builder;

public class Student {
//Map Approach
//    Student(Map<String, Object> map){
//        String name = (String)map.get("name");
//        int id = (int)map.get("id");
//
//    }
    private String name;
    private int age;
    private long id;
    private double psp;
    private String universityName;
    private String phoneNumber;
    private String batch;
    private int gradYear;

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    private Student(StudentBuilder builder){
//        if(builder.getAge() < 16) throw new IllegalArgumentException("Invalid age");
        this.age = builder.getAge();
        this.batch = builder.getBatch();;
        this.name = builder.getName();
        this.id = builder.getId();
        this.psp = builder.getPsp();
        this.phoneNumber = builder.getPhoneNumber();
        this.universityName = builder.getUniversityName();
        this.gradYear = builder.getGradYear();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }

    public double getPsp() {
        return psp;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBatch() {
        return batch;
    }

    public int getGradYear() {
        return gradYear;
    }

    //INNER CLASS
    static class StudentBuilder {
        private String name;
        private int age;
        private long id;
        private double psp;
        private String universityName;
        private String phoneNumber;
        private String batch;
        private int gradYear;

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public long getId() {
            return id;
        }

        public StudentBuilder setId(long id) {
            this.id = id;
            return  this;
        }

        public double getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public StudentBuilder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public StudentBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build(){
            //validations
            validate();
            return new Student(this);
        }

        public void validate(){
            if(this.getAge() < 16) throw new IllegalArgumentException("Invalid age");
        }
    }

}

/*
Flaws with map approach
map.put("id", "hello") -->  ClassCastException at runtime
map.put("nmae", "Priya") --> silently ignored, name is null
No compile time safety --> Errors will only surface at runtime

 */
