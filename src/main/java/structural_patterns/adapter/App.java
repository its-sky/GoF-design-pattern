package structural_patterns.adapter;

import structural_patterns.adapter.security.LoginHandler;
import structural_patterns.adapter.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        UserDetailsService userDetailsService = new AccountUserDetailsService(new AccountService());
        LoginHandler handler = new LoginHandler(userDetailsService);
        String login = handler.login("smc", "smc");
        System.out.println(login);
    }

}
