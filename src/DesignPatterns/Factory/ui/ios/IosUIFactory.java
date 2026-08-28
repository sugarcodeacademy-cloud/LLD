package DesignPatterns.Factory.ui.ios;

import DesignPatterns.Factory.ui.Button;
import DesignPatterns.Factory.ui.Menu;
import DesignPatterns.Factory.ui.UIFactory;

public class IosUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}