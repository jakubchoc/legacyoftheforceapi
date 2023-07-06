package com.game.legacyoftheforce.entity.repository;

import com.game.legacyoftheforce.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {

}
