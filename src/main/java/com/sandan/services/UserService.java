package com.sandan.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sandan.shared.dto.UserDto;

public interface UserService extends UserDetailsService {

	UserDto createUser(UserDto user);

	UserDto getUser(String email);

	UserDto getUserByUserId(String userId);

	UserDto updateUser(String userId, UserDto userDto);

	void deletUser(String userId);

	List<UserDto> getUsers(int page, int limit);
}
