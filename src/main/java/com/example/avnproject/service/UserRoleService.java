package com.example.avnproject.service;

import com.example.avnproject.entity.UserRole;

public interface UserRoleService extends BaseService<UserRole> {
    UserRole deleteById(Long id);
}
