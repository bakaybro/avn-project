package com.example.avnproject.converter;

import com.example.avnproject.entity.User;
import com.example.avnproject.entity.UserRole;
import com.example.avnproject.model.UserRoleModel;

import java.util.function.Function;

public class UserRoleConverter extends BaseConverter<UserRoleModel, UserRole>{
    public UserRoleConverter(Function<UserRoleModel, UserRole> fromModel, Function<UserRole, UserRoleModel> fromEntity) {
        super(fromModel, fromEntity);
    }

    private static UserRoleModel convertToModel(UserRole entityToConvert) {
        if (entityToConvert == null) return null;

        return UserRoleModel.builder()
                .id(entityToConvert.getId())
                .roleName(entityToConvert.getRoleName())
                .userId(entityToConvert.getUser().getId())
                .build();
    }

    private static UserRole convertToEntity(UserRoleModel modelToConvert) {
        if (modelToConvert == null) return null;

        User user = new User();
        user.setId(modelToConvert.getUserId());

        return UserRole.builder()
                .user(user)
                .roleName(modelToConvert.getRoleName())
                .build();
    }
}
