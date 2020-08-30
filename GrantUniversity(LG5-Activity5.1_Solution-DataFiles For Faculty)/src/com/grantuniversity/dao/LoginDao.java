package com.grantuniversity.dao;

import com.grantuniversity.model.Student;

public interface LoginDao {

	Student validUser(String username,String password);
	
}
