package com.engkimbs.recipeservice.domain.entity.vo;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access=AccessLevel.PUBLIC)
@AllArgsConstructor
@Builder
public class RMSInterlock {

    Boolean SA;

    Boolean LB;

    Boolean DC;

    Boolean FA;
}
