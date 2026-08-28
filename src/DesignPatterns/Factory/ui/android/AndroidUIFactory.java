package DesignPatterns.Factory.ui.android;

import DesignPatterns.Factory.ui.Button;
import DesignPatterns.Factory.ui.Menu;
import DesignPatterns.Factory.ui.UIFactory;

public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
