package structural_patterns.proxy.example_in_java;

import java.lang.reflect.Proxy;
import structural_patterns.proxy.DefaultGameService;
import structural_patterns.proxy.GameService;

public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();;
    }

    private GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, (proxy, method, args) -> {
                    System.out.println("Dynamic Proxy");
                    method.invoke(target, args);
                    return null;
                });
    }

}
