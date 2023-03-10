package com.engkimbs.recipeservice.service.query;

import com.engkimbs.recipeservice.domain.entity.RMSMst;
import com.engkimbs.recipeservice.infra.db.RecipeServiceRDBRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class RecipeQueryService {

    RecipeServiceRDBRepository recipeServiceRDBRepository;

    public RecipeQueryService(RecipeServiceRDBRepository recipeServiceRDBRepository) {
        this.recipeServiceRDBRepository = recipeServiceRDBRepository;
    }

    public RMSMst getRMSMstById(Long id) {
        return recipeServiceRDBRepository.findById(id).orElse(null);
    }
}
