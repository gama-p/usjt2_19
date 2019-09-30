package br.usjt.exercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.exercicio1.model.Periodo;
import br.usjt.exercicio1.repository.PrevisaoRepository;

@Service
public class PrevisaoService {
	// a injeção de dependência ocorre aqui
	@Autowired
	private PrevisaoRepository repository;
	
	public List<Periodo> listarTodos() {
		List<Periodo> periodos = repository.findAll();
		
		return periodos;
	}

}