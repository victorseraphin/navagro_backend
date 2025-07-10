package br.com.navagro.api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "bens_depreciacao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BensDepreciacaoEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "bens_id")
    private BemEntity bens;

    @ManyToOne
    @JoinColumn(name = "centro_custos_id")
    private CentroCustosEntity centroCustos;

    @ManyToOne
    @JoinColumn(name = "system_unit_id")
    private SystemUnitEntity systemUnit;
    
    @Column(name = "valor", precision = 18, scale = 2)
    private BigDecimal valor;

    @Column(name = "depreciacao", precision = 18, scale = 2)
    private BigDecimal depreciacao;

    @Column(name = "diferenca", precision = 18, scale = 2)
    private BigDecimal diferenca;

    private LocalDate data;

    private Integer mes;

    private Integer ano;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;

    @Column(name = "deleted_at")
    private LocalDate deletedAt;

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

	public CentroCustosEntity getCentroCustos() {
		return centroCustos;
	}

	public void setCentroCustos(CentroCustosEntity centroCustos) {
		this.centroCustos = centroCustos;
	}

	public SystemUnitEntity getSystemUnit() {
		return systemUnit;
	}

	public void setSystemUnit(SystemUnitEntity systemUnit) {
		this.systemUnit = systemUnit;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(BigDecimal depreciacao) {
		this.depreciacao = depreciacao;
	}

	public BigDecimal getDiferenca() {
		return diferenca;
	}

	public void setDiferenca(BigDecimal diferenca) {
		this.diferenca = diferenca;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}

	public LocalDate getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(LocalDate deletedAt) {
		this.deletedAt = deletedAt;
	}
    
    

}