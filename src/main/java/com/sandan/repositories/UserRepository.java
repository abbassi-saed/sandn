package com.sandan.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sandan.entities.UserEntity;

/* after create pagination we should change CrudRepository to  PagingAndSortingRepository */
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {

	UserEntity findByEmail(String email);

	UserEntity findByUserId(String userId);
}
