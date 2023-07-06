package com.game.legacyoftheforce.dto.mapper;

import com.game.legacyoftheforce.dto.CharacterDTO;
import com.game.legacyoftheforce.entity.CharacterEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CharacterMapper {

    CharacterEntity toEntity(CharacterDTO characterDTO);

    CharacterDTO toDTO(CharacterEntity characterEntity);
}
