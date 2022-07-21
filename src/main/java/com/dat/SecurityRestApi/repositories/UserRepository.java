package com.dat.SecurityRestApi.repositories;

import com.dat.SecurityRestApi.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
}
