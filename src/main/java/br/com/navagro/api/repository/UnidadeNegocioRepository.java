package br.com.navagro.api.repository;

import br.com.navagro.api.entity.UnidadeNegocioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeNegocioRepository extends JpaRepository<UnidadeNegocioEntity, Integer> {
    // Aqui você pode criar consultas customizadas depois, se quiser
}