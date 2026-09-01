package DesignPatterns.Decorators;
/**
 * ChocolateCone — Concrete Component (base cone).
 *
 * A chocolate-flavoured cone. Like ChocolateCone, it can be the
 * starting point of an ice cream OR decorate an existing one.
 */
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
