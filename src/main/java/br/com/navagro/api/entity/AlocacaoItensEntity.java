package br.com.navagro.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "alocacao_itens")
public class AlocacaoItensEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "alocacao_id", nullable = false)
    private Integer alocacaoId;

    @Column(name = "valor_unit", nullable = false, precision = 18, scale = 2)
    private BigDecimal valorUnit;

    @Column(name = "valor_total", nullable = false, precision = 18, scale = 2)
    private BigDecimal valorTotal;

    @Column(name = "qtd", nullable = false, precision = 18, scale = 2)
    private BigDecimal qtd;

    @Column(name = "unidade", nullable = false, length = 5)
    private String unidade;

    @Column(name = "centro_custos_id", nullable = false)
    private Integer centroCustosId;

    @Column(name = "centro_lucros_id", nullable = false)
    private Integer centroLucrosId;

    @Column(name = "insumos_id", nullable = false)
    private Integer insumosId;

    @Column(name = "unidade_negocio_id", nullable = false)
    private Integer unidadeNegocioId;

    @Column(name = "system_unit_id", nullable = false)
    private Integer systemUnitId;

    @Column(name = "tipo", nullable = false, length = 255)
    private String tipo;

    @Column(name = "tes", nullable = false, length = 1)
    private String tes;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "pessoas_id", nullable = false)
    private Integer pessoasId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAlocacaoId() {
		return alocacaoId;
	}

	public void setAlocacaoId(Integer alocacaoId) {
		this.alocacaoId = alocacaoId;
	}

	public BigDecimal getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(BigDecimal valorUnit) {
		this.valorUnit = valorUnit;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public BigDecimal getQtd() {
		return qtd;
	}

	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public Integer getCentroCustosId() {
		return centroCustosId;
	}

	public void setCentroCustosId(Integer centroCustosId) {
		this.centroCustosId = centroCustosId;
	}

	public Integer getCentroLucrosId() {
		return centroLucrosId;
	}

	public void setCentroLucrosId(Integer centroLucrosId) {
		this.centroLucrosId = centroLucrosId;
	}

	public Integer getInsumosId() {
		return insumosId;
	}

	public void setInsumosId(Integer insumosId) {
		this.insumosId = insumosId;
	}

	public Integer getUnidadeNegocioId() {
		return unidadeNegocioId;
	}

	public void setUnidadeNegocioId(Integer unidadeNegocioId) {
		this.unidadeNegocioId = unidadeNegocioId;
	}

	public Integer getSystemUnitId() {
		return systemUnitId;
	}

	public void setSystemUnitId(Integer systemUnitId) {
		this.systemUnitId = systemUnitId;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTes() {
		return tes;
	}

	public void setTes(String tes) {
		this.tes = tes;
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Integer getPessoasId() {
		return pessoasId;
	}

	public void setPessoasId(Integer pessoasId) {
		this.pessoasId = pessoasId;
	}
    
    

}
