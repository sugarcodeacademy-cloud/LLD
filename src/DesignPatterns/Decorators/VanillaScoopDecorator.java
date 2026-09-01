package DesignPatterns.Decorators;

public class VanillaScoopDecorator implements IceCream{
    private final IceCream iceCream;

    public VanillaScoopDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getPrice() {
        return iceCream.getPrice() + 30;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Vanilla Scoop ";
    }
}
