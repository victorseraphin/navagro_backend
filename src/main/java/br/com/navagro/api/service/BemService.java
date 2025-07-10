package br.com.navagro.api.service;

import java.util.List;

import br.com.navagro.api.dto.BemDTO;
import br.com.navagro.api.dto.BensDepreciacaoDTO;
import br.com.navagro.api.dto.BensRateioDTO;

public interface BemService {
    List<BemDTO> listarTodos();
    BemDTO buscarPorId(Integer id);
    BemDTO salvar(BemDTO bemDTO);
    BemDTO atualizar(Integer id, BemDTO bemDTO);
    void deletar(Integer id);
    
    // Rateio
    List<BensRateioDTO> listarRateioPorBem(Integer bemId);
    BensRateioDTO salvarRateio(Integer bemId, BensRateioDTO rateioDTO);
    void deletarRateio(Integer rateioId);
    
    // Depreciação
    List<BensDepreciacaoDTO> listarDepreciacaoPorBem(Integer bemId);
    BensDepreciacaoDTO salvarDepreciacao(Integer bemId, BensDepreciacaoDTO depreciacaoDTO);
    void deletarDepreciacao(Integer depreciacaoId);
}
