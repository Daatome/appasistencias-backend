package com.daatome.repo;

import com.daatome.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepo extends JpaRepository<Role,Integer> {
}
