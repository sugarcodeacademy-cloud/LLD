package Prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void fillRegistry(GameConfigRegistry registry){
        // ── Template: Battle Royale on Erangel ──
        GameConfig brErangel = new GameConfig();
        brErangel.setMap("Erangel");
        brErangel.setVersion("3.2.1");
        brErangel.setMaxPlayers(100);
        brErangel.setWeaponsEnabled(Arrays.asList("AR", "SMG", "Sniper", "Shotgun"));
        brErangel.setWeatherType("Clear");
        brErangel.setHealth(100);
        brErangel.setServerRegion("Default");

        registry.register("BR-Erangel", brErangel);

        // ── Template: TDM on Warehouse ──
        GameConfig tdmWarehouse = new GameConfig();
        tdmWarehouse.setMap("Warehouse");
        tdmWarehouse.setVersion("3.2.1");
        tdmWarehouse.setMaxPlayers(8);
        tdmWarehouse.setWeaponsEnabled(Arrays.asList("AR", "SMG"));
        tdmWarehouse.setWeatherType("Indoor");
        tdmWarehouse.setHealth(1.5);
        tdmWarehouse.setServerRegion("Default");

        registry.register("TDM-Warehouse", tdmWarehouse);

        // ── Template: Ranked on Erangel (uses RankedConfig!) ──
        RankedGameConfig rankedErangel = new RankedGameConfig();
        rankedErangel.setMap("Erangel");
        rankedErangel.setVersion("3.2.1");
        rankedErangel.setMaxPlayers(64);
        rankedErangel.setWeaponsEnabled(Arrays.asList("AR", "SMG", "Sniper", "Shotgun"));
        rankedErangel.setWeatherType("Clear");
        rankedErangel.setHealth(100);
        rankedErangel.setServerRegion("Default");
        rankedErangel.setRankedPointsMultiplier(2);
        rankedErangel.setAntiCheatEnabled(true);

        registry.register("Ranked-Erangel", rankedErangel);
    }
    public static void main(String[] args) {
//        GameConfig config1 = new GameConfig();
//        config1.setMap("Erangel");
//        config1.setHealth(100);
//        config1.setVersion("2.30.0");
//        config1.setMaxPlayers(100);
//        config1.setWeatherType("Rain");
//        config1.setWeaponsEnabled(List.of("AKM", "Shotgun","knife"));
//        config1.setServerRegion("India");

        //Repetitive Code
//        GameConfig config2 = new GameConfig();
//        config2.setMap("Erangel");
//        config2.setHealth(100);
//        config2.setVersion("2.30.0");
//        config2.setMaxPlayers(100);
//        config2.setWeatherType("Rain");
//        config2.setWeaponsEnabled(List.of("AKM", "Shotgun","knife"));
//        config2.setServerRegion("Europe");
//        //config2 = config1; //Shallow copy

        //Naive Copying
//        config2.setMap(config1.getMap());
//        config2.setWeatherType(config1.getWeatherType());
//        config2.setServerRegion("Europe");

        //Problems
        //1.Tight coupling --> Client should know each and every attribute -- violates encapsulation
        //2.Repetitive code
        //3.Fragile to changes and prone to errors

//        GameConfig erangelTemplate = new GameConfig();
//        erangelTemplate.setMap("Erangel");
//        erangelTemplate.setVersion("3.2.1");
//        erangelTemplate.setMaxPlayers(100);
//        erangelTemplate.setWeaponsEnabled(Arrays.asList("AR", "SMG", "Sniper", "Shotgun"));
//        erangelTemplate.setWeatherType("Clear");
//        erangelTemplate.setHealth(100);
//        erangelTemplate.setServerRegion("Asia");
//
//        //Clone and customize
//        GameConfig europeMatch = erangelTemplate.cloneObject();
//        europeMatch.setServerRegion("Europe");
//
//        GameConfig americaRainyMatch = erangelTemplate.cloneObject();
//        americaRainyMatch.setServerRegion("America");
//        americaRainyMatch.setWeatherType("Rainy");

//        RankedGameConfig original = new RankedGameConfig();
//        original.setMap("Erangel");
//        original.setWeaponsEnabled(Arrays.asList("AKM", "ShotGun"));
//        original.setAntiCheatEnabled(true);
//        original.setRankedPointsMultiplier(2);
//
//        RankedGameConfig europeRankedMatch = original.cloneObject();
//        europeRankedMatch.setServerRegion("Europe");
//
//        System.out.println("DEBUG");
        //Step1: Create and populate the registry
        GameConfigRegistry registry = new GameConfigRegistry();
        fillRegistry(registry);

        //Step2: get the cloned object using key
        //similar click on the map in UI
        GameConfig europeMatch = registry.get("BR-Erangel").cloneObject();

        //Step3: Customize the cloned object
        europeMatch.setServerRegion("Europe");

    }
}
