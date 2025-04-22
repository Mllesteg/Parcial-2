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

public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_partido;
    private LocalDate fecha;
    private  String estadio;
    private int goles_local;
    private int goles_visita;

    @ManyToOne
    @JoinColumn(name = "equipo_local")
    private Equipo equipolocal;
    @ManyToOne
    @JoinColumn(name = "equipo_visita")
    private Equipo equipovisita;

}
