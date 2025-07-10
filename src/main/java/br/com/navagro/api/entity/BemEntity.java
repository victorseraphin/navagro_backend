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
@Table(name = "bens")
public class BemEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;  // Usando Integer pois no MySQL é int(10) unsigned sem auto_increment

    @Column(name = "descricao", length = 200, nullable = false)
    private String descricao;

    @Column(name = "unidade", length = 255, nullable = false)
    private String unidade;

    @Column(name = "quantidade", precision = 18, scale = 2)
    private BigDecimal quantidade;

    @Column(name = "valor_novo", precision = 18, scale = 2)
    private BigDecimal valorNovo;

    @Column(name = "valor_sucata", precision = 18, scale = 2)
    private BigDecimal valorSucata;

    @Column(name = "vida_util")
    private Integer vidaUtil;

    @Column(name = "depreciacao_anual", precision = 18, scale = 2)
    private BigDecimal depreciacaoAnual;

    @Column(name = "depreciacao_mensal", precision = 18, scale = 2)
    private BigDecimal depreciacaoMensal;

    @Column(name = "system_unit_id", nullable = false)
    private Integer systemUnitId;

    @Column(name = "centro_custos_id", nullable = false)
    private Integer centroCustosId;

    @Column(name = "data_ini")
    private LocalDate dataIni;

    @Column(name = "data_fin")
    private LocalDate dataFin;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "km_atual", precision = 18, scale = 2)
    private BigDecimal kmAtual;

    @Column(name = "vida_util2", precision = 18, scale = 2)
    private BigDecimal vidaUtil2;

    @Column(name = "ultimo_lancamento")
    private LocalDate ultimoLancamento;

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

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorNovo() {
		return valorNovo;
	}

	public void setValorNovo(BigDecimal valorNovo) {
		this.valorNovo = valorNovo;
	}

	public BigDecimal getValorSucata() {
		return valorSucata;
	}

	public void setValorSucata(BigDecimal valorSucata) {
		this.valorSucata = valorSucata;
	}

	public Integer getVidaUtil() {
		return vidaUtil;
	}

	public void setVidaUtil(Integer vidaUtil) {
		this.vidaUtil = vidaUtil;
	}

	public BigDecimal getDepreciacaoAnual() {
		return depreciacaoAnual;
	}

	public void setDepreciacaoAnual(BigDecimal depreciacaoAnual) {
		this.depreciacaoAnual = depreciacaoAnual;
	}

	public BigDecimal getDepreciacaoMensal() {
		return depreciacaoMensal;
	}

	public void setDepreciacaoMensal(BigDecimal depreciacaoMensal) {
		this.depreciacaoMensal = depreciacaoMensal;
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

	public LocalDate getDataIni() {
		return dataIni;
	}

	public void setDataIni(LocalDate dataIni) {
		this.dataIni = dataIni;
	}

	public LocalDate getDataFin() {
		return dataFin;
	}

	public void setDataFin(LocalDate dataFin) {
		this.dataFin = dataFin;
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

	public BigDecimal getKmAtual() {
		return kmAtual;
	}

	public void setKmAtual(BigDecimal kmAtual) {
		this.kmAtual = kmAtual;
	}

	public BigDecimal getVidaUtil2() {
		return vidaUtil2;
	}

	public void setVidaUtil2(BigDecimal vidaUtil2) {
		this.vidaUtil2 = vidaUtil2;
	}

	public LocalDate getUltimoLancamento() {
		return ultimoLancamento;
	}

	public void setUltimoLancamento(LocalDate ultimoLancamento) {
		this.ultimoLancamento = ultimoLancamento;
	}
    
    

}
