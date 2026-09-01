package DesignPatterns.Decorators;

public class Client {
    public static void main(String[] args) {
//        IceCream iceCream = new ChocolateCone();
//        IceCream vanillaIcecream = new VanillaScoopDecorator(iceCream);
//        IceCream vanillaNutsIcecream = new NutsDecorator(vanillaIcecream);
//        System.out.println(vanillaNutsIcecream.getPrice());
//        System.out.println(vanillaNutsIcecream.getDescription());

        IceCream iceCream = new NutsDecorator(new VanillaScoopDecorator(new OrangeConeDecorator(new NutsDecorator(new ChocolateConeDecorator()))));
        System.out.println(iceCream.getPrice());
        System.out.println(iceCream.getDescription());

        /*
        ChocolateCone
        ChocolateConeVanillaScoop

         */


    }
}
