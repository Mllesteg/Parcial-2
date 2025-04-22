package com.example.Parcial.Service;

import com.example.Parcial.Model.Jugador;
import com.example.Parcial.Model.Partido;
import com.example.Parcial.Repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartidoService {

    @Autowired
    public PartidoRepository partidoRepository;

    public Partido guardar(Partido partido) {
        return partidoRepository.save(partido);
    }

    public List<Partido> listar() {
        return partidoRepository.findAll();
    }

    public void eliminar(long id) {
        partidoRepository.deleteById(id);
    }

    public Optional<Partido> buscarPorid(long id) {
        return partidoRepository.findById(id);
    }
    public List<Partido> guardarTodos(List<Partido> partidos) {
        return partidoRepository.saveAll(partidos);
    }
}
