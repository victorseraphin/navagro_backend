package br.com.navagro.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "mao_obra_rateio")
public class MaoObraRateioEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "mao_obra_id", nullable = false)
    private Integer maoObraId;

    @Column(name = "system_unit_id", nullable = false)
    private Integer systemUnitId;

    @Column(name = "unidade_negocio_id", nullable = false)
    private Integer unidadeNegocioId;

    @Column(name = "porcentagem", precision = 18, scale = 2, nullable = false)
    private BigDecimal porcentagem;

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
