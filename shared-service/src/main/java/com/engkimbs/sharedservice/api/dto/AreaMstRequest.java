package com.engkimbs.sharedservice.api.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AreaMstRequest {

    Long id;

    String area;

    String description;
}