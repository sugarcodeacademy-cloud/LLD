package DesignPatterns.Decorators;

public class NutsDecorator implements IceCream{
    private final IceCream iceCream;

    public NutsDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }


    @Override
    public double getPrice() {
        return iceCream.getPrice() + 40;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Nuts ";
    }
}
