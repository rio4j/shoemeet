package com.shoemeet.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shoemeet.domain.User;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController<User> {
	
	@RequestMapping("/page")
	public String page (HttpServletRequest request, HttpServletResponse response) {
		return "/user/hello";
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser (HttpServletRequest request, HttpServletResponse response) {
		addObject(new User());
		return null;
	}

}
