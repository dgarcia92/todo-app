package com.cotfsoft.todoapp.repository;

import com.cotfsoft.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
