package com.janinechaves.cadastro_usuarios.application.gateways;

import com.janinechaves.cadastro_usuarios.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
