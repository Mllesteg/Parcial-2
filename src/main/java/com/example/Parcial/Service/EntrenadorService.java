package com.example.Parcial.Service;

import com.example.Parcial.Model.Entrenador;
import com.example.Parcial.Model.Jugador;
import com.example.Parcial.Repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntrenadorService {

    @Autowired
    public EntrenadorRepository entrenadorRepository;

    public Entrenador guardar(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    public List<Entrenador> listar() {
        return entrenadorRepository.findAll();
    }

    public void eliminar(long id) {
        entrenadorRepository.deleteById(id);
    }

    public Optional<Entrenador> buscarPorid(long id) {
        return entrenadorRepository.findById(id);
    }
    public List<Entrenador> guardarTodos(List<Entrenador> entrenadores) {
        return entrenadorRepository.saveAll(entrenadores);
    }
}
