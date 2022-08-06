package com.lig.demo1.controller;

import com.lig.demo1.entity.User;
import com.lig.demo1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lig
 * @Description TODO
 * @date 2022/8/6
 */
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody User user) {
        userService.add(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete(Long id) {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Object> update(User user) {
        userService.update(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> get(@PathVariable Long id) {
        User user = userService.get(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<Object> list(User user) {
        List<User> userList = userService.list(user);
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

}
