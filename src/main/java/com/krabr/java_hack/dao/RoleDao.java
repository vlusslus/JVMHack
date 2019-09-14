package com.krabr.java_hack.dao;

import com.krabr.java_hack.model.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleDao extends CrudRepository<Role, Long> {

    Optional<Role> getByName(String name);
}
