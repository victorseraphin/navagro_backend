package br.com.navagro.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "mao_obra")
public class MaoObraEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "descricao", length = 200, nullable = false)
    private String descricao;

    @Column(name = "system_unit_id", nullable = false)
    private Integer systemUnitId;

    @Column(name = "centro_custos_id")
    private Integer centroCustosId;

    @Column(name = "prolabore", length = 1, nullable = false)
    private String prolabore = "S";

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

	public Integer getCentroCustosId() {
		return centroCustosId;
	}

	public void setCentroCustosId(Integer centroCustosId) {
		this.centroCustosId = centroCustosId;
	}

	public String getProlabore() {
		return prolabore;
	}

	public void setProlabore(String prolabore) {
		this.prolabore = prolabore;
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
