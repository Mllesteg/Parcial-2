package com.example.Parcial.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id_equipo;
    private String nombre;
    private  String ciudad;
    private LocalDate fundacion;
}
