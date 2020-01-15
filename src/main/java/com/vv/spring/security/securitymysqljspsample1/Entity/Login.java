package com.vv.spring.security.securitymysqljspsample1.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Id
    Integer id;
    String username;
    String pass;

    public Login(Integer id,String username,String pass)
    {
        this.id = id;
        this.username = username;
        this.pass = pass;
    }

    public Login() {
    }



}
