package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.servicei.UserServiceI;

@RestController
public class UserController {
	
	@Autowired
	UserServiceI usi;
	
	
	@PostMapping("/save")
	public ResponseEntity<User> addUserData(@RequestBody User user)
	{
		  User saveedData = usi.saveUserDetails(user);
		  
		  ResponseEntity<User>  re = new ResponseEntity<User>(saveedData, HttpStatus.CREATED);
		  
		  return re;
	}
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getSingleUser(@PathVariable("id") int id )
	{
		
		Optional<User> op = usi.getSingleData(id);
		
		if(op.isPresent()) 
		{ 
	          User user  = op.get();
	          return new ResponseEntity<String>(""+user, HttpStatus.ACCEPTED);
		}else
		{
			 return new ResponseEntity<String>("user is  not present for perticular id: "+id, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = usi.getAllUsers();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
	
	
	@PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") int id, @RequestBody User newUser) {
        User updatedUser = usi.updateUser(id, newUser);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id) {
	     usi.deleteUser(id);
	    return new ResponseEntity<>("Data Deleted Successfully", HttpStatus.OK);
	}
	
	
}
