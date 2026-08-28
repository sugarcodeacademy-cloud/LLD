package DesignPatterns.Factory.ui.ios;

import DesignPatterns.Factory.ui.Menu;

public class IosMenu implements Menu {

    @Override
    public void render() {
        System.out.println("[iOS] Rendering Cupertino action sheet menu");
    }
}