package com.example.springboottodopracticeapiserver.models;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
public class TodoItem implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;


    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private boolean complete;
    

    @Getter
    @Setter
    private Instant createdDate;

    @Getter
    @Setter
    private Instant modifiedDate;

    public TodoItem(){

    }
 
    @Override
    public String toString(){
        return String.format("TodoItem{id=%d, description='%s', complete='%s', createdDate='%s', modifiedDate='%s'}",
        id, description, complete, createdDate, modifiedDate);
    }

}
