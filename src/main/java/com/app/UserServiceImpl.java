package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// CRUD operations are defined in the service layer.
@Service
public class UserServiceImpl implements UserServiceInterface {
	private UserInterface userRepo;
	
	// Spring Setter Injection
	@Autowired
	public void setUserRepo(UserInterface userRepo) {
		this.userRepo = userRepo;
	}

	// List all users
	@Override
	public Iterable<User> getAllUsers() {
		return userRepo.findAll();
	}

	// It brings a user according to the "id" information.
	@Override
	public User getUserById(long id) {
		return userRepo.findOne(id);
	}

	// Records user information.
	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	// Deletes the user according to "id" information.
	@Override
	public void deleteUser(long id) {		
		 userRepo.delete(id);		
	}	
}