package com.example.avnproject.service;

import com.example.avnproject.entity.User;

public interface UserService extends BaseService<User> {
    User setInActiveUser();

    User getCurrentUser();

    User getByUsername(String name);

    User getByEmail(String email);
}
