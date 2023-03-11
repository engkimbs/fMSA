package com.engkimbs.sharedservice.config;

import com.engkimbs.sharedservice.api.dto.AreaMstRequest;
import com.engkimbs.sharedservice.domain.entity.AreaMst;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SharedServiceMapper {

    SharedServiceMapper INSTANCE = Mappers.getMapper(SharedServiceMapper.class);

    @Mappings({
            @Mapping(source = "user", target = "createdBy"),
            @Mapping(source = "user", target = "lastModifiedBy")
    })
    AreaMst toAreaMst(AreaMstRequest areaMstRequest);
}
