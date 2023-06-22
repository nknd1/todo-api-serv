package com.example.springboottodopracticeapiserver.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboottodopracticeapiserver.models.TodoItem;
import com.example.springboottodopracticeapiserver.repositories.TodoItemRepository;

@Service
public class TodoService {
    @Autowired
    private TodoItemRepository todoItemRepository;

    public List<TodoItem> getAllTodos(){
        return (List<TodoItem>) todoItemRepository.findAll();
    }
    
    public TodoItem getTodoById(Long id){
        return todoItemRepository.findById(id).orElseThrow(null);
    }
    
    public TodoItem createTodo(TodoItem todoItem){
        return todoItemRepository.save(todoItem);
    }
    
    public TodoItem updateTodoItemById(Long id, TodoItem todoItem){
        TodoItem existingTodoItem = todoItemRepository.findById(id).orElseThrow(null);
        existingTodoItem.setDescription(todoItem.getDescription());
        existingTodoItem.setComplete(todoItem.isComplete());
        return todoItemRepository.save(existingTodoItem);
    }

    public void deleteTodoItemById(Long id){
        todoItemRepository.deleteById(id);
    }
}

