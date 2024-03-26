package com.daatome.service;

import com.daatome.model.Empleado;
import com.daatome.model.Falta;

import java.util.List;

public interface IFaltaService {
    Falta save(Falta falta) throws Exception;
    Falta update(Falta falta) throws Exception;
    List<Falta> findAll() throws Exception;
    Falta findById(Integer id) throws Exception;
    void deleteById(Integer id) throws Exception;
}
