package com.engkimbs.sharedservice.service.query;

import com.engkimbs.sharedservice.domain.entity.AreaMst;
import com.engkimbs.sharedservice.infra.db.SharedServiceRDBRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SharedQueryService {

    SharedServiceRDBRepository sharedServiceRDBRepository;

    public SharedQueryService(SharedServiceRDBRepository sharedServiceRDBRepository) {
        this.sharedServiceRDBRepository = sharedServiceRDBRepository;
    }

    @Transactional(readOnly = true)
    public AreaMst getAreaMstById(Long id) {
        return sharedServiceRDBRepository.findById(id).orElse(null);
    }
}
