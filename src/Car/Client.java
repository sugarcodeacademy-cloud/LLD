package Car;

public class Client {
    public static void main(String[] args) {
        Car highEnd1 = new Car(true, true,false,"Blue");
//        Car highEnd2 = highEnd1;
//        pointing to same ref
        Car highEnd2 = new Car(highEnd1);
        highEnd2.color = "yellow";
//        System.out.println(highEnd2.color);
//        System.out.println(highEnd1.color);
    }
}
