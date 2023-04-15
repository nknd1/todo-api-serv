package com.example.springboottodopracticeapiserver.config;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springboottodopracticeapiserver.models.TodoItem;
import com.example.springboottodopracticeapiserver.repositories.TodoItemRepository;
@Component
public class DataLoader implements CommandLineRunner {
    
    @Autowired
    private TodoItemRepository todoItemRepository;

    @Override
    public void run(String... args) throws Exception{
        List<TodoItem> todos = (List<TodoItem>) todoItemRepository.findAll();

        if (todos.size() == 0) {
            TodoItem todo1 = new TodoItem();

            todo1.setDescription("hello world");
            todo1.setCreatedDate(Instant.now());

            todoItemRepository.save(todo1);
           
        
        }
        if (todos.size() == 0){
            TodoItem todo2 = new TodoItem();

            todo2.setDescription("new todo");
            todo2.setCreatedDate(Instant.now());
            todoItemRepository.save(todo2);
        }
    }
}