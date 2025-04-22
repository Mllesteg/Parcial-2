package com.example.Parcial.Controller;

import com.example.Parcial.Model.Equipo;
import com.example.Parcial.Model.Jugador;
import com.example.Parcial.Service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jugador")
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    @PostMapping
    public Jugador guardar(@RequestBody Jugador jugador) {
        return jugadorService.guardar(jugador);
    }

    @GetMapping
    public List<Jugador> listar() {
        return jugadorService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Jugador> buscarPorId(@PathVariable long id) {
        return jugadorService.buscarPorid(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        jugadorService.eliminar(id);
    }
    @PostMapping("/lista")
    public List<Jugador> guardarVarios(@RequestBody List<Jugador> jugadores) {
        return jugadorService.guardarTodos(jugadores);
    }
    @GetMapping("/equipo/{id_equipo}")
    public List<Jugador> buscarPorEquipo(@PathVariable Long id_equipo) {
        return jugadorService.buscarPorEquipo(id_equipo);
    }

}
