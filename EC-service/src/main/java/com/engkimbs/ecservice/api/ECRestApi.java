package com.engkimbs.ecservice.api;

import com.engkimbs.ecservice.api.dto.ECResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ECRestApi {

    @GetMapping("/{id}")
    public ECResponse findById(@PathVariable("id") Long id) {
        log.info("EC data find : id={}", id);
        return null;
    }
}
