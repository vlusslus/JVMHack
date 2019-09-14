package com.krabr.java_hack.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "LOGIN"))
public class User {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name="LOGIN", nullable = false)
    private String login;

    @Getter
    @Setter
    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Getter
    @Setter
    @Column(name="FIRST_NAME", nullable = false)
    private String firstName;

    @Getter
    @Setter
    @Column(name="LAST_NAME", nullable = false)
    private String lastName;

    @Getter
    @Setter
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE ,CascadeType.PERSIST})
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")
    )
    private List<Role> roles;

}
