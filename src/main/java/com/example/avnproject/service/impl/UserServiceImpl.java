package com.example.avnproject.service.impl;

import com.example.avnproject.converter.UserConverter;
import com.example.avnproject.entity.User;
import com.example.avnproject.entity.UserRole;
import com.example.avnproject.model.UserModel;
import com.example.avnproject.repository.UserRepository;
import com.example.avnproject.repository.UserRoleRepository;
import com.example.avnproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public User create(User user) {
        User dataUserByUserName = getByUsername(user.getUsername());
        User dataUserByEmail = getByUsername(user.getUsername());

        if (dataUserByUserName != null)
            throw new IllegalArgumentException("Такой пользователь " + dataUserByUserName.getUsername() + " уже существует");

        if (dataUserByEmail != null)
            throw new IllegalArgumentException("Электронная почта " + dataUserByEmail.getEmail() + " уже используется");

        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        user.setIsStatus(1L);
        userRepository.save(user);

        UserRole userRole = new UserRole();
        userRole.setRoleName("ROLE_USER");
        userRole.setUser(user);
        userRoleRepository.save(userRole);

        return user;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User getInActiveUser() {
        return null;
    }

    @Override
    public User getCurrentUser() {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        return null;
    }

    @Override
    public User deleteById(Long id) {
        return null;
    }
}
