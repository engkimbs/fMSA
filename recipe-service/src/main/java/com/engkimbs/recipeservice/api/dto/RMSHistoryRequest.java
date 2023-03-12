package com.engkimbs.recipeservice.api.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RMSHistoryRequest {

    String line;

    String area;

    String maker;

    String eqpModel;

    String eqpId;

    String rmsModel;

    Double value;
}
