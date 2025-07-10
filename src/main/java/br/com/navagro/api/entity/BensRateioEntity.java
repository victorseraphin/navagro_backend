package br.com.navagro.api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "bens_rateio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BensRateioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bens_id", nullable = false)
    private BemEntity bens;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "system_unit_id", nullable = false)
    private SystemUnitEntity systemUnit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unidade_negocio_id", nullable = false)
    private UnidadeNegocioEntity unidadeNegocio;

    @Column(nullable = false, precision = 18, scale = 2)
    private BigDecimal porcentagem;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BemEntity getBens() {
		return bens;
	}
	public void setBens(BemEntity bens) {
		this.bens = bens;
	}
	public SystemUnitEntity getSystemUnit() {
		return systemUnit;
	}
	public void setSystemUnit(SystemUnitEntity systemUnit) {
		this.systemUnit = systemUnit;
	}
	public UnidadeNegocioEntity getUnidadeNegocio() {
		return unidadeNegocio;
	}
	public void setUnidadeNegocio(UnidadeNegocioEntity unidadeNegocio) {
		this.unidadeNegocio = unidadeNegocio;
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
    

