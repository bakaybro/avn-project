package com.example.avnproject.service;

import com.example.avnproject.entity.User;
import com.example.avnproject.model.UserModel;

import java.util.List;

public interface UserService extends BaseService<User> {
    User getInActiveUser();

    User getCurrentUser();

    User getByUsername(String username);

    User getByEmail(String email);

    User deleteById(Long id);
}
