package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Curriculo;
import com.example.demo.service.CurriculoService;

import java.util.List;

@RestController
@RequestMapping("/api/curriculos")
public class CurriculoController {

    @Autowired
    private CurriculoService curriculoService;

    @PostMapping
    public ResponseEntity<Curriculo> criarCurriculo(@RequestBody Curriculo curriculo) {
        return ResponseEntity.ok(curriculoService.criarCurriculo(curriculo));
    }

    @GetMapping
    public ResponseEntity<List<Curriculo>> listarTodos() {
        List<Curriculo> curriculos = curriculoService.listarTodos();
        return ResponseEntity.ok(curriculos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curriculo> buscarPorId(@PathVariable Long id) {
        Curriculo curriculo = curriculoService.buscarPorId(id);
        return ResponseEntity.ok(curriculo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curriculo> atualizarCurriculo(@PathVariable Long id, @RequestBody Curriculo curriculo) {
        Curriculo curriculoAtualizado = curriculoService.atualizarCurriculo(id, curriculo);
        return ResponseEntity.ok(curriculoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCurriculo(@PathVariable Long id) {
        curriculoService.deletarCurriculo(id);
        return ResponseEntity.noContent().build();
    }
}
