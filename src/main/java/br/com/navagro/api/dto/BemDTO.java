package br.com.navagro.api.dto;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

// 1. BemDTO
@Getter
@Setter
public class BemDTO {
    private Integer id;
    private String descricao;
    private String unidade;
    private BigDecimal quantidade;
    private BigDecimal valorNovo;
    private BigDecimal valorSucata;
    private Integer vidaUtil;
    private BigDecimal depreciacaoAnual;
    private BigDecimal depreciacaoMensal;
    private Integer systemUnitId;
    private Integer centroCustosId;
    private LocalDate dataIni;
    private LocalDate dataFin;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private BigDecimal kmAtual;
    private BigDecimal vidaUtil2;
    private LocalDate ultimoLancamento;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValorNovo() {
		return valorNovo;
	}
	public void setValorNovo(BigDecimal valorNovo) {
		this.valorNovo = valorNovo;
	}
	public BigDecimal getValorSucata() {
		return valorSucata;
	}
	public void setValorSucata(BigDecimal valorSucata) {
		this.valorSucata = valorSucata;
	}
	public Integer getVidaUtil() {
		return vidaUtil;
	}
	public void setVidaUtil(Integer vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	public BigDecimal getDepreciacaoAnual() {
		return depreciacaoAnual;
	}
	public void setDepreciacaoAnual(BigDecimal depreciacaoAnual) {
		this.depreciacaoAnual = depreciacaoAnual;
	}
	public BigDecimal getDepreciacaoMensal() {
		return depreciacaoMensal;
	}
	public void setDepreciacaoMensal(BigDecimal depreciacaoMensal) {
		this.depreciacaoMensal = depreciacaoMensal;
	}
	public Integer getSystemUnitId() {
		return systemUnitId;
	}
	public void setSystemUnitId(Integer systemUnitId) {
		this.systemUnitId = systemUnitId;
	}
	public Integer getCentroCustosId() {
		return centroCustosId;
	}
	public void setCentroCustosId(Integer centroCustosId) {
		this.centroCustosId = centroCustosId;
	}
	public LocalDate getDataIni() {
		return dataIni;
	}
	public void setDataIni(LocalDate dataIni) {
		this.dataIni = dataIni;
	}
	public LocalDate getDataFin() {
		return dataFin;
	}
	public void setDataFin(LocalDate dataFin) {
		this.dataFin = dataFin;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}
	public BigDecimal getKmAtual() {
		return kmAtual;
	}
	public void setKmAtual(BigDecimal kmAtual) {
		this.kmAtual = kmAtual;
	}
	public BigDecimal getVidaUtil2() {
		return vidaUtil2;
	}
	public void setVidaUtil2(BigDecimal vidaUtil2) {
		this.vidaUtil2 = vidaUtil2;
	}
	public LocalDate getUltimoLancamento() {
		return ultimoLancamento;
	}
	public void setUltimoLancamento(LocalDate ultimoLancamento) {
		this.ultimoLancamento = ultimoLancamento;
	}
    
    
}

