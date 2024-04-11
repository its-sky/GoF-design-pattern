package behavioral_patterns.strategy;

public class BlueLightRedLight {

    public void blueLight(SpeedStrategy strategy) {
        strategy.blueLight();
    }

    public void redLight(SpeedStrategy strategy) {
        strategy.redLight();
    }

}
