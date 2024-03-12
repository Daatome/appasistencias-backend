package com.daatome.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Avance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAvance;

    @Column(nullable = false, length = 70)
    private String titulo;

    @Column(nullable = false, length = 70)
    private String descripcion ;

    @ManyToOne
    @JoinColumn(name = "id_tipo_avance", nullable = false,foreignKey = @ForeignKey(name = "FK_TIPO_AVANCE"))
    private TipoAvance tipoAvance ;

    @Column
    private String foto ;
}
