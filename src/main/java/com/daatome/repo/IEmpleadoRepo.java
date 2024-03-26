package com.daatome.repo;

import com.daatome.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepo  extends JpaRepository<Empleado,Integer> {
}
