package com.daatome.service;

import com.daatome.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRoleService {

    Role save(Role role) throws Exception;
    Role update(Role role) throws Exception;
    List<Role> findAll() throws Exception;
    Role findById(Integer id) throws Exception;
    void deleteById(Integer id) throws Exception;
}
