package DesignPatterns.Startergy;

public class PathCalculatorFactory {
    private static final CarPathCalculator CAR_PATH_CALCULATOR = new CarPathCalculator();
    private static final BikePathCalculator BIKE_PATH_CALCULATOR = new BikePathCalculator();
    private static final WalkPathCalculator WALK_PATH_CALCULATOR = new WalkPathCalculator();
    public static PathCalculator getPathCalculator(ModeTypes mode){
        return switch(mode){
            case CAR -> CAR_PATH_CALCULATOR;
            case BIKE -> BIKE_PATH_CALCULATOR;
            case WALK -> WALK_PATH_CALCULATOR;
            default -> throw new RuntimeException("Invalid mode");
        };
    }
}
