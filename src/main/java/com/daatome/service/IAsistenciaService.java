package com.daatome.service;

import com.daatome.model.Asistencia;
import com.daatome.model.Role;

import java.util.List;

public interface IAsistenciaService {
    Asistencia save(Asistencia asistencia) throws Exception;
    Asistencia update(Asistencia asistencia) throws Exception;
    List<Asistencia> findAll() throws Exception;
    Asistencia findById(Integer id) throws Exception;
    void deleteById(Integer id) throws Exception;
}
