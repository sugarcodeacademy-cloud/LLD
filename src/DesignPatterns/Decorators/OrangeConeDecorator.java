package DesignPatterns.Decorators;

public class OrangeConeDecorator implements IceCream{
    private IceCream iceCream;

    public OrangeConeDecorator() {
    }

    public OrangeConeDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }


    @Override
    public double getPrice() {
        if(iceCream == null){
            return 15;
        }
        return iceCream.getPrice() + 15;
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
            return "Orange Cone";
        }
        return iceCream.getDescription() + " Orange Cone ";
    }
}
