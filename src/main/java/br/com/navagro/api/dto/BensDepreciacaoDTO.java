package br.com.navagro.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class BensDepreciacaoDTO {
    private Integer id;
    private Integer bensId;
    private Integer systemUnitId;
    private LocalDate data;
    private String mes;
    private String ano;
    private BigDecimal valor;
    private BigDecimal depreciacao;
    private BigDecimal diferenca;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private Integer centroCustosId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBensId() {
		return bensId;
	}
	public void setBensId(Integer bensId) {
		this.bensId = bensId;
	}
	public Integer getSystemUnitId() {
		return systemUnitId;
	}
	public void setSystemUnitId(Integer systemUnitId) {
		this.systemUnitId = systemUnitId;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public BigDecimal getDepreciacao() {
		return depreciacao;
	}
	public void setDepreciacao(BigDecimal depreciacao) {
		this.depreciacao = depreciacao;
	}
	public BigDecimal getDiferenca() {
		return diferenca;
	}
	public void setDiferenca(BigDecimal diferenca) {
		this.diferenca = diferenca;
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
	public Integer getCentroCustosId() {
		return centroCustosId;
	}
	public void setCentroCustosId(Integer centroCustosId) {
		this.centroCustosId = centroCustosId;
	}
    
    
}