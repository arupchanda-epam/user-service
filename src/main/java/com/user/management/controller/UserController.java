package com.user.management.controller;

import com.user.management.model.User;
import com.user.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<Iterable<User>> getUsers(){
        return new ResponseEntity<Iterable<User>>(userService.list(), HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Optional<User>> getUser(@PathVariable long id){
        return new ResponseEntity<Optional<User>>(userService.get(id), HttpStatus.OK);
    }

    @PostMapping("/users")
    @ResponseBody
    public User createUser(@RequestBody User user) {
        User userSaved  = userService.save(user);
        return user;
    }

    @PutMapping("/user/{id}")
    @ResponseBody
    public User updateUser(@RequestBody User user) {
        User userSaved  = userService.save(user);
        return user;
    }

    /*---Delete a User by id---*/
    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        userService.delete(id);
        return ResponseEntity.ok().body("User has been deleted successfully.");
    }

}
