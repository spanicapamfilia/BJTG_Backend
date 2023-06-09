package org.example.controller;

import org.example.model.Users;
import org.example.repository.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class GenerateAPI {

   @Autowired
   private RepoUser repoUser;

    @CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
    @GetMapping
    public Iterable<Users> findAll() {
        return repoUser.findAll();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
    @PostMapping("/login")
    public Map<String,Object> find(@RequestBody Users Users){
        Map<String,Object> authStatus = new HashMap<>();
        System.out.println(Users.getUsername());
        if (repoUser.findAllById(Users.getUsername(), Users.getPassword()).size() > 0){
            Users userlogin = new Users();
            userlogin = repoUser.findAllById(Users.getUsername(), Users.getPassword()).get(0);
            authStatus.put("Status","OK");
            authStatus.put("Login","Welcome user "+userlogin.getUsername());
        } else {
            authStatus.put("Status","Authentication Failed");
            authStatus.put("Login","Wrong Username or Password");
        }
        return authStatus;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
    @DeleteMapping(value = "/{username}")
    public Map<String,Object> delete(@PathVariable("username") String username){
        Map<String,Object> mapStatus = new HashMap<>();
        repoUser.deleteById(username);
        mapStatus.put("status","Success");
        mapStatus.put("description","Delete data for User "+username);
        return mapStatus;
    }

    @PostMapping("/logout")
    public String logout() {

        return "Logout successful!";
    }

}
