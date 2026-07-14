package Car;

public class Car{
    boolean alloyWheels = false;
    boolean touchScreen = false;
    boolean sunroof = false;

    String color = "Blue";

    Car(boolean alloy,boolean touch,boolean roof, String color){
        this.alloyWheels = alloy;
        this.sunroof = roof;
        this.touchScreen = touch;
        this.color = color;
    }

    Car(Car c){
        this.alloyWheels = c.alloyWheels;
        this.sunroof = c.sunroof;
        this.touchScreen = c.touchScreen;
        this.color = c.color;

    }

}
