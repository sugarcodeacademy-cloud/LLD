package DesignPatterns.Observer;

import com.sun.javafx.UnmodifiableArrayList;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Channel{
    private final List<Subscriber> subscriberList = new ArrayList<>();
    private String video;
    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }
    public void UploadVideo(String video){
        this.video = video;
        System.out.println("new video has been uploaded to the channel : "+ video);
        notifyUsers();
    }

    @Override
    public void notifyUsers() {
        for(Subscriber subscriber: subscriberList){
            subscriber.update(video);
        }

    }
}
