package com.engkimbs.recipeservice.api;

import com.engkimbs.recipeservice.api.dto.RecipeResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RecipeRestApi {

    @GetMapping("/{id}")
    public RecipeResponse findById(@PathVariable("id") Long id) {
        log.info("EC data find : id={}", id);
        return null;
    }
}
