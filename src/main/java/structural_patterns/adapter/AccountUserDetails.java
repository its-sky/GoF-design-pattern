package structural_patterns.adapter;

import structural_patterns.adapter.security.UserDetails;

// 기존 Account를 고칠 수 있다면 어댑터를 만들지 않고 직접 UserDetails를 Account에 구현하는 방식으로도 가능하다.
// 단점은 특정 인터페이스를 구현하도록 변경되기 때문에 Account 클래스가 UserDetails에 의존하게 된다.
public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
