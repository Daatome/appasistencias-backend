package com.daatome.repo;

import com.daatome.model.Asistencia;
import com.daatome.model.Avance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAvanceRepo extends JpaRepository<Avance,Integer> {
}
