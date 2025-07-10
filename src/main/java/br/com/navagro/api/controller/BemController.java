package br.com.navagro.api.controller;

import br.com.navagro.api.dto.BemDTO;
import br.com.navagro.api.dto.BensDepreciacaoDTO;
import br.com.navagro.api.dto.BensRateioDTO;
import br.com.navagro.api.entity.BemEntity;
import br.com.navagro.api.repository.BemRepository;
import br.com.navagro.api.service.BemService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cadastros/bens")
@RequiredArgsConstructor
public class BemController {
	
	@Autowired
    private BemService bemService;

    @GetMapping
    //@PreAuthorize("hasAuthority('cadastros.bens.listar')")
    public List<BemDTO> listarTodos() {
        return bemService.listarTodos();
    }

    @GetMapping("/{id}")
    //@PreAuthorize("hasAuthority('cadastros.bens.editar')")
    public BemDTO buscarPorId(@PathVariable Integer id) {
        return bemService.buscarPorId(id);
    }

    @PostMapping
    //@PreAuthorize("hasAuthority('cadastros.bens.salvar')")
    public ResponseEntity<BemDTO> salvar(@RequestBody @Valid BemDTO dto) {
        return ResponseEntity.ok(bemService.salvar(dto));
    }

    @PutMapping("/{id}")
    //@PreAuthorize("hasAuthority('cadastros.bens.atualizar')")
    public ResponseEntity<BemDTO> atualizar(@PathVariable Integer id, @RequestBody @Valid BemDTO dto) {
        return ResponseEntity.ok(bemService.atualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('cadastros.bens.deletar')")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        bemService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    // Rateio
    @GetMapping("/{id}/rateio")
    public List<BensRateioDTO> listarRateios(@PathVariable Integer id) {
        return bemService.listarRateioPorBem(id);
    }

    @PostMapping("/{id}/rateio")
    public ResponseEntity<BensRateioDTO> salvarRateio(@PathVariable Integer id, @RequestBody BensRateioDTO dto) {
        return ResponseEntity.ok(bemService.salvarRateio(id, dto));
    }

    @DeleteMapping("/rateio/{id}")
    public ResponseEntity<Void> deletarRateio(@PathVariable Integer id) {
        bemService.deletarRateio(id);
        return ResponseEntity.noContent().build();
    }

    // Depreciação
    @GetMapping("/{id}/depreciacao")
    public List<BensDepreciacaoDTO> listarDepreciacoes(@PathVariable Integer id) {
        return bemService.listarDepreciacaoPorBem(id);
    }

    @PostMapping("/{id}/depreciacao")
    public ResponseEntity<BensDepreciacaoDTO> salvarDepreciacao(@PathVariable Integer id, @RequestBody BensDepreciacaoDTO dto) {
        return ResponseEntity.ok(bemService.salvarDepreciacao(id, dto));
    }

    @DeleteMapping("/depreciacao/{id}")
    public ResponseEntity<Void> deletarDepreciacao(@PathVariable Integer id) {
        bemService.deletarDepreciacao(id);
        return ResponseEntity.noContent().build();
    }
}
