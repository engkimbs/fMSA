package com.engkimbs.recipeservice.config;

import com.engkimbs.recipeservice.api.dto.RMSMstRequest;
import com.engkimbs.recipeservice.domain.entity.RMSMst;
import com.engkimbs.recipeservice.domain.entity.vo.RMSInterlock;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RecipeServiceMapper {

    RecipeServiceMapper INSTANCE = Mappers.getMapper(RecipeServiceMapper.class);

    @Mappings({
            @Mapping(source = "line", target = "line"),
            @Mapping(source = "area", target = "area"),
            @Mapping(source = "maker", target = "maker"),
            @Mapping(source = "eqpModel", target = "eqpModel"),
            @Mapping(source = "eqpId", target = "eqpId"),
            @Mapping(source = "rmsModel", target = "rmsModel"),
            @Mapping(source = "sa", target = "sa"),
            @Mapping(source = "lb", target = "lb"),
            @Mapping(source = "dc", target = "dc"),
            @Mapping(source = "fa", target = "fa"),
            @Mapping(source = "user", target = "createdBy"),
            @Mapping(source = "user", target = "lastModifiedBy")
    })
    RMSMst toRMSMst(RMSMstRequest areaMstRequest);
}
