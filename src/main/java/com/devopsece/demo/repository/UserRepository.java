package com.devopsece.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devopsece.demo.domain.User;
@Repository
public interface UserRepository extends JpaRepository<User, String>{
User findByUsernameAndPassword(String username, String password);

}


