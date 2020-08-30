package com.example.RestApiDemo;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{

	@Override
	public List<User> getAllUsers() {
		System.out.println("Service");
		 return this.users;
	}
	// Dummy users
	  public static List<User> users; 
	  public UserServiceImpl() {
	    users = new LinkedList<>();   
	    users.add(new User(100, "David"));
	    users.add(new User(101, "Peter"));
	    users.add(new User(102, "John"));
	  }

}
