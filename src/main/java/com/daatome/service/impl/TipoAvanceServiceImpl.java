package com.daatome.service.impl;

import com.daatome.model.TipoAvance;
import com.daatome.repo.ITipoAvanceRepo;
import com.daatome.service.ITipoAvanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoAvanceServiceImpl implements ITipoAvanceService {
    private ITipoAvanceRepo repo;

    @Override
    public TipoAvance save(TipoAvance tipoAvance) throws Exception {
        return repo.save(tipoAvance);
    }

    @Override
    public TipoAvance update(TipoAvance tipoAvance) throws Exception {
        return repo.save(tipoAvance);
    }

    @Override
    public List<TipoAvance> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public TipoAvance findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new TipoAvance());
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
