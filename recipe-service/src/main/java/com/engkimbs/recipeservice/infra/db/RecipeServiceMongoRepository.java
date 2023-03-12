package com.engkimbs.recipeservice.infra.db;

import com.engkimbs.recipeservice.domain.entity.RMSHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeServiceMongoRepository extends MongoRepository<RMSHistory, Long> {
}
