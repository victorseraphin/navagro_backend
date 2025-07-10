package br.com.navagro.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class LocCepsDTO {
    private Integer id;
    private Integer cidId;
    private String ruaNome;
    private String bairroNome;
    private String unidade;
    private String codIbge;
    private String gia;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCidId() {
		return cidId;
	}
	public void setCidId(Integer cidId) {
		this.cidId = cidId;
	}
	public String getRuaNome() {
		return ruaNome;
	}
	public void setRuaNome(String ruaNome) {
		this.ruaNome = ruaNome;
	}
	public String getBairroNome() {
		return bairroNome;
	}
	public void setBairroNome(String bairroNome) {
		this.bairroNome = bairroNome;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getCodIbge() {
		return codIbge;
	}
	public void setCodIbge(String codIbge) {
		this.codIbge = codIbge;
	}
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
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