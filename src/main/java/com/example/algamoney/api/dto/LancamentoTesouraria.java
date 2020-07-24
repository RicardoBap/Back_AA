package com.example.algamoney.api.dto;

import java.math.BigDecimal;

import com.example.algamoney.api.model.TipoLancamento;

public class LancamentoTesouraria {	
	
	private TipoLancamento tipo;	
	
	private String descricao;	
	
	private BigDecimal valor;

	public LancamentoTesouraria(TipoLancamento tipo, String descricao, BigDecimal valor) {
		this.tipo = tipo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public TipoLancamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}	

}
