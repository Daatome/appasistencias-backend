package com.daatome.service;

import com.daatome.model.Asistencia;
import com.daatome.model.Avance;

import java.util.List;

public interface IAvanceService {
    Avance save(Avance avance) throws Exception;
    Avance update(Avance avance) throws Exception;
    List<Avance> findAll() throws Exception;
    Avance findById(Integer id) throws Exception;
    void deleteById(Integer id) throws Exception;
}
