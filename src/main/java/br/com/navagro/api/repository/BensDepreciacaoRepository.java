package br.com.navagro.api.repository;

import br.com.navagro.api.entity.BensDepreciacaoEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BensDepreciacaoRepository extends JpaRepository<BensDepreciacaoEntity, Integer> {
	List<BensDepreciacaoEntity> findByBensId(Integer bensId);
}