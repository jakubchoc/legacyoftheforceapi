package com.game.legacyoftheforce.controller;

import com.game.legacyoftheforce.dto.CharacterDTO;
import com.game.legacyoftheforce.service.CharacterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping("/character")
    public CharacterDTO getCharacter(@PathVariable Long characterId) {
        return characterService.getCharacter(characterId);
    }

    @PostMapping("/character")
    public CharacterDTO createCharacter(@RequestBody CharacterDTO characterDTO) {
        return characterService.createCharacter(characterDTO);
    }

}
