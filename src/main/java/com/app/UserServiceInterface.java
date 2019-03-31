package com.app;

// The UserService interface is defined.
// When using the Spring Boot, the Service layer may not be used, but is used in this project.
public interface UserServiceInterface {
	public Iterable<User> getAllUsers();
	public User getUserById(long id);
	public User saveUser(User user);
	public void deleteUser(long id);
}