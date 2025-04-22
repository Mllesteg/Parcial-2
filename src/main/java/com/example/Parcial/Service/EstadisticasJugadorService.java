package com.example.Parcial.Service;

import com.example.Parcial.Model.EstadisticasJugador;
import com.example.Parcial.Model.Jugador;
import com.example.Parcial.Repository.EstadisticasJugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadisticasJugadorService {

    @Autowired
    public EstadisticasJugadorRepository estadisticasJugadorRepository;

    public EstadisticasJugador guardar(EstadisticasJugador estadisticasJugador) {
        return estadisticasJugadorRepository.save(estadisticasJugador);
    }

    public List<EstadisticasJugador> listar() {
        return estadisticasJugadorRepository.findAll();
    }

    public void eliminar(long id) {
        estadisticasJugadorRepository.deleteById(id);
    }

    public Optional<EstadisticasJugador> buscarPorid(long id) {
        return estadisticasJugadorRepository.findById(id);
    }
    public List<EstadisticasJugador> guardarTodos(List<EstadisticasJugador> estadisticas) {
        return estadisticasJugadorRepository.saveAll(estadisticas);
    }
}
