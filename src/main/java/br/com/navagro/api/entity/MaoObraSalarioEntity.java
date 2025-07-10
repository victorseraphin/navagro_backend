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
@Table(name = "mao_obra_salario")
public class MaoObraSalarioEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "mao_obra_id", nullable = false)
    private Integer maoObraId;

    @Column(name = "system_unit_id", nullable = false)
    private Integer systemUnitId;

    @Column(name = "data", nullable = false)
    private LocalDate data;

    @Column(name = "ano", nullable = false)
    private Integer ano;

    @Column(name = "mes", nullable = false)
    private Integer mes;

    @Column(name = "salario", precision = 18, scale = 2, nullable = false)
    private BigDecimal salario;

    @Column(name = "encargos", precision = 18, scale = 2)
    private BigDecimal encargos;

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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public BigDecimal getEncargos() {
		return encargos;
	}

	public void setEncargos(BigDecimal encargos) {
		this.encargos = encargos;
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
