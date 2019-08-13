package com.covalense.empmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.dialect.identity.HSQLIdentityColumnSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookie")
public class CookieController {
	
	@GetMapping("/getCookiePage")
	public String getCookiepage() {
		return "cookiePage";
	}//end of createCookie

	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse response, ModelMap map) {
		Cookie cookie = new Cookie("name", "Chinnu");
		response.addCookie(cookie);
		
		map.addAttribute("msg", "cookie added successfully!");
		
		return "cookiePage";
	}//end of createCookie
	
	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name="name") String name, ModelMap map) {
		map.addAttribute("msg", name);
		
		return "cookiePage";
	}//end of createCookie
	
}//end of CookieController
