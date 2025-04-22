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

public class EstadisticasJugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_estadistica;
    private  int minutos_jugados;
    private  int goles;
    private  int asistencias;
    private  int tarjetas_amarillas;
    private  int tarjetas_rojas;

    @ManyToOne
    @JoinColumn(name = "id_jugador")
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name = "id_oartido")
    private Partido partido;
}
