package com.game.legacyoftheforce.entity;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RaceEntity.class)
public abstract class RaceEntity_ {

	public static volatile ListAttribute<RaceEntity, CharacterEntity> entities;
	public static volatile SingularAttribute<RaceEntity, String> raceName;
	public static volatile SingularAttribute<RaceEntity, Long> id;

	public static final String ENTITIES = "entities";
	public static final String RACE_NAME = "raceName";
	public static final String ID = "id";

}

