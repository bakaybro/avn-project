package com.example.avnproject.service;

import com.example.avnproject.entity.User;
import com.example.avnproject.model.UserModel;

import java.util.List;

public interface UserService extends BaseService<User> {

//    User create(UserModel userModel);
//
//    User getById(Long id);
//
//    List<User> getAll();
//
//    User update(User t);

    User getInActiveUser();

    User getCurrentUser();

    User getByUsername(String username);

    User getByEmail(String email);

    User deleteById(Long id);
}
