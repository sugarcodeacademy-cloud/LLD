package DesignPatterns.Decorators;

public class ChocolateSyrupDecorator implements IceCream{
    private final IceCream iceCream;

    public ChocolateSyrupDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getPrice() {
        return iceCream.getPrice() + 25;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Chocolate Syrup ";
    }
}
