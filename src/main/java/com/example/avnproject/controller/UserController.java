package com.example.avnproject.controller;

import com.example.avnproject.converter.UserConverter;
import com.example.avnproject.entity.User;
import com.example.avnproject.model.ResponseMessage;
import com.example.avnproject.model.UserModel;
import com.example.avnproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired(required = false)
    private UserService userService;

    @GetMapping("/get-all")
    public ResponseMessage<List<User>> getAll() {
        return new ResponseMessage<List<User>>().prepareSuccessMessage(userService.getAll());
    }

    @PostMapping("/create")
    public ResponseMessage<UserModel> createUser(@RequestBody UserModel userModel) {
        ResponseMessage<UserModel> responseMessage = new ResponseMessage<>();
        User user = new UserConverter().convertFromModel(userModel);
        try {
            return responseMessage
                    .prepareSuccessMessage(new UserConverter()
                            .convertToEntity(userService.create(user)));
        } catch (IllegalArgumentException e) {
            return responseMessage.prepareFailMessage(e.getMessage());
        } catch (Exception e) {
            return responseMessage.prepareFailMessage(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseMessage<User> getById(@PathVariable Long id) {
        return new ResponseMessage<User>().prepareSuccessMessage(userService.getById(id));
    }

    @GetMapping("/get-current")
    public UserModel getCurrentUser() {
        return new UserConverter().convertToEntity(userService.getCurrentUser());
    }

    @PutMapping("/update")
    public ResponseMessage<User> updateUser(@RequestBody User user) {
        return new ResponseMessage<User>().prepareSuccessMessage(userService.update(user));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseMessage<User> deleteById(@PathVariable Long id) {
        return new ResponseMessage<User>().prepareSuccessMessage(userService.deleteById(id));
    }
}
