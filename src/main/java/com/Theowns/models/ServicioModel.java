package com.Theowns.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "servicios")
public class ServicioModel {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "conductor_id", nullable = false)
    private ConductorModel conductor;

    @ManyToOne
    @JoinColumn(name = "mecanico_id", nullable = false)
    private MecanicoModel mecanico;

    @ManyToOne
    @JoinColumn(name = "vehiculo_id", nullable = false)
    private VehiculoModel vehiculo;

    @Column
    private String descripcion;

    @Column
    private String fecha;


}