package com.daatome.service.impl;

import com.daatome.model.Empleado;
import com.daatome.repo.IEmpleadoRepo;
import com.daatome.service.IEmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements IEmpleadoService {

    private IEmpleadoRepo repo;

    @Override
    public Empleado save(Empleado empleado) throws Exception {
        return repo.save(empleado);
    }

    @Override
    public Empleado update(Empleado empleado) throws Exception {
        return repo.save(empleado);
    }

    @Override
    public List<Empleado> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Empleado findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Empleado());
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
