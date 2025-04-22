package com.example.Parcial.Controller;

import com.example.Parcial.Model.Equipo;
import com.example.Parcial.Model.Partido;
import com.example.Parcial.Service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/partido")
public class PartidoController {

    @Autowired
    private PartidoService partidoService;

    @PostMapping
    public Partido guardar(@RequestBody Partido partido) {
        return partidoService.guardar(partido);
    }

    @GetMapping
    public List<Partido> listar() {
        return partidoService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Partido> buscarPorId(@PathVariable long id) {
        return partidoService.buscarPorid(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        partidoService.eliminar(id);
    }
    @PostMapping("/lista")
    public List<Partido> guardarVarios(@RequestBody List<Partido> partidos) {
        return partidoService.guardarTodos(partidos);
    }
}
