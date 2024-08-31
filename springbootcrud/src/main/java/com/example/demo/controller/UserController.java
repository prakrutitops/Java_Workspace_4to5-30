package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserSErvice;

@Controller
public class UserController {
	
	@Autowired
	UserSErvice userSErvice;
	
	@RequestMapping("/")
	public String index(Model model)
	{
	
		model.addAttribute("user", new User());
		model.addAttribute("users", userSErvice.viewAllUser());
		return "index";
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/reg")
	public String registration(@ModelAttribute("user") User u,Model model)
	{
		
		
		if(u.getId()>0)
		{
			model.addAttribute("msg", "Update successfully !!!");
		}
		else
		{
			model.addAttribute("msg", "Registration successfully !!!");
		}
		userSErvice.addOrUpdateUser(u);
		model.addAttribute("user", new User());
		model.addAttribute("users", userSErvice.viewAllUser());
		return "index";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("did") int id)
	{
		userSErvice.deleteUser(id);
		return "redirect:/";
	}
	
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("eid") int id,Model model)
	{
		User u =  userSErvice.userById(id);
		model.addAttribute("user", u);
		model.addAttribute("users", userSErvice.viewAllUser());
		return "index";
	}
	
	
	
	
	
	
	
	
	
}
