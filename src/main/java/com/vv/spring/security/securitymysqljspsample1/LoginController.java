package com.vv.spring.security.securitymysqljspsample1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @RequestMapping("/")
    public String getMessage()
    {
        return "Hellow";
    }
    @RequestMapping("/login")
    public String getLoginPage ()
    {
        return "login";
    }
    @RequestMapping("/logout-success")
    public String getLogout ()
    {
        return "logoutsucceess";
    }

}
