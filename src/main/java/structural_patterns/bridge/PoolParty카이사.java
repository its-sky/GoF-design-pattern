package structural_patterns.bridge;

public class PoolParty카이사 implements Champion {
    @Override
    public void move() {
        System.out.println("PoolParty 카이사가 이동합니다.");
    }

    @Override
    public void skillQ() {
        System.out.println("PoolParty 카이사가 Q 스킬을 사용합니다.");
    }

    @Override
    public void skillW() {
        System.out.println("PoolParty 카이사가 W 스킬을 사용합니다.");
    }

    @Override
    public void skillE() {
        System.out.println("PoolParty 카이사가 E 스킬을 사용합니다.");
    }

    @Override
    public void skillR() {
        System.out.println("PoolParty 카이사가 R 스킬을 사용합니다.");
    }
}
