package com.zyratechnologies.jwtproject1.repository;

import com.zyratechnologies.jwtproject1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String email);
    boolean existsByUserName(String email);
    boolean existsByEmail(String email);
}
