package com.example.avnproject.converter;

import com.example.avnproject.entity.User;
import com.example.avnproject.entity.UserRole;
import com.example.avnproject.model.UserModel;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class UserConverter extends BaseConverter<UserModel, User>{

    public UserConverter(Function<UserModel, User> fromModel, Function<User, UserModel> fromEntity) {
        super(fromModel, fromEntity);
    }

    public UserConverter() {
        super(UserConverter::convertToEntity, UserConverter::convertToModel);
    }

    private static UserModel convertToModel(User entityToConvert) {
        if (entityToConvert == null) return null;

        return UserModel.builder()
                .username(entityToConvert.getUsername())
                .email(entityToConvert.getEmail())
                .isStatus(entityToConvert.getIsStatus())
                .build();
    }

    private static User convertToEntity(UserModel modelToConvert) {
        if (modelToConvert == null) return null;

        User userToReturn = new User();
        userToReturn.setUsername(modelToConvert.getUsername());
        userToReturn.setEmail(modelToConvert.getEmail());
        userToReturn.setIsStatus(modelToConvert.getIsStatus());

        UserRole userRole = new UserRole();
        userRole.setId(modelToConvert.getUserRoleId());
        userToReturn.setUserRole(userRole);

        return userToReturn;
    }
}
