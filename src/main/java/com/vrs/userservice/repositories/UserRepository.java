package com.vrs.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vrs.userservice.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
