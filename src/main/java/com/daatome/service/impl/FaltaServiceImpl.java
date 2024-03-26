package com.daatome.service.impl;

import com.daatome.model.Falta;
import com.daatome.repo.IFaltaRepo;
import com.daatome.service.IFaltaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FaltaServiceImpl implements IFaltaService {
    private IFaltaRepo repo;

    @Override
    public Falta save(Falta falta) throws Exception {
        return repo.save(falta);
    }

    @Override
    public Falta update(Falta falta) throws Exception {
        return repo.save(falta);
    }

    @Override
    public List<Falta> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Falta findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Falta());
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
