package io.arukas.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by niuyuxian on 17/09/2017.
 */
@Data
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String password;

}
