package com.italo.projetoEstado.dto;

import com.italo.projetoEstado.model.Estado;

import java.io.Serializable;

public class EstadoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String estado;
    private String regiao;
    private Long populacao;
    private String capital;
    private Double area;

    public EstadoDTO(String estado, String regiao, Long populacao, String capital, Double area) {
        this.estado = estado;
        this.regiao = regiao;
        this.populacao = populacao;
        this.capital = capital;
        this.area = area;
    }
    public EstadoDTO(Estado entidade) {
        estado = entidade.getEstado();
        regiao = entidade.getRegiao();
        populacao = entidade.getPopulacao();
        capital = entidade.getCapital();
        area = entidade.getArea();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
