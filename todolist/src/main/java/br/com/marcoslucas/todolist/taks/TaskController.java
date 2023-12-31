package br.com.marcoslucas.todolist.taks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskRepostory taskRepostory;

   
    @PostMapping("/")
    public TaskModel create (@RequestBody TaskModel taskModel, HttpServletRequest resquest){
      System.out.println("Chegou no Controller" + resquest .getAttribute("idUser"));
       var task = this.taskRepostory.save(taskModel);
         return task;
    }
    
}
