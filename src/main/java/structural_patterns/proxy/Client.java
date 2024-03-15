package structural_patterns.proxy;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }

}
