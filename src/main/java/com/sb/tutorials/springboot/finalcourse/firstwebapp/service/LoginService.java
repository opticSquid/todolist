package com.sb.tutorials.springboot.finalcourse.firstwebapp.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean validate(String uname, String upass){
        return uname.equalsIgnoreCase(upass);
    }
}
