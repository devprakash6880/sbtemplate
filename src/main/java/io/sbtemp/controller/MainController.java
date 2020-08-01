package io.sbtemp.controller;


import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.sbtemp.core.CommonUtils;
import io.sbtemp.service.UserService;


@Controller
public class MainController {
	
private static final Logger LOG = LoggerFactory.getLogger(MainController.class);	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CommonUtils UTILS;	

	@GetMapping(value= {"/home","/index"})
	public String displayHomePage(HttpServletRequest req) {
			return ".Index";
		
	}
	
	@GetMapping(value= {"/welcome","/"})
	public String displayIndexPage(HttpServletRequest req, HttpServletResponse res) throws IOException {
		if(UTILS.currentLoggedInUser()!=null) {
			res.sendRedirect("/home");
			return ".Index";
		}else {
			return ".Welcome";
		}
	}
	
	@PostConstruct
	public void addDefaultRoles() {
		userService.addDefaultRoles();
	}

}
