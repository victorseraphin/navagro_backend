package br.com.navagro.api.mapper;

import br.com.navagro.api.dto.BensRateioDTO;
import br.com.navagro.api.entity.BensRateioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BensRateioMapper {
    BensRateioMapper INSTANCE = Mappers.getMapper(BensRateioMapper.class);

    BensRateioDTO toDTO(BensRateioEntity bemRateio);
    BensRateioEntity toEntity(BensRateioDTO bemRateioDTO);
}