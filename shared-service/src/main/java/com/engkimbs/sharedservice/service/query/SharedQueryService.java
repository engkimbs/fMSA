package com.engkimbs.sharedservice.service.query;

import com.engkimbs.sharedservice.domain.entity.AreaMst;
import com.engkimbs.sharedservice.infra.db.SharedServiceRepository;
import org.springframework.stereotype.Service;

@Service
public class SharedQueryService {

    SharedServiceRepository sharedServiceRepository;

    public SharedQueryService(SharedServiceRepository sharedServiceRepository) {
        this.sharedServiceRepository = sharedServiceRepository;
    }

    public AreaMst getAreaMstById(Long id) {
        return sharedServiceRepository.findById(id).orElse(null);
    }
}
