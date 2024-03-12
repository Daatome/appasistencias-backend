package com.daatome.service.impl;

import com.daatome.model.Role;
import com.daatome.repo.IRoleRepo;
import com.daatome.service.IRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements IRoleService {

    private final IRoleRepo iRoleRepo;

    @Override
    public Role save(Role role) throws Exception{
        return iRoleRepo.save(role);
    }

    @Override
    public Role update(Role role) throws Exception {
        return iRoleRepo.save(role);
    }

    @Override
    public List<Role> findAll()  throws Exception {
        return iRoleRepo.findAll();
    }

    @Override
    public Role findById(Integer id) throws Exception{
        return iRoleRepo.findById(id).orElse(new Role());
    }

    @Override
    public void deleteById(Integer id) throws Exception{
        iRoleRepo.deleteById(id);
    }
}
