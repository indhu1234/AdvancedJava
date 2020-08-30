package com.example.RestApiDemo;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController 
{
	@Autowired
	UserService userSevice;
	@ResponseBody
	@RequestMapping("")
	public List<User> getAllUsers(){
		System.out.println("Controller");
		List<User> li=new LinkedList<>();
		li=userSevice.getAllUsers();
	    //return userSevice.getAllUsers();
		System.out.println("List "+li);
		return li;
	}

}
