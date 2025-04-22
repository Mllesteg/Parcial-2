package com.example.Parcial.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_jugador;
    private String nombre;
    private String posicion;
    private int dorsal;
    private LocalDate fecha_nac;
    private String nacionalidad;

    //fk equipo
    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;

}
