package br.com.navagro.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "loc_estados")
public class LocEstadoEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "est_nome", length = 255, nullable = false)
    private String estNome;

    @Column(name = "est_uf", length = 255, nullable = false)
    private String estUf;

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

	public String getEstNome() {
		return estNome;
	}

	public void setEstNome(String estNome) {
		this.estNome = estNome;
	}

	public String getEstUf() {
		return estUf;
	}

	public void setEstUf(String estUf) {
		this.estUf = estUf;
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
