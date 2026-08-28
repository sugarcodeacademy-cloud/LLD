package DesignPatterns.Factory.ui.android;

import DesignPatterns.Factory.ui.Menu;

public class AndroidMenu implements Menu {

    @Override
    public void render() {
        System.out.println("[Android] Rendering Material dropdown menu");
    }
}