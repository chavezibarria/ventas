package com.ventas.ventas.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Jose Chavez
 */
@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCliente;

    @Column(name = "nombres", nullable = false, length = 70)
    private String nombres;
    @Column(name = "apellidos", nullable = false, length = 70)
    private String apellidos;
    @Column(name = "direccion", nullable = true, length = 150)
    private String direccion;
    @Column(name = "telefono", nullable = true, length = 10)
    private String telefono;
    @Column(nullable = false, length = 150)
    private String email;

}
