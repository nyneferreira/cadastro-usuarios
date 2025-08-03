package com.janinechaves.cadastro_usuarios.infrastructure.gateways;

import com.janinechaves.cadastro_usuarios.application.gateways.UserGateway;
import com.janinechaves.cadastro_usuarios.domain.entity.User;
import com.janinechaves.cadastro_usuarios.infrastructure.persistence.UserEntity;
import com.janinechaves.cadastro_usuarios.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedEntity = userRepository.save(userEntity);

        return userEntityMapper.toDomainObj(savedEntity);
    }
}
