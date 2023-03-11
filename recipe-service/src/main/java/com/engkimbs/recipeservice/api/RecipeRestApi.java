package com.engkimbs.recipeservice.api;

import com.engkimbs.recipeservice.api.dto.RMSMstRequest;
import com.engkimbs.recipeservice.config.RecipeServiceMapper;
import com.engkimbs.recipeservice.domain.entity.RMSMst;
import com.engkimbs.recipeservice.service.command.RecipeCommandService;
import com.engkimbs.recipeservice.service.query.RecipeQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class RecipeRestApi {

    RecipeQueryService recipeQueryService;

    RecipeCommandService recipeCommandService;

    public RecipeRestApi(RecipeQueryService recipeQueryService,
                         RecipeCommandService recipeCommandService) {
        this.recipeQueryService = recipeQueryService;
        this.recipeCommandService = recipeCommandService;
    }

    @GetMapping("/recipe/{id}")
    public RMSMst getRMSMstById(@PathVariable("id") Long id) {
        return recipeQueryService.getRMSMstById(id);
    }

    @PostMapping("/recipe/save")
    public RMSMst saveRmsMst(@RequestBody RMSMstRequest rmsMstRequest) {
        return recipeCommandService.saveRMSMst(RecipeServiceMapper.INSTANCE.toRMSMst(rmsMstRequest));
    }
}
