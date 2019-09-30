package br.usjt.exercicio1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.exercicio1.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);
}