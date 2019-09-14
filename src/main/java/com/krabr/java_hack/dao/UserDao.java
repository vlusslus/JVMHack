package com.krabr.java_hack.dao;

import com.krabr.java_hack.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserDao extends CrudRepository<User, Long> {

    Optional<User> findByLogin(String login);

    boolean existsByLogin(String login);
}
