package structural_patterns.proxy;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        if (this.gameService == null) {
            this.gameService = new DefaultGameService(); // Proxy lazy initialization
        }

        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
