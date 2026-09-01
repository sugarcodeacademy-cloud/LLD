package DesignPatterns.Decorators;
/**
 * VanillaScoopDecorator — Concrete Decorator (add-on / topping).
 *
 * Wraps an existing IceCream and adds vanilla Scoop to it.
 * This MUST wrap something — you can't have syrup without a cone.
 */
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
