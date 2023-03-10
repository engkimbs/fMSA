package com.engkimbs.sharedservice.api;

import com.engkimbs.sharedservice.domain.entity.AreaMst;
import com.engkimbs.sharedservice.service.query.SharedQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SharedServiceRestApi {

    SharedQueryService sharedQueryService;

    public SharedServiceRestApi(SharedQueryService sharedQueryService) {
        this.sharedQueryService = sharedQueryService;
    }

    @GetMapping("/shared/{id}")
    public AreaMst getAreaMst(@PathVariable Long id) {
        return sharedQueryService.getAreaMstById(id);
    }
}
