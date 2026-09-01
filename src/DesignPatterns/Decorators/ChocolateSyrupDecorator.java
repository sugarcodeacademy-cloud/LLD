package DesignPatterns.Decorators;
/**
 * ChocolateSyrup — Concrete Decorator (add-on / topping).
 *
 * Wraps an existing IceCream and adds chocolate syrup to it.
 * This MUST wrap something — you can't have syrup without a cone.
 */
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
