package behavioral_patterns.strategy;

public class FastestSpeed implements SpeedStrategy {
    @Override
    public void blueLight() {
        System.out.println("뫄꽃이");
    }

    @Override
    public void redLight() {
        System.out.println("폈슴다");
    }
}
