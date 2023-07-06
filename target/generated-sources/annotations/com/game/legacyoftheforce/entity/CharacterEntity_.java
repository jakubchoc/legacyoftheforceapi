package com.game.legacyoftheforce.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CharacterEntity.class)
public abstract class CharacterEntity_ {

	public static volatile SingularAttribute<CharacterEntity, String> profilePhoto;
	public static volatile SingularAttribute<CharacterEntity, RaceEntity> race;
	public static volatile SingularAttribute<CharacterEntity, String> name;
	public static volatile SingularAttribute<CharacterEntity, Long> id;

	public static final String PROFILE_PHOTO = "profilePhoto";
	public static final String RACE = "race";
	public static final String NAME = "name";
	public static final String ID = "id";

}

