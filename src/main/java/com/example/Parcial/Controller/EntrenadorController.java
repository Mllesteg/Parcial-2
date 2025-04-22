package com.example.Parcial.Controller;

import com.example.Parcial.Model.Entrenador;
import com.example.Parcial.Model.Equipo;
import com.example.Parcial.Service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entrenador")
public class EntrenadorController {

    @Autowired
    private EntrenadorService entrenadorService;

    @PostMapping
    public Entrenador guardar(@RequestBody Entrenador entrenador) {
        return entrenadorService.guardar(entrenador);
    }

    @GetMapping
    public List<Entrenador> listar() {
        return entrenadorService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Entrenador> buscarPorId(@PathVariable long id) {
        return entrenadorService.buscarPorid(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        entrenadorService.eliminar(id);
    }
    @PostMapping("/lista")
    public List<Entrenador> guardarVarios(@RequestBody List<Entrenador> entrenadores) {
        return entrenadorService.guardarTodos(entrenadores);
    }
}
