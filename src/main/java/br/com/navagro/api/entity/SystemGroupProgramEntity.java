package br.com.navagro.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "system_group_program")
public class SystemGroupProgramEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "system_group_id")
    private Integer systemGroupId;

    @Column(name = "system_program_id")
    private Integer systemProgramId;

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

	public Integer getSystemGroupId() {
		return systemGroupId;
	}

	public void setSystemGroupId(Integer systemGroupId) {
		this.systemGroupId = systemGroupId;
	}

	public Integer getSystemProgramId() {
		return systemProgramId;
	}

	public void setSystemProgramId(Integer systemProgramId) {
		this.systemProgramId = systemProgramId;
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
