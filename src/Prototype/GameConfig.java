package Prototype;

import java.util.ArrayList;
import java.util.List;

public class GameConfig implements Prototype<GameConfig>{
    private String map;
    private String version;
    private int maxPlayers;
    private String weatherType;
    private double health;
    private List<String> weaponsEnabled;
    private String serverRegion;

//    private String name;


    //20 more attibutes ....

    public GameConfig(){

    }

    //copy constructor
    public GameConfig(GameConfig source) {
        this.map = source.map;
        this.version = source.version;
        this.maxPlayers = source.maxPlayers;
        this.weatherType = source.weatherType;
        this.health = source.health;
        this.weaponsEnabled = new ArrayList<>(source.weaponsEnabled);
        this.serverRegion = source.serverRegion;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public List<String> getWeaponsEnabled() {
        return weaponsEnabled;
    }

    public void setWeaponsEnabled(List<String> weaponsEnabled) {
        this.weaponsEnabled = weaponsEnabled;
    }

    public String getServerRegion() {
        return serverRegion;
    }

    public void setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
    }

    @Override
    public GameConfig cloneObject() {
        return new GameConfig(this);
    }
}
