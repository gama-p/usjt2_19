package br.usjt.exercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.exercicio1.model.Usuario;
import br.usjt.exercicio1.repository.UsuarioRepository;

@Service
public class LoginService {
	@Autowired
	UsuarioRepository usuarioRepo;

	public boolean logar(Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}