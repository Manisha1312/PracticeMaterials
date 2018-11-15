package com.practice.java.mani.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("manisha") && password.equals("mandal");
    }
}
