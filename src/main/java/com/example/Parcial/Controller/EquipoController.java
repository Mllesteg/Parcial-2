package com.example.Parcial.Controller;

import com.example.Parcial.Model.Equipo;
import com.example.Parcial.Service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/equipo")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    // POST /api/equipos
    @PostMapping
    public Equipo guardar(@RequestBody Equipo equipo) {
        return equipoService.guardar(equipo);
    }

    // GET /api/equipos
    @GetMapping
    public List<Equipo> listar() {
        return equipoService.listar();
    }

    // GET /api/equipos/{id}
    @GetMapping("/{id}")
    public Optional<Equipo> buscarPorId(@PathVariable long id) {
        return equipoService.buscarPorid(id);
    }

    // DELETE /api/equipos/{id}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        equipoService.eliminar(id);
    }

    // POST /api/equipos/lista
    @PostMapping("/lista")
    public List<Equipo> guardarVarios(@RequestBody List<Equipo> equipos) {
        return equipoService.guardarTodos(equipos);
    }
}
