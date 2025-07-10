package br.com.navagro.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class AlocacaoItensDTO {
    private Integer id;
    private Integer alocacaoId;
    private BigDecimal valorUnit;
    private BigDecimal valorTotal;
    private BigDecimal qtd;
    private String unidade;
    private Integer centroCustosId;
    private Integer centroLucrosId;
    private Integer insumosId;
    private Integer unidadeNegocioId;
    private Integer systemUnitId;
    private String tipo;
    private String tes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private LocalDate data;
    private Integer pessoasId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAlocacaoId() {
		return alocacaoId;
	}
	public void setAlocacaoId(Integer alocacaoId) {
		this.alocacaoId = alocacaoId;
	}
	public BigDecimal getValorUnit() {
		return valorUnit;
	}
	public void setValorUnit(BigDecimal valorUnit) {
		this.valorUnit = valorUnit;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public BigDecimal getQtd() {
		return qtd;
	}
	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public Integer getCentroCustosId() {
		return centroCustosId;
	}
	public void setCentroCustosId(Integer centroCustosId) {
		this.centroCustosId = centroCustosId;
	}
	public Integer getCentroLucrosId() {
		return centroLucrosId;
	}
	public void setCentroLucrosId(Integer centroLucrosId) {
		this.centroLucrosId = centroLucrosId;
	}
	public Integer getInsumosId() {
		return insumosId;
	}
	public void setInsumosId(Integer insumosId) {
		this.insumosId = insumosId;
	}
	public Integer getUnidadeNegocioId() {
		return unidadeNegocioId;
	}
	public void setUnidadeNegocioId(Integer unidadeNegocioId) {
		this.unidadeNegocioId = unidadeNegocioId;
	}
	public Integer getSystemUnitId() {
		return systemUnitId;
	}
	public void setSystemUnitId(Integer systemUnitId) {
		this.systemUnitId = systemUnitId;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTes() {
		return tes;
	}
	public void setTes(String tes) {
		this.tes = tes;
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
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Integer getPessoasId() {
		return pessoasId;
	}
	public void setPessoasId(Integer pessoasId) {
		this.pessoasId = pessoasId;
	}
    
    
}