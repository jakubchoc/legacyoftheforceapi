package com.game.legacyoftheforce.service;

import com.game.legacyoftheforce.dto.CharacterDTO;
import com.game.legacyoftheforce.dto.mapper.CharacterMapper;
import com.game.legacyoftheforce.entity.CharacterEntity;
import com.game.legacyoftheforce.entity.repository.CharacterRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class CharacterServiceImpl implements CharacterService {

    private final CharacterMapper characterMapper;
    private final CharacterRepository characterRepository;

    @Override
    public CharacterDTO getCharacter(Long characterId) {
        CharacterEntity entity = characterRepository.findById(characterId)
                .orElseThrow(EntityNotFoundException::new);
        return characterMapper.toDTO(entity);
    }

    @Override
    public CharacterDTO createCharacter(CharacterDTO characterDTO) {
        CharacterEntity entity = characterMapper.toEntity(characterDTO);
        characterRepository.save(entity);
        return characterMapper.toDTO(entity);
    }
}
