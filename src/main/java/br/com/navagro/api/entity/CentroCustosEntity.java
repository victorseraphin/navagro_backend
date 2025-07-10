package br.com.navagro.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "centro_custos")
public class CentroCustosEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "codigo", length = 6)
    private String codigo;

    @Column(name = "descricao", length = 200, nullable = false)
    private String descricao;

    @Column(name = "system_unit_id", nullable = false)
    private Integer systemUnitId;

    @Column(name = "centro_custos_id")
    private Integer centroCustosId;

    @Column(name = "porcentagem", precision = 18, scale = 2, nullable = false)
    private BigDecimal porcentagem;

    @Column(name = "grupo_dre", nullable = false)
    private Integer grupoDre;

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

	public Integer getCentroCustosId() {
		return centroCustosId;
	}

	public void setCentroCustosId(Integer centroCustosId) {
		this.centroCustosId = centroCustosId;
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
