package br.usjt.hellospringboot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(name="tab", initialValue=100, allocationSize=50)
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.TABLE, generator="tab")
	private Long id;
	private String nome;
	private Double mediaNotas;
	
	// getters/setters
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public Double getMediaNotas() {
		return this.mediaNotas;
	}
	
	public void setMediaNotas(Double value) {
		this.mediaNotas = value;
	}
	
}