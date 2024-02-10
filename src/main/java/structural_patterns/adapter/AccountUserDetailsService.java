package structural_patterns.adapter;

import structural_patterns.adapter.Account;
import structural_patterns.adapter.AccountService;
import structural_patterns.adapter.security.UserDetails;
import structural_patterns.adapter.security.UserDetailsService;

// 기존 AccountService를 고칠 수 있다면 어댑터를 만들지 않고 직접 UserDetailsService를 AccountService에 구현하는 방식으로도 가능하다.
// 단점은 특정 인터페이스를 구현하도록 변경되기 때문에 AccountService 클래스가 UserDetailsService에 의존하게 된다.
public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
