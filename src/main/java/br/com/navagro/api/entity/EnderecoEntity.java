package br.com.navagro.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "enderecos")
public class EnderecoEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "system_user_id")
    private Integer systemUserId;

    @Column(name = "loc_ceps_id")
    private Integer locCepsId;

    @Column(name = "end_descricao", length = 200, nullable = false)
    private String endDescricao;

    @Column(name = "end_numero", length = 8, nullable = false)
    private String endNumero;

    @Column(name = "end_padrao", length = 1, nullable = false)
    private String endPadrao;

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
