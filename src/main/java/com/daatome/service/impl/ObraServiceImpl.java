package com.daatome.service.impl;

import com.daatome.model.Obra;
import com.daatome.repo.IObraRepo;
import com.daatome.service.IObraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ObraServiceImpl implements IObraService {
    private IObraRepo repo;

    @Override
    public Obra save(Obra obra) throws Exception {
        return repo.save(obra);
    }

    @Override
    public Obra update(Obra obra) throws Exception {
        return repo.save(obra);
    }

    @Override
    public List<Obra> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Obra findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Obra());
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
