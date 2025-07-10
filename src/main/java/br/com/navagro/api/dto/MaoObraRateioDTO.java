package br.com.navagro.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class MaoObraRateioDTO {
    private Integer id;
    private Integer maoObraId;
    private Integer systemUnitId;
    private Integer unidadeNegocioId;
    private BigDecimal porcentagem;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMaoObraId() {
		return maoObraId;
	}
	public void setMaoObraId(Integer maoObraId) {
		this.maoObraId = maoObraId;
	}
	public Integer getSystemUnitId() {
		return systemUnitId;
	}
	public void setSystemUnitId(Integer systemUnitId) {
		this.systemUnitId = systemUnitId;
	}
	public Integer getUnidadeNegocioId() {
		return unidadeNegocioId;
	}
	public void setUnidadeNegocioId(Integer unidadeNegocioId) {
		this.unidadeNegocioId = unidadeNegocioId;
	}
	public BigDecimal getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(BigDecimal porcentagem) {
		this.porcentagem = porcentagem;
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
    
    
}