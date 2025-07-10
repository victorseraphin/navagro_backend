package br.com.navagro.api.mapper;

import br.com.navagro.api.dto.BensDepreciacaoDTO;
import br.com.navagro.api.entity.BensDepreciacaoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BensDepreciacaoMapper {
    BensDepreciacaoMapper INSTANCE = Mappers.getMapper(BensDepreciacaoMapper.class);

    BensDepreciacaoDTO toDTO(BensDepreciacaoEntity bemDepreciacao);
    BensDepreciacaoEntity toEntity(BensDepreciacaoDTO bemDepreciacaoDTO);
}
