package com.zergatstage.s07secweb.repositories;

import com.zergatstage.s07secweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * Implements a method that returns user by its email
     * @param userEmail
     * @return
     */
    Optional<User> findByUserEmail(String userEmail);
}
