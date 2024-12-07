package com.example.fwrp.repositories;

import com.example.fwrp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;  // Import Optional

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Modify this to return Optional<User> instead of User
    Optional<User> findByEmail(String email);  // Now it returns an Optional
}
