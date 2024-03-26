package com.daatome.service.impl;

import com.daatome.model.Avance;
import com.daatome.repo.IAvanceRepo;
import com.daatome.service.IAvanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvanceServiceImpl implements IAvanceService {
    
    private IAvanceRepo repo;

    @Override
    public Avance save(Avance avance) throws Exception {
        return repo.save(avance);
    }

    @Override
    public Avance update(Avance avance) throws Exception {
        return repo.save(avance);
    }

    @Override
    public List<Avance> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Avance findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Avance());
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
