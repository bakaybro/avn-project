package com.example.avnproject.controller;

import com.example.avnproject.entity.UserRole;
import com.example.avnproject.model.ResponseMessage;
import com.example.avnproject.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-role")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    @GetMapping("/get-all")
    public ResponseMessage<List<UserRole>> getAll() {
        return new ResponseMessage<List<UserRole>>().prepareSuccessMessage(userRoleService.getAll());
    }

    @PostMapping("/create")
    public ResponseMessage<UserRole> create(@RequestBody UserRole userRole) {
        return new ResponseMessage<UserRole>().prepareSuccessMessage(userRoleService.create(userRole));
    }

    @GetMapping("/{id}")
    public ResponseMessage<UserRole> getById(@PathVariable Long id) {
        return new ResponseMessage<UserRole>().prepareSuccessMessage(userRoleService.getById(id));
    }

    @PutMapping("/update")
    public ResponseMessage<UserRole> updateUser(@RequestBody UserRole user) {
        return new ResponseMessage<UserRole>().prepareSuccessMessage(userRoleService.update(user));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseMessage<UserRole> deleteById(@PathVariable Long id) {
        return new ResponseMessage<UserRole>().prepareSuccessMessage(userRoleService.deleteById(id));
    }
}
