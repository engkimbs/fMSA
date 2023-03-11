package com.engkimbs.sharedservice.config;

import com.engkimbs.sharedservice.api.dto.AreaMstRequest;
import com.engkimbs.sharedservice.domain.entity.AreaMst;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AreaMstMapper {

    AreaMstMapper INSTANCE = Mappers.getMapper(AreaMstMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "area", target = "area"),
            @Mapping(source = "description", target = "description")
    })
    AreaMst toAreaMst(AreaMstRequest areaMstRequest);
}
