package com.engkimbs.sharedservice.api;

import com.engkimbs.sharedservice.domain.entity.AreaMst;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SharedServiceRestApi {

    @GetMapping
    public AreaMst getAreaMst(String id) {

        return null;
    }
}
