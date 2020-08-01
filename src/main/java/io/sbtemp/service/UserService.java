package io.sbtemp.service;

import io.sbtemp.entity.User;

public interface UserService {
	
	 public void saveUser(User user);	 
	 
	 public User findByUsername(String username);	 
	 
	 public User findById(Long id);

	 public void addDefaultRoles();
	 
	
}
