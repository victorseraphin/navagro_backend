package br.com.navagro.api.serviceImp;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.navagro.api.dto.BemDTO;
import br.com.navagro.api.dto.BensDepreciacaoDTO;
import br.com.navagro.api.dto.BensRateioDTO;
import br.com.navagro.api.entity.BemEntity;
import br.com.navagro.api.entity.BensDepreciacaoEntity;
import br.com.navagro.api.entity.BensRateioEntity;
import br.com.navagro.api.exception.ResourceNotFoundException;
import br.com.navagro.api.mapper.BemMapper;
import br.com.navagro.api.mapper.BensDepreciacaoMapper;
import br.com.navagro.api.mapper.BensRateioMapper;
import br.com.navagro.api.repository.BemRepository;
import br.com.navagro.api.repository.BensDepreciacaoRepository;
import br.com.navagro.api.repository.BensRateioRepository;
import br.com.navagro.api.repository.CentroCustoRepository;
import br.com.navagro.api.repository.UnidadeNegocioRepository;
import br.com.navagro.api.service.BemService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BemServiceImpl implements BemService {

	@Autowired
    private BemRepository bemRepository;
	
	@Autowired
    private CentroCustoRepository centroCustoRepository;
	
	@Autowired
    private UnidadeNegocioRepository unidadeNegocioRepository;
	
	@Autowired
    private BensRateioRepository bemRateioRepository;
	
	@Autowired
    private BensDepreciacaoRepository bemDepreciacaoRepository;

	@Autowired
    private BemMapper bemMapper;
	
	@Autowired
    private BensRateioMapper bemRateioMapper;
	
	@Autowired
    private BensDepreciacaoMapper bemDepreciacaoMapper;

    @Override
    public List<BemDTO> listarTodos() {
        return bemRepository.findAll().stream()
                .map(bemMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public BemDTO buscarPorId(Integer id) {
    	BemEntity entity = bemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bem não encontrado"));
        return bemMapper.toDTO(entity);
    }

    @Override
    @Transactional
    public BemDTO salvar(BemDTO dto) {
        BemEntity entity = bemMapper.toEntity(dto);
        entity.setId(null);
        return bemMapper.toDTO(bemRepository.save(entity));
    }

    @Override
    @Transactional
    public BemDTO atualizar(Integer id, BemDTO dto) {
    	BemEntity entity = bemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bem não encontrado"));

        bemMapper.updateEntityFromDto(dto, entity);
        return bemMapper.toDTO(bemRepository.save(entity));
    }

    @Override
    @Transactional
    public void deletar(Integer id) {
    	BemEntity entity = bemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bem não encontrado"));
        bemRepository.delete(entity);
    }

    @Override
    public List<BensRateioDTO> listarRateioPorBem(Integer bemId) {
        return bemRateioRepository.findByBensId(bemId).stream()
                .map(bemRateioMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public BensRateioDTO salvarRateio(Integer bemId, BensRateioDTO dto) {
        BemEntity bem = bemRepository.findById(bemId)
                .orElseThrow(() -> new ResourceNotFoundException("Bem não encontrado"));

        BensRateioEntity rateio = bemRateioMapper.toEntity(dto);
        rateio.setId(null);
        rateio.setBens(bem);
        return bemRateioMapper.toDTO(bemRateioRepository.save(rateio));
    }

    @Override
    @Transactional
    public void deletarRateio(Integer id) {
        bemRateioRepository.deleteById(id);
    }

    @Override
    public List<BensDepreciacaoDTO> listarDepreciacaoPorBem(Integer bemId) {
        return bemDepreciacaoRepository.findByBensId(bemId).stream()
                .map(bemDepreciacaoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public BensDepreciacaoDTO salvarDepreciacao(Integer bemId, BensDepreciacaoDTO dto) {
        BemEntity bem = bemRepository.findById(bemId)
                .orElseThrow(() -> new ResourceNotFoundException("Bem não encontrado"));

        BensDepreciacaoEntity dep = bemDepreciacaoMapper.toEntity(dto);
        dep.setId(null);
        dep.setBens(bem);
        return bemDepreciacaoMapper.toDTO(bemDepreciacaoRepository.save(dep));
    }

    @Override
    @Transactional
    public void deletarDepreciacao(Integer id) {
        bemDepreciacaoRepository.deleteById(id);
    }
} 