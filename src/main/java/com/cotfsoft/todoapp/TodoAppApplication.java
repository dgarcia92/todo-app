package com.cotfsoft.todoapp;

import com.cotfsoft.todoapp.entity.Todo;
import com.cotfsoft.todoapp.entity.User;
import com.cotfsoft.todoapp.repository.TodoRepository;
import com.cotfsoft.todoapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

}
