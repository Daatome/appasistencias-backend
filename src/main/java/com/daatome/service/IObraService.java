package com.daatome.service;

import com.daatome.model.Falta;
import com.daatome.model.Obra;

import java.util.List;

public interface IObraService {
    Obra save(Obra obra) throws Exception;
    Obra update(Obra obra) throws Exception;
    List<Obra> findAll() throws Exception;
    Obra findById(Integer id) throws Exception;
    void deleteById(Integer id) throws Exception;
}
