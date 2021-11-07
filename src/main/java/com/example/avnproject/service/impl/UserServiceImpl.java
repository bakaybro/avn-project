package com.example.avnproject.service.impl;

import com.example.avnproject.entity.User;
import com.example.avnproject.entity.UserRole;
import com.example.avnproject.repository.RoleRepository;
import com.example.avnproject.repository.UserRepository;
import com.example.avnproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User create(User user) {
        User dataUserByUserName = getByUsername(user.getFullName());
        User dataUserByEmail = getByUsername(user.getFullName());

        if (dataUserByUserName != null)
            throw new IllegalArgumentException("Такой пользователь " + dataUserByUserName.getFullName() + " уже существует");

        if (dataUserByEmail != null)
            throw new IllegalArgumentException("Электронная почта " + dataUserByEmail.getFullName() + " уже используется");

        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        user.setIsStatus(1L);
        userRepository.save(user);

        UserRole userRole = new UserRole();
        userRole.setRoleName("ROLE_USER");
        userRole.setUser(user);
        roleRepository.save(userRole);

        return user;
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(User user) {
        User userUpdate = userRepository.findById(user.getId()).orElse(null);

        if (user.getFullName() != null)
            if (userUpdate != null) {
                userUpdate.setFullName(user.getFullName());
            }

        if (user.getCreateDate() != null)
            if (userUpdate != null) {
                userUpdate.setCreateDate(user.getCreateDate());
            }

        if (user.getPassword() != null)
            if (userUpdate != null) {
                userUpdate.setPassword(user.getPassword());
            }

        if (user.getEmail() != null)
            if (userUpdate != null) {
                userUpdate.setEmail(user.getEmail());
            }

        if (user.getUpdateDate() != null)
            if (userUpdate != null) {
                userUpdate.setUpdateDate(user.getUpdateDate());
            }

        if (userUpdate != null)
            return userRepository.save(userUpdate);

        return null;
    }

//    @Override
//    public User getByUsername(String name) {
//        return userRepository.findByUsername(name).orElse(null);
//    }
//
//    @Override
//    public User getByEmail(String email) {
//        return userRepository.findByEmail(email).orElse(null);
//    }

    @Override
    public User getCurrentUser() {
        String login = SecurityContextHolder.getContext().getAuthentication().getName();
        return getByUsername(login);
    }

    @Override
    public User getByUsername(String name) {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        return null;
    }

    @Override
    public User setInActiveUser() {
        User user = getCurrentUser();
        user.setIsStatus(0L);
        return update(user);
    }
}
