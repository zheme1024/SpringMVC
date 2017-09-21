package com.z.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.z.bean.QueryVO;
import com.z.bean.User;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping("register")
	public String register(User user, Model model) {	
		
		System.out.println("register==="+user);
		
		return "/userlist";
	}

	@RequestMapping("list")
	public String test( Model model) {	
		ArrayList<User> userList =new ArrayList<>();
		
		userList.add(new User(1,"张三","123"));
		userList.add(new User(2,"李四","456"));
		userList.add(new User(3,"王五","789"));
		model.addAttribute("userlist", userList);
		
		return "userlist";
	}
	
	@RequestMapping("deleteall")
	public String deleteall( int[] ids, Model model) {	
		
		System.out.println("==========ids.length="+ids.length);
		return "user";
	}
	
	@RequestMapping("updateall")
	public String updateall( QueryVO qv, Model model) {	
		
		System.out.println("==========qv="+qv.getUserList());

		return "user";
	}
	
	@RequestMapping("multiquery")
	public String multiquery( QueryVO qv, Model model) {	
		
		System.out.println("====multiquery======qv="+qv);
		
		model.addAttribute("user", qv.getUser());

		return "user";
	}
	
	
	
	
	
}
