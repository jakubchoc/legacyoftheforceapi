package com.game.legacyoftheforce.dto.mapper;

import com.game.legacyoftheforce.dto.CharacterDTO;
import com.game.legacyoftheforce.entity.CharacterEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CharacterMapperImpl implements CharacterMapper {

    @Override
    public CharacterEntity toEntity(CharacterDTO characterDTO) {
        if ( characterDTO == null ) {
            return null;
        }

        CharacterEntity characterEntity = new CharacterEntity();

        characterEntity.setId( characterDTO.getId() );
        characterEntity.setName( characterDTO.getName() );
        characterEntity.setRace( characterDTO.getRace() );
        characterEntity.setProfilePhoto( characterDTO.getProfilePhoto() );

        return characterEntity;
    }

    @Override
    public CharacterDTO toDTO(CharacterEntity characterEntity) {
        if ( characterEntity == null ) {
            return null;
        }

        CharacterDTO characterDTO = new CharacterDTO();

        characterDTO.setId( characterEntity.getId() );
        characterDTO.setName( characterEntity.getName() );
        characterDTO.setRace( characterEntity.getRace() );
        characterDTO.setProfilePhoto( characterEntity.getProfilePhoto() );

        return characterDTO;
    }
}
