package com.example.springboottodopracticeapiserver.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboottodopracticeapiserver.models.TodoItem;
@Repository
public interface  TodoItemRepository extends CrudRepository<TodoItem, Long>{
    
}
