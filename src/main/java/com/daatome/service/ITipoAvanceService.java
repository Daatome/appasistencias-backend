package com.daatome.service;

import com.daatome.model.Obra;
import com.daatome.model.TipoAvance;

import java.util.List;

public interface ITipoAvanceService {
    TipoAvance save(TipoAvance tipoAvance) throws Exception;
    TipoAvance update(TipoAvance tipoAvance) throws Exception;
    List<TipoAvance> findAll() throws Exception;
    TipoAvance findById(Integer id) throws Exception;
    void deleteById(Integer id) throws Exception;
}
