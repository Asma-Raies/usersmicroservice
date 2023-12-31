package com.asma.users.repos;

import com.asma.users.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface userRepository extends JpaRepository<User, Long> {
User findByUsername(String username);
}
