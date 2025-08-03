package com.janinechaves.cadastro_usuarios.main;

import com.janinechaves.cadastro_usuarios.application.gateways.UserGateway;
import com.janinechaves.cadastro_usuarios.application.usecases.CreateUserInteractor;
import com.janinechaves.cadastro_usuarios.infrastructure.controllers.UserDTOMapper;
import com.janinechaves.cadastro_usuarios.infrastructure.gateways.UserEntityMapper;
import com.janinechaves.cadastro_usuarios.infrastructure.gateways.UserRepositoryGateway;
import com.janinechaves.cadastro_usuarios.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
