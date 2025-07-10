package br.com.navagro.api.repository;

import br.com.navagro.api.entity.BemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BemRepository extends JpaRepository<BemEntity, Integer> {
    // Aqui você pode criar consultas customizadas depois, se quiser
}