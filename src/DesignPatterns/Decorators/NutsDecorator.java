package DesignPatterns.Decorators;
/**
 * NutsDecorator — Concrete Decorator (add-on / topping).
 *
 * Wraps an existing IceCream and adds nuts to it.
 * This MUST wrap something — you can't have syrup without a cone.
 */
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
