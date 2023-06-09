package com.example.projekt.repository;

import com.example.projekt.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
    Optional<User> findUserByEmail(String email);
}
