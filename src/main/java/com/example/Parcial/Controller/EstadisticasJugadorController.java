package com.example.Parcial.Controller;

import com.example.Parcial.Model.Equipo;
import com.example.Parcial.Model.EstadisticasJugador;
import com.example.Parcial.Service.EstadisticasJugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estadisticasjugador")
public class EstadisticasJugadorController {

    @Autowired
    private EstadisticasJugadorService estadisticasJugadorService;

    @PostMapping
    public EstadisticasJugador guardar(@RequestBody EstadisticasJugador estadisticasJugador) {
        return estadisticasJugadorService.guardar(estadisticasJugador);
    }

    @GetMapping
    public List<EstadisticasJugador> listar() {
        return estadisticasJugadorService.listar();
    }

    @GetMapping("/{id}")
    public Optional<EstadisticasJugador> buscarPorId(@PathVariable long id) {
        return estadisticasJugadorService.buscarPorid(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        estadisticasJugadorService.eliminar(id);
    }
    @PostMapping("/lista")
    public List<EstadisticasJugador> guardarVarios(@RequestBody List<EstadisticasJugador> estadisticas) {
        return estadisticasJugadorService.guardarTodos(estadisticas);
    }
}
