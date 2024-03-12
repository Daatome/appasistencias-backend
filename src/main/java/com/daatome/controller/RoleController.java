package com.daatome.controller;

import com.daatome.model.Role;
import com.daatome.service.IRoleService;
import com.daatome.service.impl.RoleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RoleController {


    private final IRoleService iRoleService;


    @GetMapping
    public List<Role> findAll() throws Exception{
       // return iRoleService.findAll();
        return iRoleService.findAll();
    }

    @GetMapping("/{id}")
    public Role findById(@PathVariable("id") Integer id) throws Exception{

        return iRoleService.findById(id);
    }

    @PostMapping
    public Role createRole(@RequestBody Role role) throws Exception{
        return iRoleService.save(role);
    }

    @PutMapping("/{id}")
    public Role updateRole(@RequestBody Role role, @PathVariable("id") Integer idRole) throws Exception{
        role.setIdRole(idRole);
        return iRoleService.save(role);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Integer id) throws  Exception{

        iRoleService.deleteById(id);
    }
}
