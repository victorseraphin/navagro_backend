package br.com.navagro.api.repository;

import br.com.navagro.api.entity.BensRateioEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BensRateioRepository extends JpaRepository<BensRateioEntity, Integer> {
	List<BensRateioEntity> findByBensId(Integer bensId);
}