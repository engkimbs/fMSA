package com.engkimbs.recipeservice.domain.entity.vo;

import jakarta.persistence.Embeddable;

@Embeddable
public class RMSInterlock {

    Boolean SA;

    Boolean LB;

    Boolean DC;

    Boolean FA;
}
