package com.game.legacyoftheforce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "race")
@Setter
@Getter
public class RaceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String raceName;

    @JsonIgnore
    @OneToMany(mappedBy = "race")
    private List<CharacterEntity> entities;

}
