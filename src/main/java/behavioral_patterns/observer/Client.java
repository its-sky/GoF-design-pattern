package behavioral_patterns.observer;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("smc");
        User user2 = new User("tmptmp");

        chatServer.register("SpringBoot", user1);
        chatServer.register("SpringBoot", user2);

        chatServer.register("디자인패턴", user1);

        chatServer.sendMessage(user1, "SpringBoot", "What is CQRS Pattern?");
        chatServer.sendMessage(user2, "디자인패턴", "Observer Pattern");

        chatServer.unregister("디자인패턴", user1);

        chatServer.sendMessage(user2, "디자인패턴", "Observer Pattern");
    }

}
