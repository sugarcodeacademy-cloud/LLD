package DesignPatterns.Startergy;

import javafx.scene.shape.Path;

public class GoogleMaps {
//    public String findPath(String source, String destination, String mode){
//        if(mode.equals("car")){
//            return "Consider Highways and toll roads";
//        }
//        else if(mode.equals("bike")){
//            return "Consider narrow lanes and shortcuts";
//        }
//        else if(mode.equals("walk")){
//            return "Consider walkways, alleys, foot over bridges";
//        }
//       else{
//            return throw new RuntimeException("Invalid Mode");
//        }
//    }

/**
 * GoogleMaps — Context class that uses the Strategy pattern.
 *
 * Instead of having a giant if-else block to handle different
 * transport modes, GoogleMaps delegates pathfinding to the
 * appropriate PathCalculator strategy obtained from the factory.
 *
 * This class is now:
 * ✅ Open-Closed Principle compliant — add new modes without modifying this class
 * ✅ Single Responsibility — only orchestrates, doesn't implement algorithms
 */
    public String findPath(String source, String destination, ModeTypes mode){
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        return pathCalculator.findPath(source, destination);
    }
}
