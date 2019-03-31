package com.app;

import org.springframework.data.repository.CrudRepository;

// The UserInterface interface has extended the CrudRepository class.
// CrudRepository class is examined hierarchically as simpleJPARepository class goes up.
// In other words, this interface CRUD methods have to write and ready to use.
// There is no need for an additional Repository class and DAO procedures.
public interface UserInterface extends CrudRepository<User, Long> {
	
}