package com.engkimbs.recipeservice.service.command;

import com.engkimbs.recipeservice.domain.entity.RMSMst;
import com.engkimbs.recipeservice.infra.db.RecipeServiceRDBRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class RecipeCommandService {

    RecipeServiceRDBRepository recipeServiceRDBRepository;

    public RecipeCommandService(RecipeServiceRDBRepository recipeServiceRDBRepository) {
        this.recipeServiceRDBRepository = recipeServiceRDBRepository;
    }

    public RMSMst saveRMSMst(final RMSMst rmsMst) {
        return recipeServiceRDBRepository.save(rmsMst);
    }

    public RMSMst updateRMSMst(final RMSMst rmsMst) {
        Optional<RMSMst> fetchedRMSMst = recipeServiceRDBRepository.findById(rmsMst.getId());
        fetchedRMSMst.ifPresent(fetched -> fetched.updateRMSMst(rmsMst));
        return rmsMst;
    }

    public void deleteRMSMst(Long id) {
        recipeServiceRDBRepository.deleteById(id);
    }
}