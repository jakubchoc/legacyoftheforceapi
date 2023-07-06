package com.game.legacyoftheforce.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.game.legacyoftheforce.entity.RaceEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class CharacterDTO {

    @JsonProperty("_id")
    private Long id;
    @NotBlank
    private String name;
    private RaceEntity race;
    private String profilePhoto;
}
