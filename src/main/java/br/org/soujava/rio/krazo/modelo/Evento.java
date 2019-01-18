package br.org.soujava.rio.krazo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.ws.rs.FormParam;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @FormParam("palestrante")
    private String palestrante;
    
    @FormParam("tituloPalestra")
    private String tituloPalestra;
  
    @FormParam("descricao")
    private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPalestrante() {
		return palestrante;
	}

	public void setPalestrante(String palestrante) {
		this.palestrante = palestrante;
	}

	public String getTituloPalestra() {
		return tituloPalestra;
	}

	public void setTituloPalestra(String tituloPalestra) {
		this.tituloPalestra = tituloPalestra;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
