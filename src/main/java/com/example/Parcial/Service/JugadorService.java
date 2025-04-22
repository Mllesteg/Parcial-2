package com.example.Parcial.Service;

import com.example.Parcial.Model.Equipo;
import com.example.Parcial.Model.Jugador;
import com.example.Parcial.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JugadorService {

    @Autowired
    public JugadorRepository jugadorRepository;

    public Jugador guardar(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public List<Jugador> listar() {
        return jugadorRepository.findAll();
    }

    public void eliminar(long id) {
        jugadorRepository.deleteById(id);
    }

    public Optional<Jugador> buscarPorid(long id) {
        return jugadorRepository.findById(id);
    }
    public List<Jugador> guardarTodos(List<Jugador> jugadores) {
        return jugadorRepository.saveAll(jugadores);
    }
    public List<Jugador> buscarPorEquipo(Long id_equipo) {
        return jugadorRepository.findJugadoresPorEquipo(id_equipo);
    }

}
