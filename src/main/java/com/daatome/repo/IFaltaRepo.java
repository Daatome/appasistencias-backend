package com.daatome.repo;

import com.daatome.model.Falta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFaltaRepo  extends JpaRepository<Falta,Integer> {
}
