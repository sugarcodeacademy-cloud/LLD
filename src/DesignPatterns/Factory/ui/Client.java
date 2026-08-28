package DesignPatterns.Factory.ui;

public class Client {
    public static void main(String[] args) {
        UIFactoryImpl android = new UIFactoryImpl(SupportedPlatforms.ANDROID);
    }
}
