package Lambdas;

public class HelloWorldName implements Runnable{
    private String name;
    public HelloWorldName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hello World" + name);
    }
}
