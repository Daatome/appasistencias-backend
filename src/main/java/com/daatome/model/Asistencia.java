package com.daatome.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idAsistencia;

    @Column(nullable = false, length = 70)
    private String fecha ;

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false,foreignKey = @ForeignKey(name = "FK_EMPLEADO_ASISTENCIA"))
    private Empleado empleado ;

}
