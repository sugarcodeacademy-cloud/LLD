package DesignPatterns.Observer;

public class Client {
    public static void main(String[] args) {
        YouTubeChannel sugarCodeChannel = new YouTubeChannel();

        User user1 = new User("Rahul");
        User user2 = new User("Priya");
        User user3 = new User("Amit");

        sugarCodeChannel.subscribe(user1);
        sugarCodeChannel.subscribe(user2);
        sugarCodeChannel.subscribe(user3);

        sugarCodeChannel.UploadVideo("new Java class has been added");

        sugarCodeChannel.unsubscribe(user1);

        sugarCodeChannel.UploadVideo("New AI has been launched");

    }
}
