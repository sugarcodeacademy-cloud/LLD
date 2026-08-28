package DesignPatterns.Factory.ui;

import DesignPatterns.Factory.ui.android.AndroidUIFactory;
import DesignPatterns.Factory.ui.ios.IosUIFactory;

public class UIFactoryImpl{

    public UIFactoryImpl(SupportedPlatforms supportedPlatforms) {
    }

    /**
     * Returns the correct UIFactory for the given platform.
     * This is the "one place" where the if/else lives.
     */
    public static UIFactory createUIFactory(SupportedPlatforms platform) {
        return switch (platform) {
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IosUIFactory();
//            case WEBAPP -> new WebAppFactory();
        };
    }
}