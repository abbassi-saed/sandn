package com.sandan.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sandan.shared.dto.UserDto;

public interface UserService extends UserDetailsService {

	UserDto createUser(UserDto user);

	UserDto getUser(String email);
	
	UserDto getUserByUserId(String userId);
	
	UserDto updateUser(String userId , UserDto userDto);
	
	void deletUser(String userId);
}