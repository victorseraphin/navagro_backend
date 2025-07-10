package br.com.navagro.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class CentroLucrosDTO {
    private Integer id;
    private String codigo;
    private String descricao;
    private Integer systemUnitId;
    private Integer centroLucrosId;
    private BigDecimal porcentagem;
    private Integer grupoDre;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getSystemUnitId() {
		return systemUnitId;
	}
	public void setSystemUnitId(Integer systemUnitId) {
		this.systemUnitId = systemUnitId;
	}
	public Integer getCentroLucrosId() {
		return centroLucrosId;
	}
	public void setCentroLucrosId(Integer centroLucrosId) {
		this.centroLucrosId = centroLucrosId;
	}
	public BigDecimal getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(BigDecimal porcentagem) {
		this.porcentagem = porcentagem;
	}
	public Integer getGrupoDre() {
		return grupoDre;
	}
	public void setGrupoDre(Integer grupoDre) {
		this.grupoDre = grupoDre;
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