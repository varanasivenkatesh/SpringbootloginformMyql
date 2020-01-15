package com.vv.spring.security.securitymysqljspsample1.Services;

import com.vv.spring.security.securitymysqljspsample1.Entity.Login;
import com.vv.spring.security.securitymysqljspsample1.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginUserDetailsServices implements UserDetailsService {

    @Autowired
    LoginRepository loginRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Login login = loginRepository.findByUsername(s);
        return new LoginPrinciple(login);
    }
}
