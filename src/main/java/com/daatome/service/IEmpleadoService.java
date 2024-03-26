package com.daatome.service;

import com.daatome.model.Avance;
import com.daatome.model.Empleado;

import java.util.List;

public interface IEmpleadoService {
    Empleado save(Empleado empleado) throws Exception;
    Empleado update(Empleado empleado) throws Exception;
    List<Empleado> findAll() throws Exception;
    Empleado findById(Integer id) throws Exception;
    void deleteById(Integer id) throws Exception;
}
