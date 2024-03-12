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
public class Falta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idFalta;

    @Column(nullable = false, length = 70)
    private String fecha ;

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false,foreignKey = @ForeignKey(name = "FK_EMPLEADO_FALTA"))
    private Empleado empleado ;

}

