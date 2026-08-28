package DesignPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class GameConfigRegistry {
    //BR-Erangel --> GameConfig
    //TDM-WareHouse --> GameConfig
    //Ranked ...

    private Map<String, GameConfig> registry = new HashMap<>();

    public void register(String key, GameConfig config){
        registry.put(key, config);
    }

    public GameConfig get(String key){
        return registry.get(key);
    }
}
