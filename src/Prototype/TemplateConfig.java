package Prototype;

import java.util.Arrays;

public class TemplateConfig {
    private static GameConfigRegistry registry;
    public static void fillRegistry(){
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

}
