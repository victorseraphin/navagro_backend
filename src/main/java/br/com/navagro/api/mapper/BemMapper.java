package br.com.navagro.api.mapper;

import br.com.navagro.api.dto.BemDTO;
import br.com.navagro.api.entity.BemEntity;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BemMapper {
    BemMapper INSTANCE = Mappers.getMapper(BemMapper.class);

    BemDTO toDTO(BemEntity bem);
    BemEntity toEntity(BemDTO bemDTO);
    
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(BemDTO dto, @MappingTarget BemEntity entity);
}
