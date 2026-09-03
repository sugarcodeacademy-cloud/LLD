package DesignPatterns.Observer;

public class User implements Subscriber{
    private String name;
//    private String emailId;

    public User(String name) {
        this.name = name;
//        this.emailId = emailId;
    }

    @Override
    public void update(String video) {
        System.out.println(
                name + " received notification: " + video
        );
    }
}
