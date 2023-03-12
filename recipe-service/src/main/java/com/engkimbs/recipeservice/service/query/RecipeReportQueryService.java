package com.engkimbs.recipeservice.service.query;

import com.engkimbs.recipeservice.domain.entity.RMSHistory;
import com.engkimbs.recipeservice.domain.entity.RMSMst;
import com.engkimbs.recipeservice.infra.db.RecipeServiceMongoRepository;
import com.engkimbs.recipeservice.infra.db.RecipeServiceRDBRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class RecipeReportQueryService {

    RecipeServiceMongoRepository recipeServiceMongoRepository;

    public RecipeReportQueryService(RecipeServiceMongoRepository recipeServiceMongoRepository) {
        this.recipeServiceMongoRepository = recipeServiceMongoRepository;
    }

    public RMSHistory getRMSHistoryById(Long id) {
        return recipeServiceMongoRepository.findById(id).orElse(null);
    }
}
