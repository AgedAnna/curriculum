package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Curriculo;
import com.example.demo.repository.CurriculoRepository;

@Service
public class CurriculoService {

    @Autowired
    private CurriculoRepository curriculoRepository;

    public Curriculo criarCurriculo(Curriculo curriculo) {

        return curriculoRepository.save(curriculo);
    }

    public List<Curriculo> listarTodos() {
        return curriculoRepository.findAll();
    }

    public Curriculo buscarPorId(Long id) {
        return curriculoRepository.findById(id).orElseThrow(() -> new RuntimeException("Currículo não encontrado!"));
    }

    public Curriculo atualizarCurriculo(Long id, Curriculo curriculoAtualizado) {
        Curriculo curriculo = buscarPorId(id);
        curriculo.setNome(curriculoAtualizado.getNome());
        curriculo.setEmail(curriculoAtualizado.getEmail());
        curriculo.setObjetivo(curriculoAtualizado.getObjetivo());
        curriculo.setExperiencias(curriculoAtualizado.getExperiencias());
        curriculo.setSkills(curriculoAtualizado.getSkills());
        curriculo.setProjetos(curriculoAtualizado.getProjetos());
        curriculo.setFormacoes(curriculoAtualizado.getFormacoes());
        return curriculoRepository.save(curriculo);
    }

    public void deletarCurriculo(Long id) {
        curriculoRepository.deleteById(id);
    }
}
