package br.com.marcoslucas.todolist.taks;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepostory extends JpaRepository<TaskModel, UUID>{
    
}
