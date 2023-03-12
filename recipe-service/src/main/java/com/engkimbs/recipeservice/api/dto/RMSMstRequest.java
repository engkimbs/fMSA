package com.engkimbs.recipeservice.api.dto;

import com.engkimbs.recipeservice.domain.entity.vo.RMSInterlock;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RMSMstRequest {

    Long id;

    String line;

    String area;

    String maker;

    String eqpModel;

    String eqpId;

    String rmsModel;

    Boolean sa;

    Boolean lb;

    Boolean dc;

    Boolean fa;

    String user;
}
