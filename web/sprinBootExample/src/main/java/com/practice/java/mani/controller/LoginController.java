package com.practice.java.mani.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.practice.java.mani.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginService loginService;
	// @RequestMapping(value="/login")
	//// @ResponseBody //Without view if we want to pass anything back as json
	// public String sayHello(@RequestParam String a,ModelMap m){
	//// return "Hello Manisha";
	//// m.put("name", "Manisha");
	// m.put("name", a);
	// return "login";
	// }

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLogin(ModelMap model, @RequestParam String name, 
			@RequestParam String password) {
		boolean isValidUser = loginService.validateUser(name, password);

		if (isValidUser) {
			model.put("name", name);
			return "welcome";
		} else {
			model.put("errorMessage", "Invalid Credentials!!");
			return "login";
		}
	}
}
