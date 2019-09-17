package br.usjt.exercicio1.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.exercicio1.model.Periodo;

public interface PrevisaoRepository extends JpaRepository<Periodo, Long> {
}