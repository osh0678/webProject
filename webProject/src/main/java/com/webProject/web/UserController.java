package com.webProject.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@PostMapping("/create")
	public String create(User user, Model model) {
		String msg = user.toString();
		
		model.addAttribute("msg", msg);
		logger.info(msg);
		
		
		return "index";
	}

}
