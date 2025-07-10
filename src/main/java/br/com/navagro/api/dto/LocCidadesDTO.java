package br.com.navagro.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class LocCidadesDTO {
    private Integer id;
    private Integer codIbge;
    private String cidNome;
    private Integer estId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCodIbge() {
		return codIbge;
	}
	public void setCodIbge(Integer codIbge) {
		this.codIbge = codIbge;
	}
	public String getCidNome() {
		return cidNome;
	}
	public void setCidNome(String cidNome) {
		this.cidNome = cidNome;
	}
	public Integer getEstId() {
		return estId;
	}
	public void setEstId(Integer estId) {
		this.estId = estId;
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