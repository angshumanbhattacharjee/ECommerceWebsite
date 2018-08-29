package com.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.model.UserPojo;

public interface UserRepository extends MongoRepository<UserPojo, String> {
	UserPojo findById(int id);
}
