package DesignPatterns.Decorators;

public class ChocolateConeDecorator implements IceCream{
    private IceCream iceCream;
    public ChocolateConeDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public ChocolateConeDecorator() {
    }

    @Override
    public double getPrice() {
        if(iceCream == null){
            return 10;
        }
        return iceCream.getPrice() + 10;
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
            return "Chocolate Cone";
        }
        return iceCream.getDescription() + " Chocolate Cone ";
    }
}
