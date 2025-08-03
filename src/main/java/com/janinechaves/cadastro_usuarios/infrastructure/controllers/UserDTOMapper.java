package com.janinechaves.cadastro_usuarios.infrastructure.controllers;

import com.janinechaves.cadastro_usuarios.domain.entity.User;

public class UserDTOMapper {
    CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(user.email(), user.nome());
    }

    public User toUser(CreateUserRequest request) {
        return new User(request.email(), request.nome());
    }
}
