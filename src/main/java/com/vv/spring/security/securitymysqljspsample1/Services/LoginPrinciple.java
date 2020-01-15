package com.vv.spring.security.securitymysqljspsample1.Services;

import com.vv.spring.security.securitymysqljspsample1.Entity.Login;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class LoginPrinciple  implements UserDetails {

    Login login;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    public LoginPrinciple(Login login)
    {
        super();
        this.login = login;
    }

    @Override
    public String getPassword() {
        return login.getPass();
    }

    @Override
    public String getUsername() {
        return login.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
