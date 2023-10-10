package br.com.marcoslucas.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * MOD
 * 
 */
@RestController
@RequestMapping("/users")
public class UserController {
    /*
     * String(texto)
     * integer(int) numeros inteiros
     * double (double) numeros 0.000
     * float(float) numeros 0.0000
     * char(A C)
     * data(data)
     * void 
     */
    /*
    *body  
    */

    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.getUsername());
    }
    
}
