package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Curriculo;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
}
