package br.com.navagro.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "loc_ceps")
public class LocCepEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "cid_id", nullable = false)
    private Integer cidId;

    @Column(name = "rua_nome", length = 255, nullable = false)
    private String ruaNome;

    @Column(name = "bairro_nome", length = 255, nullable = false)
    private String bairroNome;

    @Column(name = "unidade", length = 255)
    private String unidade;

    @Column(name = "cod_ibge", length = 255)
    private String codIbge;

    @Column(name = "gia", length = 255)
    private String gia;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
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
