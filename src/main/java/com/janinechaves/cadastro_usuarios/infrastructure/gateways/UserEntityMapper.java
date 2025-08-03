package com.janinechaves.cadastro_usuarios.infrastructure.gateways;

import com.janinechaves.cadastro_usuarios.domain.entity.User;
import com.janinechaves.cadastro_usuarios.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj) {
        return new UserEntity(userDomainObj.email(), userDomainObj.nome());
    }

    User toDomainObj(UserEntity userEntity) {
        return new User(userEntity.getEmail(), userEntity.getNome());
    }
}
