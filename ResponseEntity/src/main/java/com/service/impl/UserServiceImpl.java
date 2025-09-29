package com.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repo.UserRepository;
import com.servicei.UserServiceI;

@Service
public class UserServiceImpl implements UserServiceI{
	
	@Autowired
	UserRepository ur;
	
	@Override
	public User saveUserDetails(User user) {
		return ur.save(user);
	}


	@Override
	public Optional<User> getSingleData(int id) {
		return ur.findById(id);
	}

	
	@Override
	public List<User> getAllUsers() {
		return ur.findAll();
	}


	@Override
	public User updateUser(int id, User newUser) {
		    Optional<User> op = ur.findById(id);

		    if (op.isPresent()) {
		        User u = op.get();
		        u.setUsername(newUser.getUsername());
		        u.setPassword(newUser.getPassword());
		        u.setAge(newUser.getAge());

		        return ur.save(u);
		    }
		    return null;
	}


	@Override
	public void deleteUser(int id) {
		 ur.deleteById(id);
		
	}



	
}
