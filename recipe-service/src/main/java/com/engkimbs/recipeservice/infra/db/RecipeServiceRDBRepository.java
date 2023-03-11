package com.engkimbs.recipeservice.infra.db;

import com.engkimbs.recipeservice.domain.entity.RMSMst;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeServiceRDBRepository extends JpaRepository<RMSMst, Long> {
}
