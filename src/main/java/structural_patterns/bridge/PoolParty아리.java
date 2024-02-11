package structural_patterns.bridge;

public class PoolParty아리 implements Champion {
    @Override
    public void move() {
        System.out.println("PoolParty 아리가 이동합니다.");
    }

    @Override
    public void skillQ() {
        System.out.println("PoolParty 아리가 Q 스킬을 사용합니다.");
    }

    @Override
    public void skillW() {
        System.out.println("PoolParty 아리가 W 스킬을 사용합니다.");
    }

    @Override
    public void skillE() {
        System.out.println("PoolParty 아리가 E 스킬을 사용합니다.");
    }

    @Override
    public void skillR() {
        System.out.println("PoolParty 아리가 R 스킬을 사용합니다.");
    }
}
