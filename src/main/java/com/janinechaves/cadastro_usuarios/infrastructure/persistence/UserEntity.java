package com.janinechaves.cadastro_usuarios.infrastructure.persistence;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "USUARIO")
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;

    public UserEntity(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

}
