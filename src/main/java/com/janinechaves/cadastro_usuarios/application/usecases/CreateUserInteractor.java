package com.janinechaves.cadastro_usuarios.application.usecases;

import com.janinechaves.cadastro_usuarios.application.gateways.UserGateway;
import com.janinechaves.cadastro_usuarios.domain.entity.User;

public class CreateUserInteractor {
    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway){
        this.userGateway = userGateway;
    }

    public User createUser(User user){
        return userGateway.createUser(user);
    }
}
