package com.game.legacyoftheforce.service;

import com.game.legacyoftheforce.dto.CharacterDTO;


public interface CharacterService {

    CharacterDTO getCharacter(Long characterId);

    CharacterDTO createCharacter(CharacterDTO characterDTO);

}
