package com.restapp.ticketmanagement.service;

import java.util.List;

import com.restapp.ticketmanagement.model.User;



public interface UserService {

	List<User> getAllUsers();

	User getUser(Integer userid);
	
	void createUser(Integer userid, String username);
	
	void updateUser(Integer userid, String username);
	
	void deleteUser(Integer userid);
}
