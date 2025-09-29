package com.servicei;

import java.util.List;
import java.util.Optional;

import com.model.User;

public interface UserServiceI {

	public User saveUserDetails(User user);
	
	public List<User> getAllUsers();

	public Optional<User> getSingleData(int id);

	public User updateUser(int id, User newUser);

   public void deleteUser(int id);

	
}
