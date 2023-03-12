package com.engkimbs.recipeservice.service.command;

import com.engkimbs.recipeservice.domain.entity.RMSHistory;
import com.engkimbs.recipeservice.infra.db.RecipeServiceMongoRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeReportCommandService {

    RecipeServiceMongoRepository recipeServiceMongoRepository;

    public RecipeReportCommandService(RecipeServiceMongoRepository recipeServiceMongoRepository) {
        this.recipeServiceMongoRepository = recipeServiceMongoRepository;
    }

    public RMSHistory saveRMSHistory(RMSHistory rmsHistory) {
        return recipeServiceMongoRepository.save(rmsHistory);
    }

    public RMSHistory getRMSHistoryById(Long id) {
        return recipeServiceMongoRepository.findById(id).orElse(null);
    }
}