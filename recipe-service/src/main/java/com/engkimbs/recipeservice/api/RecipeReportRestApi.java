package com.engkimbs.recipeservice.api;

import com.engkimbs.recipeservice.api.dto.RMSHistoryRequest;
import com.engkimbs.recipeservice.config.RecipeServiceMapper;
import com.engkimbs.recipeservice.domain.entity.RMSHistory;
import com.engkimbs.recipeservice.service.command.RecipeReportCommandService;
import com.engkimbs.recipeservice.service.query.RecipeReportQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class RecipeReportRestApi {

    RecipeReportQueryService recipeReportQueryService;

    RecipeReportCommandService recipeReportCommandService;

    public RecipeReportRestApi(
            RecipeReportQueryService recipeReportQueryService,
            RecipeReportCommandService recipeReportCommandService) {
        this.recipeReportQueryService = recipeReportQueryService;
        this.recipeReportCommandService = recipeReportCommandService;
    }

    @GetMapping("/recipe/history/{id}")
    public RMSHistory getRmsHistoryById(@PathVariable("id") Long id) {
        return recipeReportQueryService.getRMSHistoryById(id);
    }

    @PostMapping("/recipe/history/save")
    public RMSHistory saveRmsHistory(@RequestBody RMSHistoryRequest rmsHistoryRequest) {
        return recipeReportCommandService.saveRMSHistory(RecipeServiceMapper.INSTANCE.toRMSHistory(rmsHistoryRequest));
    }
}