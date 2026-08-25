package Prototype;

public class RankedGameConfig extends GameConfig{

    private int rankedPointsMultiplier;
    private boolean antiCheatEnabled;

    public RankedGameConfig(){}

    public RankedGameConfig(RankedGameConfig source) {
        super(source);
        this.rankedPointsMultiplier = source.rankedPointsMultiplier;
        this.antiCheatEnabled = source.antiCheatEnabled;
    }

    public int getRankedPointsMultiplier() {
        return rankedPointsMultiplier;
    }

    public void setRankedPointsMultiplier(int rankedPointsMultiplier) {
        this.rankedPointsMultiplier = rankedPointsMultiplier;
    }

    public boolean isAntiCheatEnabled() {
        return antiCheatEnabled;
    }

    public void setAntiCheatEnabled(boolean antiCheatEnabled) {
        this.antiCheatEnabled = antiCheatEnabled;
    }

    //Always override your clone method in child class also else you can only create clones upto parent class
    @Override
    public RankedGameConfig cloneObject() {
        return new RankedGameConfig(this);
    }
}
