package com.example.Parcial.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Entrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_entrenador;
    private String nombre;
    private String especialidad;
    //fk id:equipo
    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;
}
