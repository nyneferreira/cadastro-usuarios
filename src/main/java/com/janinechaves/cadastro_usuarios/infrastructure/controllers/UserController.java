package com.janinechaves.cadastro_usuarios.infrastructure.controllers;

import com.janinechaves.cadastro_usuarios.application.usecases.CreateUserInteractor;

import com.janinechaves.cadastro_usuarios.domain.entity.User;
import com.janinechaves.cadastro_usuarios.infrastructure.persistence.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UserController {
    private final CreateUserInteractor createUserUseCase;
    private final UserDTOMapper userDTOMapper;

    public UserController(CreateUserInteractor createUserUseCase,UserDTOMapper userDTOMapper) {
        this.createUserUseCase = createUserUseCase;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping
    public CreateUserResponse createUser(@RequestBody CreateUserRequest request) {
        User userBusinessObj = userDTOMapper.toUser(request);
        User user = createUserUseCase.createUser(userBusinessObj);
        return userDTOMapper.toResponse(user);
    }


}
