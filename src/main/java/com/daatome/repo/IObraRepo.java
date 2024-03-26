package com.daatome.repo;

import com.daatome.model.Obra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IObraRepo extends JpaRepository<Obra,Integer> {
}
