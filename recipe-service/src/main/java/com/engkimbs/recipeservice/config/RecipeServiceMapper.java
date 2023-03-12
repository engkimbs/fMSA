package com.engkimbs.recipeservice.config;

import com.engkimbs.recipeservice.api.dto.RMSHistoryRequest;
import com.engkimbs.recipeservice.api.dto.RMSMstRequest;
import com.engkimbs.recipeservice.domain.entity.RMSHistory;
import com.engkimbs.recipeservice.domain.entity.RMSMst;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RecipeServiceMapper {

    RecipeServiceMapper INSTANCE = Mappers.getMapper(RecipeServiceMapper.class);

    @Mappings({
            @Mapping(source = "sa", target = "interlock.sa"),
            @Mapping(source = "lb", target = "interlock.lb"),
            @Mapping(source = "dc", target = "interlock.dc"),
            @Mapping(source = "fa", target = "interlock.fa"),
            @Mapping(source = "user", target = "createdBy"),
            @Mapping(source = "user", target = "lastModifiedBy")
    })
    RMSMst toRMSMst(RMSMstRequest rmsMstRequest);

    RMSHistory toRMSHistory(RMSHistoryRequest rmsHistoryRequest);
}
