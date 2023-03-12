package com.engkimbs.sharedservice.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AreaMstRequest {

    @Schema(description = "Area Master ID")
    Long id;

    @Schema(description = "Area")
    String area;

    @Schema(description = "Description for Area")
    String description;

    @Schema(description = "User name(corporate ID)")
    String user;
}