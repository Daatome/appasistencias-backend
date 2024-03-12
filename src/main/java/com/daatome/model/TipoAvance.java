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
public class TipoAvance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoAvance;

    @Column(nullable = false, length = 70)
    private String valor;
}
