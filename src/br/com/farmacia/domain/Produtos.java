/**
 * 
 */
package br.com.farmacia.domain;

import java.math.BigDecimal;

/**
 * @author pandersen
 *
 */
public class Produtos {

	private Long codigo;
	private String descricao;
	private Long quantidade;
	private BigDecimal preco;
	private Fornecedores fonecedores;

	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the quantidade
	 */
	public Long getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade
	 *            the quantidade to set
	 */
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * @return the preco
	 */
	public BigDecimal getPreco() {
		return preco;
	}

	/**
	 * @param preco
	 *            the preco to set
	 */
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	/**
	 * @return the fonecedores
	 */
	public Fornecedores getFonecedores() {
		return fonecedores;
	}

	/**
	 * @param fonecedores
	 *            the fonecedores to set
	 */
	public void setFonecedores(Fornecedores fonecedores) {
		this.fonecedores = fonecedores;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Produtos [codigo=" + codigo + ", descricao=" + descricao + ", quantidade=" + quantidade + ", preco="
				+ preco + ", fonecedores=" + fonecedores + "]";
	}

}
