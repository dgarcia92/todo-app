package com.cotfsoft.todoapp.repository;

import com.cotfsoft.todoapp.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
