package br.com.navagro.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class EnderecosDTO {
    private Integer id;
    private Integer systemUserId;
    private Integer locCepsId;
    private String endDescricao;
    private String endNumero;
    private String endPadrao;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSystemUserId() {
		return systemUserId;
	}
	public void setSystemUserId(Integer systemUserId) {
		this.systemUserId = systemUserId;
	}
	public Integer getLocCepsId() {
		return locCepsId;
	}
	public void setLocCepsId(Integer locCepsId) {
		this.locCepsId = locCepsId;
	}
	public String getEndDescricao() {
		return endDescricao;
	}
	public void setEndDescricao(String endDescricao) {
		this.endDescricao = endDescricao;
	}
	public String getEndNumero() {
		return endNumero;
	}
	public void setEndNumero(String endNumero) {
		this.endNumero = endNumero;
	}
	public String getEndPadrao() {
		return endPadrao;
	}
	public void setEndPadrao(String endPadrao) {
		this.endPadrao = endPadrao;
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