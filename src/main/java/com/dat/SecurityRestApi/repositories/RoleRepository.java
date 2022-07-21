package com.dat.SecurityRestApi.repositories;

import com.dat.SecurityRestApi.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {

	Role findByRole(String role);
}
