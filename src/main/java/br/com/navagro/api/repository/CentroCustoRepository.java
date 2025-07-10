package br.com.navagro.api.repository;

import br.com.navagro.api.entity.CentroCustosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentroCustoRepository extends JpaRepository<CentroCustosEntity, Integer> {
    // Aqui você pode criar consultas customizadas depois, se quiser
}