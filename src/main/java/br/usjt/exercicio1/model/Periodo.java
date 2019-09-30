package br.usjt.exercicio1.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(name="tab", initialValue=100, allocationSize=50)
public class Periodo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="tab")
	private Long id;
		
	@Column(name="nomedodia")
	public String nomeDia;
	@Column(name = "temperaturaminima")
	private Double temperaturaMinima;
	@Column(name = "temperaturamaxima")
	private Double temperaturaMaxima;
	@Column(name = "umidaderelativadoar")
	private Double umidadeRelativaDoAr;
	@Column(name = "descricao")
	private String descricao;
	private String dataHora;
	private String latitude;
	private String longitude;
	
	// getters/setters
	public String getNomeDia() {
		return this.nomeDia;
	}
	
	public void setNomeDia(String value) {
		this.nomeDia = value;
	}
	
	public Double getTemperaturaMinima() {
		return this.temperaturaMinima;
	}
	
	public void setTemperaturaMinima(Double value) {
		this.temperaturaMinima = value;
	}
	
	public Double getTemperaturaMaxima() {
		return this.temperaturaMaxima;
	}
	
	public void setTemparaturaMaxima(Double value) {
		this.temperaturaMaxima = value;
	}
	
	public Double getUmidadeRelativaDoAr() {
		return this.umidadeRelativaDoAr;
	}
	
	public void setUmidadeRelativaDoAr(Double value) {
		this.umidadeRelativaDoAr = value;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
}