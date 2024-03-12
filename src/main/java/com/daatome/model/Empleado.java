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
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idEmpleado;

    @Column(nullable = false, length = 70)
    private String nombre;

    @Column(nullable = false, length = 70)
    private String apellidoPaterno;

    @Column(nullable = false, length = 70)
    private String apellidoMaterno;

    @Column
    private String user;

    @Column(nullable = false, length = 12)
    private Integer telefono;

    @ManyToOne
    @JoinColumn(name = "id_role", nullable = false,foreignKey = @ForeignKey(name = "FK_ROLE"))
    private Role role ;

    @ManyToOne
    @JoinColumn(name = "id_obra", nullable = false,foreignKey = @ForeignKey(name = "FK_OBRA"))
    private Obra obra ;
}
