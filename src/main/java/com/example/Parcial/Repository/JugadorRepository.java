package com.example.Parcial.Repository;

import com.example.Parcial.Model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador ,Long> {
    @Query(value = "SELECT * FROM jugador WHERE id_equipo = :id_equipo", nativeQuery = true)
    List<Jugador> findJugadoresPorEquipo(@Param("id_equipo") Long id_equipo);

}
