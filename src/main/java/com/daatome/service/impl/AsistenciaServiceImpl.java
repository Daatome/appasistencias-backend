package com.daatome.service.impl;

import com.daatome.model.Asistencia;
import com.daatome.repo.IAsistenciaRepo;
import com.daatome.service.IAsistenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AsistenciaServiceImpl implements IAsistenciaService {
    private IAsistenciaRepo repo;
    @Override
    public Asistencia save(Asistencia asistencia) throws Exception {
        return repo.save(asistencia);
    }

    @Override
    public Asistencia update(Asistencia asistencia) throws Exception {
        return repo.save(asistencia);
    }

    @Override
    public List<Asistencia> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Asistencia findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Asistencia());
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
