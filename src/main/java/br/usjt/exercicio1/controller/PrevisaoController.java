package br.usjt.exercicio1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.exercicio1.model.Periodo;
import br.usjt.exercicio1.repository.PrevisaoRepository;
import br.usjt.exercicio1.service.PrevisaoService;

@Controller
public class PrevisaoController {

	// a injeção de dependência ocorre aqui
	@Autowired
	private PrevisaoRepository previsaoRepo;

	@GetMapping("/previsao")
	public ModelAndView listarPrevisoes() {
		// passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_previsoes");

		// Busque a coleção com o repositório
		List<Periodo> previsoes = previsaoRepo.findAll();

		// adicione a coleção ao objeto ModelAndView
		mv.addObject("previsoes", previsoes);

		// devolva o ModelAndView
		return mv;
	}

}