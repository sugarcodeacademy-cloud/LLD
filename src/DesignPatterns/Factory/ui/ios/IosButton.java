package DesignPatterns.Factory.ui.ios;

import DesignPatterns.Factory.ui.Button;

public class IosButton implements Button {
    public void render() {
        System.out.println("[IOS] Rendering Material Design button");
    }

    @Override
    public void onClick() {
        System.out.println("[IOS] Button clicked — ripple effect");
    }
}
