package com.sandan.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sandan.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long>{

	UserEntity findByEmail(String email);
	
	UserEntity findByUserId(String userId);
}
