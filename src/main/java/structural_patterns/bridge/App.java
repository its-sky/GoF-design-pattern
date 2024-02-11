package structural_patterns.bridge;

public class App {

    public static void main(String[] args) {
        Champion kdaAkali = new 아칼리(new KDA());
        kdaAkali.skillQ();
        kdaAkali.skillR();

        Champion poolPartyAhri = new 아리(new PoolParty());
        poolPartyAhri.skillW();
        poolPartyAhri.skillE();
    }

}
