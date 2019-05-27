package com.webProject.web;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.webProject.domain.User;
import com.webProject.domain.UserRepository;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	private List<User> users = new ArrayList<User>();

	@Autowired
	private UserRepository useRepository;
	
	@PostMapping("/user/create")
	public String create(User user, Model model) {
		System.out.println("들어왔나?");
		users.add(user);
		logger.info(user + "입니다.");
		useRepository.save(user);
		return "redirect:/user/list";
	}

	@GetMapping("/user/list")
	public String list(Model model) {
//		model.addAttribute("users", users);
		model.addAttribute("users", useRepository.findAll());
		return "/user/list";
	}
}
